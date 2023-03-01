package net.rossonet.ptalk.engine;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.jeasy.rules.api.Fact;
import org.jeasy.rules.api.Facts;
import org.json.JSONObject;

import net.rossonet.ptalk.ability.grpc.AbilityMessageReply;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.grpc.GrpcCoreService;
import net.rossonet.ptalk.engine.runtime.NextHopRuntimeEngine;
import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHop;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHopSchedulerType;
import net.rossonet.ptalk.engine.runtime.fact.channel.InputMessageFact;
import net.rossonet.ptalk.engine.runtime.fact.channel.OutputMessageFact;
import net.rossonet.ptalk.nlu.grpc.NluMessageReply;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;
import net.rossonet.ptalk.utils.JsonHelper;

public class PTalkEngineRuntime {

	private final HazelcastInstanceBuilder hazelcastInstanceBuilder;

	private final ConfigurationTasksManager configurationTasksManager;

	private final PTalkFactFactory memoryManagerFactFactory;

	private final PTalkFactFactory nextHopManagerFactFactory;

	private final PTalkFactFactory nluCommunicationFactFactory;

	private final PTalkFactFactory channelCommunicationFactFactory;

	private final PTalkFactFactory superManagerFactFactory;

	private final PTalkFactFactory aiManagerFactFactory;

	private final PTalkFactFactory extensionsManagerFactFactory;

	private final PTalkFactFactory abilityCommunicationFactFactory;

	private final PTalkFactFactory[] allPTalkFactFactory;

	private final ExecutionLogger executionLogger;

	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;
	private final GrpcCoreService grpcCoreService;

	private final ExecutorService normalScheduler;

	private final ExecutorService lowScheduler;

	private final ExecutorService hightScheduler;
	private final GlobalConfiguration globalConfiguration;
	private final MemoryManager memoryManager;

	private final NextHopRuntimeEngine nextHopRuntimeEngine;

	public PTalkEngineRuntime(GlobalConfiguration configuration) {
		this.globalConfiguration = configuration;
		hazelcastInstanceBuilder = new HazelcastInstanceBuilder(this);
		configurationTasksManager = new ConfigurationTasksManager(this);
		memoryManagerFactFactory = new MemoryManagerFactFactory(this);
		nextHopManagerFactFactory = new NextHopManagerFactFactory(this);
		nluCommunicationFactFactory = new NluCommunicationFactFactory(this);
		channelCommunicationFactFactory = new ChannelCommunicationFactFactory(this);
		superManagerFactFactory = new SuperManagerFactFactory(this);
		aiManagerFactFactory = new AiManagerFactFactory(this);
		extensionsManagerFactFactory = new ExtensionsManagerFactFactory(this);
		abilityCommunicationFactFactory = new AbilityCommunicationFactFactory(this);
		executionLogger = new ExecutionLogger(this);
		memoryManager = new MemoryManager(this);
		lifecycleStatus = LifecycleStatus.CONFIGURED;
		normalScheduler = Executors.newFixedThreadPool(globalConfiguration.getNormalSchedulerThreadSize());
		lowScheduler = Executors.newSingleThreadExecutor();
		hightScheduler = Executors.newCachedThreadPool();
		grpcCoreService = new GrpcCoreService(this, globalConfiguration.getGrpcServerPort());
		allPTalkFactFactory = new PTalkFactFactory[] { superManagerFactFactory, memoryManagerFactFactory,
				nextHopManagerFactFactory, abilityCommunicationFactFactory, nluCommunicationFactFactory,
				aiManagerFactFactory, extensionsManagerFactFactory, channelCommunicationFactFactory };
		updateConfigurationAllFactories();
		nextHopRuntimeEngine = new NextHopRuntimeEngine(this);
		lifecycleStatus = LifecycleStatus.RUNNING;
	}

	public Future<ChannelMessageReply> channelMessage(ChannelMessageRequest request, boolean async)
			throws TaskManagerException {
		final Fact<InputMessageFact> inputMessageFact = new Fact<>(request.getChannelUniqueMessageId(),
				new InputMessageFact(request));
		final Facts facts = new Facts();
		facts.add(inputMessageFact);
		final Task task = Task.fire(this, new NextHop(NextHopSchedulerType.LOCAL,
				getGlobalConfiguration().getInputChannel(), null, request.getTraceLog()),
				getGlobalConfiguration().getInputChannel(), facts);
		return nextHopRuntimeEngine.getMessageReplyFuture(task);
	}

	public AbilityCommunicationFactFactory getAbilityCommunicationFactFactory() {
		return (AbilityCommunicationFactFactory) abilityCommunicationFactFactory;
	}

	public AiManagerFactFactory getAiManagerFactFactory() {
		return (AiManagerFactFactory) aiManagerFactFactory;
	}

	public ChannelCommunicationFactFactory getChannelCommunicationFactFactory() {
		return (ChannelCommunicationFactFactory) channelCommunicationFactFactory;
	}

	public ConfigurationTasksManager getConfigurationTasksManager() {
		return configurationTasksManager;
	}

	public ExecutionLogger getExecutionLogger() {
		return executionLogger;
	}

	public ExtensionsManagerFactFactory getExtensionsManagerFactFactory() {
		return (ExtensionsManagerFactFactory) extensionsManagerFactFactory;
	}

	public GlobalConfiguration getGlobalConfiguration() {
		return globalConfiguration;
	}

	public GrpcCoreService getGrpcAbilityCoreService() {
		return grpcCoreService;
	}

	public HazelcastInstanceBuilder getHazelcastInstanceBuilder() {
		return hazelcastInstanceBuilder;
	}

	public ExecutorService getHightScheduler() {
		return hightScheduler;
	}

	public JSONObject getJsonConfiguration() {
		return JsonHelper.generateJsonConfiguration(globalConfiguration, configurationTasksManager);
	}

	public LifecycleStatus getLifecycleStatus() {
		return lifecycleStatus;
	}

	public ExecutorService getLowScheduler() {
		return lowScheduler;
	}

	public MemoryManager getMemoryManager() {
		return memoryManager;
	}

	public MemoryManagerFactFactory getMemoryManagerFactFactory() {
		return (MemoryManagerFactFactory) memoryManagerFactFactory;
	}

	public NextHopManagerFactFactory getNextHopManagerFactFactory() {
		return (NextHopManagerFactFactory) nextHopManagerFactFactory;
	}

	public NluCommunicationFactFactory getNluCommunicationFactFactory() {
		return (NluCommunicationFactFactory) nluCommunicationFactFactory;
	}

	public ExecutorService getNormalScheduler() {
		return normalScheduler;
	}

	public SuperManagerFactFactory getSuperManagerFactFactory() {
		return (SuperManagerFactFactory) superManagerFactFactory;
	}

	public Task getTaskByTraceId(String traceId) {
		return nextHopRuntimeEngine.getTaskByTraceId(traceId);
	}

	public boolean isRunning() {
		return lifecycleStatus.equals(LifecycleStatus.RUNNING);
	}

	public void replaceJsonConfiguration(JSONObject jsonConfiguration) throws TaskManagerException {
		JsonHelper.updateJsonConfiguration(jsonConfiguration, globalConfiguration, configurationTasksManager);
		globalConfiguration.validate();
		configurationTasksManager.validate();
		updateConfigurationAllFactories();
	}

	public void replaceJsonConfiguration(String configuration) throws TaskManagerException {
		replaceJsonConfiguration(new JSONObject(configuration));
	}

	public void replyFromAbilityMessage(AbilityMessageReply request) {
		// TODO replyFromAbilityMessage

	}

	public Future<ChannelMessageReply> replyFromChannelMessage(ChannelMessageReply request) {
		// TODO reply of async channle message
		return null;
	}

	public void replyFromNluCall(NluMessageReply request) {
		// TODO reply From NLU call

	}

	public void replyFromNluTrainingRequest(NluTrainingModelReply request) {
		// TODO reply From NLU training request

	}

	public void sendMessageToChannel(OutputMessageFact outputMessageFact) {
		// TODO messaggi verso esterno tramite channel

	}

	public void stop() {
		try {
			grpcCoreService.shutdown();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			hazelcastInstanceBuilder.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			configurationTasksManager.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		for (final PTalkFactFactory factFactory : allPTalkFactFactory) {
			try {
				factFactory.close();
			} catch (final Exception e) {
				executionLogger.logGlobalException(e);
			}
		}
		try {
			executionLogger.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		lifecycleStatus = LifecycleStatus.STOPPED;
		synchronized (this) {
			notifyAll();
		}
	}

	public Future<Facts> submit(NextHopSchedulerType nextHopSchedulerType, Callable<Facts> task) {
		Future<Facts> result;
		switch (nextHopSchedulerType) {
		case HAZELCAST:
			result = hazelcastInstanceBuilder.getScheduler().submit(task);
			break;
		case LOCAL:
			result = normalScheduler.submit(task);
			break;
		case LOCAL_HIGH_PRIORITY:
			result = hightScheduler.submit(task);
			break;
		case LOCAL_LOW_PRIORITY:
			result = lowScheduler.submit(task);
			break;
		default:
			result = normalScheduler.submit(task);
			break;
		}
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("PTalkEngineRuntime [globalConfiguration=");
		builder.append(globalConfiguration);
		builder.append(", configurationTasksManager=");
		builder.append(configurationTasksManager);
		builder.append(", hazelcastInstanceBuilder=");
		builder.append(hazelcastInstanceBuilder);
		builder.append(", memoryManager=");
		builder.append(memoryManager);
		builder.append("]");
		return builder.toString();
	}

	private void updateConfigurationAllFactories() {
		for (final PTalkFactFactory factFactory : allPTalkFactFactory) {
			factFactory.updateConfiguration();
		}
	}

}

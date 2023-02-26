package net.rossonet.ptalk.engine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.engine.grpc.GrpcCoreService;

public class PTalkEngineRuntime {

	private final HazelcastInstanceBuilder hazelcastInstanceBuilder;

	private final GlobalConfiguration globalConfiguration;

	private final MemoryManagerFactFactory memoryManagerFactFactory;

	private final NextHopManagerFactFactory nextHopManagerFactFactory;

	private final NluCommunicationFactFactory nluCommunicationFactFactory;

	private final SuperManagerFactFactory superManagerFactFactory;

	private final AiManagerFactFactory aiManagerFactFactory;

	private final ExtensionsManagerFactFactory extensionsManagerFactFactory;

	private final AbilityCommunicationFactFactory abilityCommunicationFactFactory;

	private final ExecutionLogger executionLogger;

	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;

	private final GrpcCoreService grpcCoreService;

	private final ExecutorService normalScheduler;
	private final ExecutorService lowScheduler;
	private final ExecutorService hightScheduler;

	public PTalkEngineRuntime(boolean hazelcastEmbedded, String[] args) {
		hazelcastInstanceBuilder = new HazelcastInstanceBuilder(this);
		globalConfiguration = new GlobalConfiguration(this);
		memoryManagerFactFactory = new MemoryManagerFactFactory(this);
		nextHopManagerFactFactory = new NextHopManagerFactFactory(this);
		nluCommunicationFactFactory = new NluCommunicationFactFactory(this);
		superManagerFactFactory = new SuperManagerFactFactory(this);
		aiManagerFactFactory = new AiManagerFactFactory(this);
		extensionsManagerFactFactory = new ExtensionsManagerFactFactory(this);
		abilityCommunicationFactFactory = new AbilityCommunicationFactFactory(this);
		executionLogger = new ExecutionLogger(this);
		lifecycleStatus = LifecycleStatus.CONFIGURED;
		normalScheduler = Executors.newFixedThreadPool(globalConfiguration.getNormalSchedulerThreadSize());
		lowScheduler = Executors.newSingleThreadExecutor();
		hightScheduler = Executors.newCachedThreadPool();
		grpcCoreService = new GrpcCoreService(this, globalConfiguration.getGrpcServerPort());
		lifecycleStatus = LifecycleStatus.RUNNING;
	}

	public AbilityCommunicationFactFactory getAbilityCommunicationFactFactory() {
		return abilityCommunicationFactFactory;
	}

	public AiManagerFactFactory getAiManagerFactFactory() {
		return aiManagerFactFactory;
	}

	public ExecutionLogger getExecutionLogger() {
		return executionLogger;
	}

	public ExtensionsManagerFactFactory getExtensionsManagerFactFactory() {
		return extensionsManagerFactFactory;
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

	public LifecycleStatus getLifecycleStatus() {
		return lifecycleStatus;
	}

	public ExecutorService getLowScheduler() {
		return lowScheduler;
	}

	public MemoryManagerFactFactory getMemoryManagerFactFactory() {
		return memoryManagerFactFactory;
	}

	public NextHopManagerFactFactory getNextHopManagerFactFactory() {
		return nextHopManagerFactFactory;
	}

	public NluCommunicationFactFactory getNluCommunicationFactFactory() {
		return nluCommunicationFactFactory;
	}

	public ExecutorService getNormalScheduler() {
		return normalScheduler;
	}

	public SuperManagerFactFactory getSuperManagerFactFactory() {
		return superManagerFactFactory;
	}

	public boolean isRunning() {
		return lifecycleStatus.equals(LifecycleStatus.RUNNING);
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
			globalConfiguration.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			memoryManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			nextHopManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			nluCommunicationFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			superManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			aiManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			extensionsManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			abilityCommunicationFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			executionLogger.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		lifecycleStatus = LifecycleStatus.STOPPED;
		notify();
	}

}
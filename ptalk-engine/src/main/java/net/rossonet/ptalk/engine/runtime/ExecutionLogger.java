package net.rossonet.ptalk.engine.runtime;

import java.util.logging.Logger;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.rossonet.utils.LogHelper;

import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class ExecutionLogger {

	private static final ExecutionLogger INSTANCE = new ExecutionLogger();

	private static final Logger logger = Logger.getLogger(ExecutionLogger.class.getName());

	public static ExecutionLogger getTraceLogger(Task rulesEngineTask) {
		logger.info(
				"logger called from " + rulesEngineTask.getTraceId() + " with name " + rulesEngineTask.getTaskName());
		return INSTANCE;
	}

	public static ExecutionLogger getTraceLoggerFor(String rulesEngineTask) {
		return INSTANCE;
	}

	private ExecutionLogger() {
	}

	public void addedNextHop(String rulesEngineTask, String target) {
		logger.info("addedNextHop " + rulesEngineTask + "\ntarget" + target);

	}

	public void afterEvaluate(Task rulesEngineTask, Rule rule, Facts facts, boolean evaluationResult) {
		logger.info("afterEvaluate " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts
				+ "\nevaluationResult" + evaluationResult);
	}

	public void afterExecute(Task rulesEngineTask, Rules rules, Facts facts) {
		logger.info("afterEvaluate " + rulesEngineTask.getTraceId() + "\nrules:" + rules + "\nfacts:" + facts);
	}

	public void beforeEvaluate(Task rulesEngineTask, Rule rule, Facts facts) {
		logger.info("beforeEvaluate " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts);
	}

	public void beforeEvaluate(Task rulesEngineTask, Rules rules, Facts facts) {
		logger.info("beforeEvaluate " + rulesEngineTask.getTraceId() + "\nrules:" + rules + "\nfacts:" + facts);
	}

	public void beforeExecute(Task rulesEngineTask, Rule rule, Facts facts) {
		logger.info("beforeExecute " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts);
	}

	public void completedInstant(Task rulesEngineTask) {
		logger.info("completedInstant " + rulesEngineTask.getTraceId());
	}

	public void exceptionLog(Task rulesEngineTask, TaskManagerException fireException) {
		logger.info("exceptionLog " + rulesEngineTask.getTraceId() + "\nstacktrace"
				+ LogHelper.stackTraceToString(fireException));

	}

	public void executionParameters(Task rulesEngineTask, String executionParameters) {
		logger.info(
				"executionParameters " + rulesEngineTask.getTraceId() + "\nexecutionParameters" + executionParameters);

	}

	public void mainFireCompletedFacts(Task rulesEngineTask, Facts workingFacts) {
		logger.info("mainFireCompletedFacts " + rulesEngineTask.getTraceId() + "\nworkingFacts:" + workingFacts);

	}

	public void mainFireFacts(Task rulesEngineTask, Facts workingFacts) {
		logger.info("mainFireFacts " + rulesEngineTask.getTraceId() + "\nworkingFacts:" + workingFacts);

	}

	public void mainRules(Task rulesEngineTask, String rulesAsJson) {
		logger.info("mainRules " + rulesEngineTask.getTraceId() + "\nrulesAsJson" + rulesAsJson);

	}

	public void onEvaluationError(Task rulesEngineTask, Rule rule, Facts facts, Exception exception) {
		logger.info("onEvaluationError " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts
				+ "\nstacktrace" + LogHelper.stackTraceToString(exception));

	}

	public void onFailure(Task rulesEngineTask, Rule rule, Facts facts, Exception exception) {
		logger.info("onFailure " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts + "\nstacktrace"
				+ LogHelper.stackTraceToString(exception));

	}

	public void onSuccess(Task rulesEngineTask, Rule rule, Facts facts) {
		logger.info("onSuccess " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts);
	}

	public void postFireFacts(Task rulesEngineTask, Facts workingFacts) {
		logger.info("postFireFacts " + rulesEngineTask.getTraceId() + "\nworkingFacts:" + workingFacts);

	}

	public void postRules(Task rulesEngineTask, String postRulesAsJson) {
		logger.info("postRules " + rulesEngineTask.getTraceId() + "\npostRulesAsJson" + postRulesAsJson);

	}

	public void preFireFacts(Task rulesEngineTask, Facts preFireFacts) {
		logger.info("preFireFacts " + rulesEngineTask.getTraceId() + "\npreFireFacts:" + preFireFacts);

	}

	public void preRules(Task rulesEngineTask, String preRulesAsJson) {
		logger.info("preRules " + rulesEngineTask.getTraceId() + "\npreRulesAsJson" + preRulesAsJson);

	}

	public void startInstant(Task rulesEngineTask) {
		logger.info("startInstant " + rulesEngineTask.getTraceId());

	}

}

package net.rossonet.ptalk.engine.parameter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import net.rossonet.ptalk.utils.JsonHelper;

public class OnlineTaskModel implements Serializable {

	private static final String POST_RULES_LABEL = "post-rules";
	private static final String MAIN_RULES_LABEL = "main-rules";
	private static final String PRE_RULES_LABEL = "pre-rules";
	private static final long serialVersionUID = -9139834337155333462L;
	private static final String EXECUTION_PARAMETER_LABEL = null;
	private String executionParameter = null;
	private Set<String> mainRules = new HashSet<>();
	private Set<String> postRules = new HashSet<>();
	private Set<String> preRules = new HashSet<>();

	private String modelName;

	public OnlineTaskModel(JSONObject jsonTask) {
		if (jsonTask.has(MAIN_RULES_LABEL)) {
			final JSONArray mainJsonArray = jsonTask.getJSONArray(MAIN_RULES_LABEL);
			for (int i = 0; mainJsonArray.length() < i; i++) {
				mainRules.add(mainJsonArray.getJSONObject(i).toString(0));
			}
		}
		if (jsonTask.has(PRE_RULES_LABEL)) {
			final JSONArray preJsonArray = jsonTask.getJSONArray(PRE_RULES_LABEL);
			for (int i = 0; preJsonArray.length() < i; i++) {
				preRules.add(preJsonArray.getJSONObject(i).toString(0));
			}
		}
		if (jsonTask.has(POST_RULES_LABEL)) {
			final JSONArray postJsonArray = jsonTask.getJSONArray(POST_RULES_LABEL);
			for (int i = 0; postJsonArray.length() < i; i++) {
				postRules.add(postJsonArray.getJSONObject(i).toString(0));
			}
		}
	}

	public String getExecutionParameter() {
		return executionParameter;
	}

	public Set<String> getMainRulesAsString() {
		return mainRules;
	}

	public String getModelName() {
		return modelName;
	}

	public Set<String> getPostRulesAsString() {
		return postRules;
	}

	public Set<String> getPreRulesAsString() {
		return preRules;
	}

	public void setExecutionParameter(String executionParameter) {
		this.executionParameter = executionParameter;
	}

	public void setMainRules(Set<String> mainRules) {
		this.mainRules = mainRules;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setPostRules(Set<String> postRules) {
		this.postRules = postRules;
	}

	public void setPreRules(Set<String> preRules) {
		this.preRules = preRules;
	}

	public JSONObject toJson() {
		final JSONObject reply = new JSONObject();
		reply.put(EXECUTION_PARAMETER_LABEL, new JSONObject(executionParameter));
		reply.put(PRE_RULES_LABEL, JsonHelper.getJsonArrayFromStringSet(preRules));
		reply.put(MAIN_RULES_LABEL, JsonHelper.getJsonArrayFromStringSet(mainRules));
		reply.put(POST_RULES_LABEL, JsonHelper.getJsonArrayFromStringSet(postRules));
		return reply;
	}

}

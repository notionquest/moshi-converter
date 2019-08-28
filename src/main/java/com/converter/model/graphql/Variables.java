package com.converter.model.graphql;

import java.util.HashMap;
import java.util.Map;

public class Variables {
	
	private Map<String, Object> variables = new HashMap<>();
	
	public Map<String, Object> getVariables() {
		return this.variables;
	}
	
	public void setVariable(final String name, final Object value) {
		this.variables.put(name, value);
	}
}

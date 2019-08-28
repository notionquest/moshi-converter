package com.converter.model.graphql;

import com.squareup.moshi.Json;

public class GraphqlRequest {
	
	@Json(name = "operationName")
	private String operationName;
	
	@Json(name = "variables")
	private Variables variables;
	
	@Json(name = "query")
	private String query;
	
	public String getOperationName() {
		return operationName;
	}
	
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	
	public Variables getVariables() {
		return variables;
	}
	
	public void setVariables(Variables variables) {
		this.variables = variables;
	}
	
	public String getQuery() {
		return query;
	}
	
	public void setQuery(String query) {
		this.query = query;
	}
}

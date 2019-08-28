package com.converter.moshi;

import com.converter.model.graphql.GraphqlRequest;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class MoshiGraphConverter {
	public GraphqlRequest toModel(String fileName) throws IOException {
		Moshi moshi = new Moshi.Builder().build();
		JsonAdapter<GraphqlRequest> jsonAdapter = moshi.adapter(GraphqlRequest.class);
		
		GraphqlRequest graphqlRequest = jsonAdapter.fromJson(IOUtils.toString(getClass().getResourceAsStream(fileName)));
		return graphqlRequest;
	}
}

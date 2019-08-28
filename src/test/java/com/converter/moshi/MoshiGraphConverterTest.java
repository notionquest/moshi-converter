package com.converter.moshi;

import com.converter.model.graphql.GraphqlRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MoshiGraphConverterTest {
	
	private MoshiGraphConverter moshiGraphConverter;
	
	@BeforeEach
	public void init() {
		moshiGraphConverter = new MoshiGraphConverter();
	}
	
	@Test
	void shouldGetGraphqlRequest() throws IOException {
		GraphqlRequest graphqlRequest = moshiGraphConverter.toModel("/graphqldata.json");
		Assertions.assertNotNull(graphqlRequest);
		Assertions.assertEquals("androidMyQuery", graphqlRequest.getOperationName());
		Assertions.assertEquals("query androidMyQuery .......", graphqlRequest.getQuery());
		Assertions.assertEquals(400.0,
				graphqlRequest.getVariables().getVariables().get("foo"));
		Assertions.assertEquals(200.0,
				graphqlRequest.getVariables().getVariables().get("bar"));
		Assertions.assertEquals("1970-01-01T00:00:00.000Z",
				graphqlRequest.getVariables().getVariables().get("baz"));
	}
}
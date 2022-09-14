package com.Automation.APIUtils;

import io.restassured.RestAssured;

public class API_Delete {
	
	public void deleteMethod()
	{
		String baseUri="https://jsonplaceholder.typicode.com";
		RestAssured.given().baseUri(baseUri).when().log().all()
		.get("/todos/5").then().log().all().assertThat().statusCode(200);
	}
}

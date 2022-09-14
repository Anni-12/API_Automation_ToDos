package com.Automation.APIUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
public class API_Get {
	
	public void getMethod(String str)
	{
		String baseUri="https://jsonplaceholder.typicode.com";
		RestAssured.given().baseUri(baseUri).when().log().all()
		.get(str).then().log().all().assertThat().statusCode(200)
		.assertThat().time(Matchers.lessThan(2000L));
	}
}

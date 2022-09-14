package com.Automation.APIUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;
import io.restassured.RestAssured;

public class API_Post {
	
	public void createMethod(String str) throws FileNotFoundException
	{
		String endpoint="/todos";
		RestAssured.given().baseUri("https://jsonplaceholder.typicode.com")
		.body(getFileContent("C:\\Users\\aniket.1\\eclipse-workspace\\API_Automation_ToDos\\src\\test\\resources\\"+str))
		.header("Content-Type","application/json")
		.when().log().all().post(endpoint).then().log().all().statusCode(anyOf(is(200),is(201)));
	}
	

	public static String getFileContent(String filepath) throws FileNotFoundException
	{
		File file= new File(filepath);
		Scanner sc=new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
}

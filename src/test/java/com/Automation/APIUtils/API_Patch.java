package com.Automation.APIUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class API_Patch {
	
	public void partialUpdateMethod(String str,int a) throws FileNotFoundException
	{
		String endpoint="/todos/"+a;
		RestAssured.given().baseUri("https://jsonplaceholder.typicode.com")
		.body(getFileContent("C:\\Users\\aniket.1\\eclipse-workspace\\API_Automation_ToDos\\src\\test\\resources\\"+str))
		.header("Content-Type","application/json")
		.when().log().all().patch(endpoint).then().log().all().statusCode(200);
	}
	

	public static String getFileContent(String filepath) throws FileNotFoundException
	{
		File file= new File(filepath);
		Scanner sc=new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
}

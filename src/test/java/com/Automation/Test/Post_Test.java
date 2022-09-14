package com.Automation.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.APIUtils.API_Post;

public class Post_Test extends API_Post{
	
	@DataProvider
	public Object filename()
	{
		String s1="Post1.txt";
		String s2="Post2.txt";
		return new Object[][]  {{s1},{s2}};
	}
	
	@Test(dataProvider="filename",priority=1)
	
	public void verifypost(String str) throws FileNotFoundException
	{
		API_Post p=new API_Post();
		p.createMethod(str);
	}
	
}

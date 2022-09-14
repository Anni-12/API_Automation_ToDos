package com.Automation.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.APIUtils.API_Get;

public class Get_Test extends API_Get{
	
	@DataProvider
	public Object endpoint()
	{
		String s1="/todos/1";
		String s2="/todos/2";
		return new Object[][]  {{s1},{s2}};
	}
	
	@Test(dataProvider="endpoint",priority=1)
	public void getVerify(String str)
	{
		API_Get a=new API_Get();
		a.getMethod(str);
	}
}

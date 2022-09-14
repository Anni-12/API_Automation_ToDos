package com.Automation.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.APIUtils.API_Patch;

public class Patch_Test extends API_Patch{
	
	@DataProvider
	public Object endpoint()
	{
		String s1="Patch1.txt";
		String s2="Patch2.txt";
		int id1=1;
		int id2=2;
		return new Object[][]  {{s1,id1},{s2,id2}};
	}
	
	@Test(dataProvider="endpoint",priority=1)

	public void verifypatch(String str,int a) throws FileNotFoundException
	{
		API_Patch pa=new API_Patch();
		pa.partialUpdateMethod(str,a);
	}
}

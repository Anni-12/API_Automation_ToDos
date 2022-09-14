package com.Automation.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.Automation.APIUtils.API_Put;

public class Put_Test extends API_Put{
	
	@Test
	
	public void verifyput() throws FileNotFoundException
	{
		API_Put pt=new API_Put();
		pt.updateMethod();
	}
}

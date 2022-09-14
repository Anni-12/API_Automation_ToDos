package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.APIUtils.API_Delete;

public class Delete_Test extends API_Delete{
	
	@Test
	
	public void verifydelete()
	{
		API_Delete d=new API_Delete();
		d.deleteMethod();
	}
}

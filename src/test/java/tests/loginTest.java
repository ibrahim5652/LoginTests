package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.loginPage;

public class loginTest extends TestBase{

	loginPage loginobject;
@Test	
	public void login() {
		
		loginobject = new loginPage(driver); 
		loginobject.enteremail("ibrahimmagdy600@gmail.com");
		loginobject.enterpassword("123456");
		loginobject.submit();
		Assert.assertTrue(loginobject.error.getText().contains("Userid or Password did Not Match !!"));
		loginobject.forogtpassword();
		
		
	}

		
	
	
	
	
}

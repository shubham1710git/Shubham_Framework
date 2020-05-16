package com.xm.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xm.qa.base.TestBase;
import com.xm.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage loginPage = new LoginPage(getDriver());
	String username = prop.getProperty("username");
	String pwd = prop.getProperty("password");

	
	// Practice needs to follow while writing any test case:
	//1. Test case should be separated-- independent of each other.
	//2. Before each test case we need to launch the browser and login.
	//3. After each test case--- close the browser.
	
	public LoginTest() throws IOException {
		super(); 
		// super() will initialize the variables of the TestBase class.
		// The properties will be initialize and the data will be loaded from the config.properties.	
	}
	//@BeforeMethod
	//public void setup() throws IOException {
		//intialization();
		//loginPage = new LoginPage();
	//}
	
	@Test(description="Verify that user is able to login successfully")
	public void login() throws InterruptedException{
		loginPage.loginToApplication(username, pwd);
		Assert.assertTrue(loginPage.checkHomeTab());
		}
	
	//@AfterMethod
	//public void quit() {
		//driver.quit();	
	//}
}

package com.xm.qa.test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xm.qa.base.TestBase;
import com.xm.qa.pages.UsersPage;

public class UsersTest extends TestBase{
	public UsersTest() throws IOException {
		super();
	}
	private UsersPage usersPage;
	private LoginTest loginTest;

		@BeforeMethod
	    public void setup() throws IOException {
		intialization();
		usersPage = new UsersPage();
		loginTest = new LoginTest();
	}

	@Test(description="Verify that user is able to navigate to each buttons on the Users tab")
	public void clickUsers() throws InterruptedException {
		loginTest.login();
		Thread.sleep(5000);
		usersPage.clickUserslink();
		usersPage.clickSearchButton();
		Thread.sleep(5000);
		usersPage.clickUserIsuperviseButton();
		Thread.sleep(5000);
		usersPage.clickAllUserButtonbutton();
		Thread.sleep(5000);
		usersPage.clickExport();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void quit() {
		driver.quit();	
	}
}
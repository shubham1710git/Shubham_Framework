package com.xm.qa.test;

import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xm.qa.base.TestBase;
import com.xm.qa.pages.AddUserPage;
import com.xm.qa.pages.LoginPage;
import com.xm.qa.pages.UsersPage;

public class AddUserTest extends TestBase{
	
	String username = prop.getProperty("username");
	String pwd = prop.getProperty("password");
    String firstname = prop.getProperty("firstname");
    String lastname = prop.getProperty("lastname");
    String userid = prop.getProperty("userID");
    String userpassword = prop.getProperty("userpassword");
    
	public AddUserTest() throws IOException {
		super();
	}
	private UsersPage usersPage;
	private LoginPage loginPage;
	private AddUserPage addUserPage;
	
	@BeforeMethod
	public void setup() throws IOException{
		intialization();
		usersPage = new UsersPage();
		loginPage = new LoginPage();
		addUserPage = new AddUserPage();
		}
	
	@Test(description= "Verify that user is added successfully")
	public void addUser() throws InterruptedException {
	loginPage.loginToApplication(username, pwd);
	usersPage.clickUserslink();
	usersPage.clickAddUserButton();
	//adduser.clickLdap();
	addUserPage.enterFirstName(firstname);
	addUserPage.enterLastName(lastname);
	addUserPage.enterUserId(userid);
	addUserPage.enterPassword(userpassword);
	addUserPage.enterConfirmPassword(userpassword);
	addUserPage.clickToDisableForcePasswordReset();
    addUserPage.enterTextForRole();
    Thread.sleep(5000);
    addUserPage.pressEnterToSelect();
    addUserPage.clickAddButton();
    Thread.sleep(5000);
	boolean b=addUserPage.isElementPresent();
	Assert.assertTrue(b);
	}

    @AfterMethod
    public void quit() {
	driver.quit();	
}
}
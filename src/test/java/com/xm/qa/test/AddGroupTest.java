package com.xm.qa.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xm.qa.base.TestBase;
import com.xm.qa.pages.AddGroupPage;
import com.xm.qa.pages.GroupsPage;
import com.xm.qa.pages.LoginPage;

public class AddGroupTest extends TestBase{
	
	public AddGroupTest() throws IOException {
		super();
		
	}



	private GroupsPage groupsPage = new GroupsPage(getDriver());
	private AddGroupPage addGroupPage = new AddGroupPage(getDriver());
	private LoginPage loginPage = new LoginPage(getDriver());
	
	String username = prop.getProperty("username");
	String pwd = prop.getProperty("password");
	String groupname = prop.getProperty("groupname");
	String description = prop.getProperty("groupdescription");
	String groupmember = prop.getProperty("groupmember");

	
				
	//@BeforeMethod(alwaysRun = true)
	//public void setup() throws IOException {
		//initialization();
	//	loginPage = new LoginPage();
	//	groupsPage = new GroupsPage();
	//	//addGroupPage = new AddGroupPage();
		//}
	
	@Test(description="To verify that user is able to add the group")
	public void addGroup() throws InterruptedException {
		loginPage.loginToApplication(username, pwd);;
		groupsPage.clickGroupsLink();
		groupsPage.clickAddGroupButton();
		addGroupPage.enterGroupName(groupname);
		addGroupPage.enterGroupDescription(description);
		addGroupPage.enterMember(groupmember);
		Thread.sleep(5000);
		addGroupPage.enter();
		addGroupPage.clickAddButton();
	}
}
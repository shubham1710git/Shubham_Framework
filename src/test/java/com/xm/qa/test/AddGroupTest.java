package com.xm.qa.test;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xm.qa.base.TestBase;
import com.xm.qa.pages.AddGroupPage;
import com.xm.qa.pages.GroupsPage;

public class AddGroupTest extends TestBase{
	
	private GroupsPage groupsPage;
	private AddGroupPage addGroupPage;
	private LoginTest loginTest;
	
	String groupname = prop.getProperty("groupname");
	String description = prop.getProperty("groupdescription");
	String groupmember = prop.getProperty("groupmember");

	public AddGroupTest() throws IOException {
		super();
	}			
	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		loginTest = new LoginTest();
		groupsPage = new GroupsPage();
		addGroupPage = new AddGroupPage();
		}
	
	@Test(description="To verify that user is able to add the group")
	public void addGroup() throws InterruptedException {
		loginTest.login();
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
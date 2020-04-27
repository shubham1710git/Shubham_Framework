package com.xm.qa.constants;

public class Constants {
	
	//x-path for LoginPage
	
	public final static String logo = "//*[@id='logo']"; 
	public final static String newsAndUpdatesLink = "//a[text()='News & Updates']";
	public final static String supportLink = "//a[text()='Support']";
	public final static String username = "//*[@id='username']";
	public final static String password = "//*[@id='password']";
	public final static String forgotPasswordLink = "//span[@class='form-text']";
	public final static String loginBtn = "//button[@id='submitButton']";
	public final static String homeTab = "//li[@id='HOME']";
	
	//x-path for AddGroupPage
	
	public final static String groupName = "//*[@id='groupName']";
	public final static String descriptionField = "//*[@id='descriptionLabel']";
	public final static String recipientSection = "//input[@class='text hint']";
	public final static String createAnotherGroup = "//div[@title='Create Another Group']";
	public final static String saveButton = "//div[@id='saveButton']";
	public final static String cancelButton = "//div[@id='cancelButton']";
	public final static String crossIcon = "//div/i[@class='icon-cancel window-close']";
	
    //x-path for AddUserPage
	
	public final static String ldapCheckbox = "//*[@id='useLDAP']";
	public final static String firstName = "//*[@id='firstName']";
	public final static String lastName = "//*[@id='lastName']";
	public final static String userID = "//*[@id='userId']";
	public final static String newPassword = "//*[@id='newPassword']";
	public final static String confirmPassword = "verifyNewPassword";
	public final static String forceResetPassword = "//span[contains(@class,'checkbox checkbox-checked float-left')]";
	public final static String roles = "//*[@id=\"roles\"]/div[2]/div[2]/ol/li[1]/input";
	public final static String addButton = "//div[contains(@class,'button button-primary float-right')]";
	public final static String deletedUser = "//div[contains(text(),'1 1')]";
	public final static String newUser = "//div[text()='shubham goel']";
	
	//x-path for FindWSUPage
	
	public final static String allButton = "//input[@value='All']";
	public final static String resultsPerPageDropdown = "//*[@id='resultSize:input']";
	public final static String findButton = "//input[@class='action button']";
	public final static String userTextField = "//input[@title='webservice.user.search.text.hint']";
	
	
	//x-path for GroupsPage
	
	public final static String groupsLink = "//*[@id='GROUPS']";
	public final static String groupsPerformance = "//*[@id='GroupPerformanceReportPlace']";
	public final static String whosOnCall = "//*[@id='WhosOnDutyGroupSelectionPlace']";
	public final static String historicalOnCall = "//*[@id='HistoricalOnCallPlace']";
	public final static String findDynamicTeams = "//*[@id='FindDynamicTeams']";
	public final static String dynamicTeams = "//*[@id='DynamicTeams']";
	public final static String searchButton = "//*[@id='searchButton']";
	public final static String groupsISuperviseButton = "//*[@id='groupsISuperviseButton']";
	public final static String allGroupsButton = "//*[@id='allGroupsButton']";
	public final static String addGroupButton = "//*[@id='addGroupButton']";
	public final static String exportGroupsButton = "//*[@id='exportMenuItem']";
	public final static String deleteGroupButton = "//*[@id='deleteButton']";
	
	//x-path for UsersPage
	
	public final static String userLink = "//*[@id=\"USERS\"]";
	public final static String userSearchButton = "//*[@id=\"searchButton\"]";
	public final static String userISuperviseButton = "//*[@id=\"usersISuperviseButton\"]";
	public final static String allUsersButton = "//*[@id=\"allUsersButton\"]";
	public final static String userAddButton = "//*[@id=\"addUserButton\"]";
	public final static String exportButton = "//div[@id='exportMenuItem']";
	public final static String viewUserByRoleLink = "//*[@id='ViewUsersByRole']";
	public final static String userPerformanceLink = "//*[@id='UserPerformanceReportPlace']";
	public final static String searchWebServiceUsersLink = "//*[@id='SearchWebServiceUsers']";
	public final static String addWebServiceUser = "//*[@id='WebServiceUserDetails']";
	public final static String deleteUser = "//div[contains(text(),'1 1')]/ancestor::tr/td[1]";
	public final static String uDeletedUser = "//div[contains(text(),'1 1')]";
	public final static String deleteButton = "//div[@id='deleteButton']";
	public final static String chickenDelete = "//div[@id='okButtonId']";
	public final static String chickenCancelButton = "//div[@id='cancelButtonId']";	
}

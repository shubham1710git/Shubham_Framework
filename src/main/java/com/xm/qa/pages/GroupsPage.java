package com.xm.qa.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xm.qa.base.TestBase;
import com.xm.qa.constants.Constants;

public class GroupsPage extends TestBase{
	Logger log = Logger.getLogger(GroupsPage.class);

	public GroupsPage() throws IOException{
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = Constants.groupsLink)
	private WebElement groupsLink;
	
	@FindBy(xpath = Constants.groupsPerformance)
	private WebElement groupsPerformance;
	
	@FindBy(xpath = Constants.whosOnCall)
	private WebElement whosOnCall;
	
	@FindBy(xpath = Constants.historicalOnCall)
	private WebElement historicalOnCall;
	
	@FindBy(xpath = Constants.findDynamicTeams)
	private WebElement findDynamicTeams;
	
	@FindBy(xpath = Constants.dynamicTeams)
	private WebElement dynamicTeams;
	
	@FindBy(xpath = Constants.searchButton)
	private WebElement searchButton;

	@FindBy(xpath = Constants.groupsISuperviseButton)
	private WebElement groupsISuperviseButton;
	
	@FindBy(xpath = Constants.allGroupsButton)
	private WebElement allGroupsButton;
	
	@FindBy(xpath = Constants.addGroupButton)
	private WebElement addGroupButton;
	
	@FindBy(xpath = Constants.exportGroupsButton)
	private WebElement exportGroupsButton;
	
	@FindBy(xpath = Constants.deleteGroupButton)
	private WebElement deleteGroupButton;
	
	@FindBy(xpath = "//*[text()='Dynamic Teams I Supervise']")
	private WebElement dynamicTeamPage;
	
	public boolean isDynamicTeamPageOpen() {
		log.info("To check whether user is on Dynamic Page");
		return dynamicTeamPage.isDisplayed();
		
	}
	
	public void clickGroupsLink() {
		log.info("Click on Groups link");
		groupsLink.click();
	}
	public void clickGroupPerformanceLink() {
		log.info("Click on this link to view the Group Performance link");
		groupsPerformance.click();
	}
	public void clickWhosOnCallLink() {
		log.info("Click on this link to view the Who's on Call Data");
		whosOnCall.click();
	}
	public void clickHistoricalOnCallLink() {
		log.info("Click on this link to view the Historical On Call Data");
		historicalOnCall.click();
	}
	public void clickFindDynamicTeamLink() {
		log.info("Click on this link to find the dynamic team");
		findDynamicTeams.click();
	}
	public void clickDynamicTeamsLink() {
		log.info("Click on this link to add and view the dynamic team");
		dynamicTeams.click();
	}
	public void clickDeleteButton() {
		log.info("Click on Delete button to delete the group");
		deleteGroupButton.click();
	}
	public void clickSearchButton() {
		log.info("Click on Search button");
		searchButton.click();
	}
	public void clickGroupsISuperviseButton() {
		log.info("Click on Groups I Supervise Button");
		groupsISuperviseButton.click();
	}
	public void clickAllGroupsButton() {
		log.info("Click on All Group Button");
		allGroupsButton.click();
	}
	public void clickAddGroupButton() {
		log.info("Click on Add Group button");
		addGroupButton.click();
	}
	public void clickExportButton() {
		log.info("Click on Export button");
		exportGroupsButton.click();
	}
		}
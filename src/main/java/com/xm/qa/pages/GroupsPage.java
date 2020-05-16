package com.xm.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.xm.qa.util.UtilPage;

public class GroupsPage extends UtilPage{
	Logger log = Logger.getLogger(GroupsPage.class);

	public GroupsPage(WebDriver driver) {
		super(driver);
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
		//return dynamicTeamPage.isDisplayed();
		return isWebElementPresent(dynamicTeamPage);		
	}	
	public void clickGroupsLink() {
		log.info("Click on Groups link");
		clickWebElementFluently(groupsLink);
	}
	public void clickGroupPerformanceLink() {
		log.info("Click on this link to view the Group Performance link");
		clickWebElementFluently(groupsPerformance);
	}
	public void clickWhosOnCallLink() {
		log.info("Click on this link to view the Who's on Call Data");
		clickWebElementFluently(whosOnCall);
	}
	public void clickHistoricalOnCallLink() {
		log.info("Click on this link to view the Historical On Call Data");
		clickWebElementFluently(historicalOnCall);
	}
	public void clickFindDynamicTeamLink() {
		log.info("Click on this link to find the dynamic team");
		clickWebElementFluently(findDynamicTeams);
	}
	public void clickDynamicTeamsLink() {
		log.info("Click on this link to add and view the dynamic team");
		clickWebElementFluently(dynamicTeams);
	}
	public void clickDeleteButton() {
		log.info("Click on Delete button to delete the group");
		deleteGroupButton.click();
		clickWebElementFluently(deleteGroupButton);
	}
	public void clickSearchButton() {
		log.info("Click on Search button");
		clickWebElementFluently(searchButton);
	}
	public void clickGroupsISuperviseButton() {
		log.info("Click on Groups I Supervise Button");
		clickWebElementFluently(groupsISuperviseButton);
	}
	public void clickAllGroupsButton() {
		log.info("Click on All Group Button");
		clickWebElementFluently(allGroupsButton);
	}
	public void clickAddGroupButton() {
		log.info("Click on Add Group button");
		clickWebElementFluently(addGroupButton);
	}
	public void clickExportButton() {
		log.info("Click on Export button");
		clickWebElementFluently(exportGroupsButton);
	}
		}
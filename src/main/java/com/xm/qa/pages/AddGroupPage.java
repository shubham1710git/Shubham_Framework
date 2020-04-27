package com.xm.qa.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.xm.qa.base.TestBase;
import com.xm.qa.constants.Constants;

public class AddGroupPage extends TestBase{

	Logger log = Logger.getLogger(AddGroupPage.class);
	public AddGroupPage() throws IOException {
		super();
	}
	
	@FindBy(xpath = Constants.groupName)
	private WebElement groupName;

	@FindBy(xpath = Constants.descriptionField)
	private WebElement descriptionField;

	@FindBy(xpath = Constants.recipientSection)
	private WebElement recipientSection;

	@FindBy(xpath = Constants.createAnotherGroup)
	private WebElement createAnotherGroup;

	@FindBy(xpath = Constants.saveButton)
	private WebElement saveButton;

	@FindBy(xpath = Constants.cancelButton)
	private WebElement cancelButton;

	@FindBy(xpath= Constants.crossIcon)
	private WebElement crossIcon;
	
	// Methods:

	public void enterGroupName(String grpName) {
		log.info("Enter the group name");
		groupName.sendKeys(grpName);
	}    
	public void enterGroupDescription(String grpDescr) {
		log.info("Enter the group description");
		descriptionField.sendKeys(grpDescr);
	}
	public void enterMember(String grpmember) {
		log.info("Enter the name of the user");
		recipientSection.sendKeys(grpmember);
	}
	public void enter() {
		log.info("Click to enter");
		pressEnterKey();
	}
	public void clickCreateAnotherGroup() {
		log.info("Click on Create Another Group checkbox");
		crossIcon.click();
	}
	public void clickAddButton() {
		log.info("Click on Add button to add the group");
		saveButton.click();
		}
	}
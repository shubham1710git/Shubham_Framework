package com.xm.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.xm.qa.util.UtilPage;;

public class AddGroupPage extends UtilPage{

	Logger log = Logger.getLogger(AddGroupPage.class);
	public AddGroupPage(WebDriver driver){
		super(driver);
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
		clickAndEnterText(groupName, grpName);
		
	}    
	public void enterGroupDescription(String grpDescr) {
		log.info("Enter the group description");
		clickAndEnterText(descriptionField, grpDescr);
	}
	public void enterMember(String grpmember) {
		log.info("Enter the name of the user");
		clickAndEnterText(recipientSection, grpmember);
	}
	public void enter() {
		log.info("Click to enter");
		pressEnterKey();
	}
	public void clickCreateAnotherGroup() {
		log.info("Click on Create Another Group checkbox");
		clickWebElementFluently(crossIcon);
	}
	public void clickAddButton() {
		log.info("Click on Add button to add the group");
		clickWebElementFluently(saveButton);
		}
	}
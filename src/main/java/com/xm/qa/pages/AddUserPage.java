package com.xm.qa.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xm.qa.base.TestBase;
import com.xm.qa.constants.Constants;

public class AddUserPage extends TestBase{

	Logger log = Logger.getLogger(AddUserPage.class);
	
	public AddUserPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= Constants.ldapCheckbox) //The ldap checkbox
	private WebElement ldapCheckbox;
	
	@FindBy(xpath= Constants.firstName)//Firstname
	private WebElement firstName;
	
	@FindBy(xpath= Constants.lastName)//Lastname
	private WebElement lastName;
	
	@FindBy(xpath= Constants.userID)//UseriD, should be unique
	private WebElement userID;
	
	@FindBy(xpath= Constants.newPassword) //password
	private WebElement newPassword;
	
	@FindBy(id= Constants.confirmPassword) //confirm password
	private WebElement confirmPassword;
	
	@FindBy(xpath= Constants.forceResetPassword) 
	private WebElement forceResetPassword;
	
	@FindBy(xpath= Constants.roles)
	private WebElement roles;
	
	@FindBy(xpath= Constants.addButton)
	private WebElement addButton;
	
	 @FindBy(xpath= Constants.deletedUser)
	 private WebElement deletedUser;
	 
	 @FindBy(xpath= Constants.newUser)
	 private WebElement newUser;
	
	// Methods:
	
	public void clickLdap() {
		log.info("Click on Ldap checkbox to uncheck it");
		ldapCheckbox.click();
	}
	public void enterFirstName(String firstname) {
		log.info("Enter the first name");
		firstName.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		log.info("Enter the lastname");
		lastName.sendKeys(lastname);
	}
	public void enterUserId(String userid) {
		log.info("Enter the UserID");
		userID.sendKeys(userid);
	}
	public void enterPassword(String pass) {
		log.info("Enter to set the password");
		newPassword.sendKeys(pass);
	}
	public void enterConfirmPassword(String confirmpass) {
		log.info("Enter to confirm the password");
		confirmPassword.sendKeys(confirmpass);
	}
	public void clickToDisableForcePasswordReset() {
		log.info("Uncheck the Force Password Reset checkbox");
		forceResetPassword.click();
	}
	public void enterTextForRole() {
		log.info("Enter the role");
		roles.sendKeys("Full");
	}
	public void pressEnterToSelect() {
		log.info("Used to Enter");
		pressEnterKey();
	}
	
	public void clickAddButton() {
		log.info("Click on Add Button");
		addButton.click();
	}
	public boolean isElementPresent() {
		  log.info("Check whether the element is present");
		  return isWebElementDisplayed(newUser);
	  }
}



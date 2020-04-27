package com.xm.qa.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xm.qa.base.TestBase;
import com.xm.qa.constants.Constants;

public class UsersPage extends TestBase{
	Logger log = Logger.getLogger(UsersPage.class);

	public UsersPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	   @FindBy(xpath= Constants.userLink)
	   private WebElement userLink;
	   
	   @FindBy(xpath= Constants.userSearchButton)
	   private WebElement userSearchButton;
	   
	   @FindBy(xpath= Constants.userISuperviseButton)
	   private WebElement userISuperviseButton;
	   
	   @FindBy(xpath= Constants.allUsersButton)
	   private WebElement allUsersButton;
	   
	   @FindBy(xpath= Constants.userAddButton)
	   private WebElement userAddButton;
	   
	   @FindBy(xpath= Constants.exportButton)
	   private WebElement exportButton;
	   
	   @FindBy(xpath= Constants.viewUserByRoleLink)
	   private WebElement viewUserByRoleLink;
	   
	   @FindBy(xpath= Constants.userPerformanceLink)
	   private WebElement userPerformanceLink;
	   
	   @FindBy(xpath= Constants.searchWebServiceUsersLink)
	   private WebElement searchWebServiceUsersLink;
	   
	   @FindBy(xpath= Constants.addWebServiceUser)
	   private WebElement addWebServiceUser;
	   
	   @FindBy(xpath= Constants.deletedUser)
	   private WebElement deleteUser;
	   
	   @FindBy(xpath= Constants.uDeletedUser)
	   private WebElement uDeletedUser;
	   
	   @FindBy(xpath= Constants.deleteButton)
	   private WebElement deleteButton;
	   
	   @FindBy(xpath= Constants.chickenDelete)
	   private WebElement chickenDelete;
	   
	   @FindBy(xpath= Constants.chickenCancelButton)
	   private WebElement chickenCancelButton;
	   
	   public void clickSearchButton() {
			  log.info("Click on Search button");
			  userSearchButton.click();
		  }
		  public void clickUserIsuperviseButton() {
			  log.info("Click on User I Supervise");
			  userISuperviseButton.click();
		  }
		  public void clickAllUserButtonbutton() {
			  log.info("Click on All User");
			  allUsersButton.click();
		  }
		  public void clickAddUserButton() {
			  log.info("Click on Add User button");
			  userAddButton.click();
		  }
		  public void clickExport() {
			  log.info("Click on Export button");
			  exportButton.click();
		  }
		  public void clickUserslink() {
			  log.info("Click on Users link to see the functionalities");
			  userLink.click();  
		  }
		  public void addWebServiceUser() {
			  log.info("Add web service user");
			  addWebServiceUser.click();
		  }
		  public void findWebServiceUser() {
			  log.info("Find web service users");
			  searchWebServiceUsersLink.click();
		  }
		  public void clickCheckbox() {
			  log.info("Click on checkbox beside the user to delete it");
			  deleteUser.click();
		  }
		  public void clickDeleteButton() {
			  log.info("Click on Delete button");
			  deleteButton.click();
		  }
		  public void clickChickenDeleteButton() {
			  log.info("Click on Chicken Delete button to confirm the deletion of the user");
			  chickenDelete.click();
		  }
		  public void clickChickenCancelButton() {
			  log.info("Click to Cancel the Delete process");
			  chickenCancelButton.click();
		  }
		  public boolean elementPresent() {
			  log.info("Check whether the element is present");
			  return isWebElementDisplayed(uDeletedUser);
		  }

	  

}

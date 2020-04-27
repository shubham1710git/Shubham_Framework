package com.xm.qa.pages;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xm.qa.base.TestBase;
import com.xm.qa.constants.Constants;

public class FindWSUPage extends TestBase{
	Logger log = Logger.getLogger(FindWSUPage.class);

	public FindWSUPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Constants.allButton)
	private WebElement allButton;
	
    @FindBy(xpath = Constants.resultsPerPageDropdown)
    private WebElement resultsPerPageDropdown;
    
    @FindBy(xpath = Constants.findButton)
    private WebElement findButton;
    
    @FindBy(xpath = Constants.userTextField)
    private WebElement userTextField;
    
    public void clickAllButton() {
    	log.info("Click on All button");
    	allButton.click();
    }    
    public void enterUserId(String userID) {
    	log.info("Enter the userID you want to search");
    	userTextField.sendKeys(userID);
    }    
    public void clickFindButton() {
    	log.info("Click on Find button");
    	findButton.click();
    }
}
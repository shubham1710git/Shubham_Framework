package com.xm.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.xm.qa.util.UtilPage;

public class FindWSUPage extends UtilPage{
	Logger log = Logger.getLogger(FindWSUPage.class);

	public FindWSUPage(WebDriver driver){
		super(driver);
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
    	clickWebElementFluently(allButton);
    }    
    public void enterUserId(String userID) {
    	log.info("Enter the userID you want to search");
    	clickAndEnterText(userTextField, userID);
    }    
    public void clickFindButton() {
    	log.info("Click on Find button");
    	clickWebElementFluently(findButton);
    }
}
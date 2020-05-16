package com.xm.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.xm.qa.util.UtilPage;

public class LoginPage extends UtilPage{
	//Logger log = Logger.getLogger(LoginPage.class);

	public LoginPage(WebDriver driver){
		super(driver);
	}
	@FindBy(xpath = Constants.logo)
	private WebElement logo;
	
	@FindBy(xpath = Constants.newsAndUpdatesLink)
	private WebElement newsAndUpdatesLink;
	
	@FindBy(xpath = Constants.supportLink)
	private WebElement supportLink;
	
	@FindBy(xpath = Constants.username)
	private WebElement username;
	
	@FindBy(xpath = Constants.password)
	private WebElement password;
	
	@FindBy(xpath = Constants.forgotPasswordLink)
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = Constants.loginBtn)
	private WebElement loginBtn;
	
	@FindBy(xpath = Constants.homeTab)
	private WebElement homeTab;
	
	//Methods
	
	public void clickLogo() {
		//log.info("Click on logo of xMatters");
		//clickWebElementFluently(logo);
		logo.click();
	}
	public void clickNewsUpdatesLink() {
		//log.info("Click on this link to view the News Updates of xMatters");
		//clickWebElementFluently(newsAndUpdatesLink);
		newsAndUpdatesLink.click();
	}
	public void clickSupportLink() {
		//log.info("Click on xMatters' Support link");
		//clickWebElementFluently(supportLink);
		supportLink.click();
	}
	public void enterUserName(String userName) {
		//log.info("Enter the username of the User");
		//clickAndEnterText(username, userName);
		username.sendKeys(userName);
	}
	public void enterPassword(String pwd) {
		//log.info("Enter the password of the User");
		//clickAndEnterText(password, pwd);
		password.sendKeys(pwd);
	}
	public void clickForgotPasswordLink() {
		//log.info("Click on Forgot Password link in case the user is unable to remember the password");
		//clickWebElementFluently(forgotPasswordLink);
		forgotPasswordLink.click();
	}
	public void clickLoginBtn() {
		//log.info("Click on Login button to login to the application");
		//clickWebElementFluently(loginBtn);
		loginBtn.click();
	}
	public boolean checkHomeTab() {
		//log.info("Check whether user is able to view the Home tab");
		return homeTab.isDisplayed();
		//return isWebElementPresent(homeTab);
	}
	public void loginToApplication(String userName, String pwd) throws InterruptedException {
		//log.info("Function to log into application");
		//clickAndEnterText(username, userName);
		username.sendKeys(userName);
		//clickAndEnterText(password, pwd);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		//clickWebElementFluently(loginBtn);
		loginBtn.click();
	}
}
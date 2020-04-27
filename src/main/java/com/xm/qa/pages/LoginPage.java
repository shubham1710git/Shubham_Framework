package com.xm.qa.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xm.qa.base.TestBase;
import com.xm.qa.constants.Constants;

public class LoginPage extends TestBase{
	Logger log = Logger.getLogger(LoginPage.class);

	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
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
		log.info("Click on logo of xMatters");
		logo.click();
	}
	public void clickNewsUpdatesLink() {
		log.info("Click on this link to view the News Updates of xMatters");
		newsAndUpdatesLink.click();
	}
	public void clickSupportLink() {
		log.info("Click on xMatters' Support link");
		supportLink.click();
	}
	public void enterUserName(String userName) {
		log.info("Enter the username of the User");
		username.sendKeys(userName);
	}
	public void enterPassword(String pwd) {
		log.info("Enter the password of the User");
		password.sendKeys(pwd);
	}
	public void clickForgotPasswordLink() {
		log.info("Click on Forgot Password link in case the user is unable to remember the password");
		forgotPasswordLink.click();
	}
	public void clickLoginBtn() {
		log.info("Click on Login button to login to the application");
		loginBtn.click();
	}
	public boolean checkHomeTab() {
		log.info("Check whether user is able to view the Home tab");
		return homeTab.isDisplayed();
	}
}
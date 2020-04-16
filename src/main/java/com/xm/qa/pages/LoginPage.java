package com.xm.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xm.qa.base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='logo']")
	WebElement logo;
	
	@FindBy(xpath = "//a[text()='News & Updates']")
	WebElement newsAndUpdatesLink;
	
	@FindBy(xpath = "//a[text()='Support']")
	WebElement supportLink;
	
	@FindBy(xpath = "//*[@id='username']")
	WebElement username;
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//span[@class='form-text']")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//button[@id='submitButton']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//li[@id='HOME']")
	WebElement homeTab;
	
	//Methods
	
	public void clickLogo() {
		logo.click();
	}
	public void clickNewsUpdatesLink() {
		newsAndUpdatesLink.click();
	}
	public void clickSupportLink() {
		supportLink.click();
	}
	public void enterUserName(String userName) {
		username.sendKeys(userName);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickForgotPasswordLink() {
		forgotPasswordLink.click();
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	public boolean checkHomeTab() {
		return homeTab.isDisplayed();
	}
}

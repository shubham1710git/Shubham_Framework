package com.xm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.xm.qa.util.UtilPage;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;  
	// Create the constructor of TestBase class
	
	public TestBase() throws IOException{
		try
		{
			prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\optimuslap16\\Desktop\\Framework\\Shubham\\src\\main\\"
				+ "java\\com\\xm\\qa\\config\\config.properties");
		prop.load(ip);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		}
	
    public static void intialization() {
    	String browserName = prop.getProperty("browser");
    	if(browserName.equals("chrome")) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\optimuslap16\\Desktop\\Automation\\chromedriver_win32"
    			+ "\\chromedriver.exe");
    	driver = new ChromeDriver();
    	}
    	else if(browserName.equals("FF")) {
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\optimuslap16\\Desktop\\Automation\\"
    				+ "geckodriver-v0.26.0-win64\\geckodriver.exe");
    		driver = new FirefoxDriver();
    	}
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(UtilPage.Page_Timeout, TimeUnit.SECONDS);    // we have created the util page to remove the hard coding
    	driver.manage().timeouts().implicitlyWait(UtilPage.Implicit_Wait, TimeUnit.SECONDS);
    	driver.get(prop.getProperty("url"));    		
    	}
    	
    }

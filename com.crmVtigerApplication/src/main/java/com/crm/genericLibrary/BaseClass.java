package com.crm.genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.ObjectRepo.HomePage;
import com.crm.ObjectRepo.LoginPage;

public class BaseClass {
	public JavaUtility jlib=new JavaUtility();
	public WebDriverUtility wlib=new WebDriverUtility();
	public TestDataUtility tlib=new TestDataUtility();
	public CommonDataUtility clib=new CommonDataUtility();
	public WebDriver driver=null;
	@BeforeSuite
	public void BS() {
		System.out.println("=========DataBse Open=======");
	}
	
	@BeforeClass
	public void BC() throws IOException {
		String browser=clib.getPropertiesFile("browser");
		driver=wlib.getBrowser(browser);
		wlib.getImplicitWait(driver, 10);;
		String url=clib.getPropertiesFile("url");
		driver.get(url);
		wlib.getMaximizeWindows(driver);;
		System.out.println("Browser Lunch SucessFully....");
	}
	
	@BeforeMethod
	public void BM() throws IOException {
		String username=clib.getPropertiesFile("username");
		String password=clib.getPropertiesFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.LoginApp(username, password);
		System.out.println("Login SucessFull.....");
	}
	
	@AfterMethod
	public void AM() {
		HomePage hp=new HomePage(driver);
		WebElement signoutImg=hp.getLogoutImg();
		wlib.getMouseOverAction(driver, signoutImg);
		WebElement signout=hp.getSignoutEdt();
		wlib.getExplicitWaitforVisiblityofWebElement(driver, 5, signout);
		signout.click();
		System.out.println("Log out SucessFul...");
	}
	
	
	@AfterClass
	public void AC() {
		driver.quit();
		System.out.println("Browser Close SucessFul...");
	}
	
	
	@AfterSuite
	public void AS() {
		System.out.println("========Data Base Close======");
	}
}

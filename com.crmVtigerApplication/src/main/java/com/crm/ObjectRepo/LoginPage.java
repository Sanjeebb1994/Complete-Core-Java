package com.crm.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Step1:Initialize Element/Lazy Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Step2:Declaration Element
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement  usernameEdt;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordEdt;
	
	@FindAll({@FindBy(xpath="//input[@id='submitButton']"), @FindBy(id="submitButton")})
	private WebElement loginEdt;
	
	//Step3: Provide getters Method
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginEdt() {
		return loginEdt;
	}
	
	//Step4: Business Logic Method
	public void LoginApp(String username,String password) {
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginEdt.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

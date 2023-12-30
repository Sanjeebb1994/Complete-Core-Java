package com.crm.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Step1: Lazy Initialization By Constructor
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//Declaration
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement logoutImg;
		
		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement signoutEdt;
		
		@FindBy(xpath="(//a[text()='Organizations'])[1]")
		private WebElement organizationEdit;
		
		//Getters Method
		public WebElement getOrganizationEdit() {
			return organizationEdit;
		}

		public WebElement getLogoutImg() {
			return logoutImg;
		}

		public WebElement getSignoutEdt() {
			return signoutEdt;
		}
}

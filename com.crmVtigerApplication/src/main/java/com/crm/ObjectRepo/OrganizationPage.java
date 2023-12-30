package com.crm.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	//Step1: Lazy Initialization By Constructor
			public OrganizationPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
	//Step2: Declaration
			@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
			private WebElement lokupBtn;
			
			@FindBy(xpath="//input[@name='accountname']")
			private WebElement orgNameEdt;
			
			@FindBy(xpath="//input[@name='website']")
			private WebElement webSiteEdt;
			
			@FindBy(xpath="//input[@name='tickersymbol']")
			private WebElement ticketSymbolEdt;
			
			@FindBy(xpath="//input[@name='account_name']")
			private WebElement memberEdit;
			
			@FindBy(xpath="//input[@name='employees']")
			private WebElement employeeEdt;
			
			@FindBy(xpath="//input[@name='email2']")
			private WebElement email12Edt;
			
			@FindBy(xpath="//select[@name='industry']")
			private WebElement industryEdit;
			
			@FindBy(xpath="//select[@name='accounttype']")
			private WebElement accountTypeEdt;
			
			@FindBy(xpath="//input[@name='emailoptout']")
			private WebElement emailoutputEdt;
			
			@FindBy(xpath="(//input[@name='assigntype'])[1]")
			private WebElement radioBtn1;
			
			@FindBy(xpath="(//input[@name='assigntype'])[2]")
			private WebElement radiobtn2;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement saveBtn;
			
			@FindBy(xpath="//span[text()='Creating New Organization']")
			private WebElement CreatingNewOrganizationtxt;
			
			@FindBy(xpath="//span[@class='dvHeaderText']")
			private WebElement headerTxt;
			
			//Declaration
			public WebElement getLokupBtn() {
				return lokupBtn;
			}

			public WebElement getOrgNameEdt() {
				return orgNameEdt;
			}

			public WebElement getWebSiteEdt() {
				return webSiteEdt;
			}

			public WebElement getTicketSymbolEdt() {
				return ticketSymbolEdt;
			}

			public WebElement getMemberEdit() {
				return memberEdit;
			}

			public WebElement getEmployeeEdt() {
				return employeeEdt;
			}

			public WebElement getEmail12Edt() {
				return email12Edt;
			}

			public WebElement getIndustryEdit() {
				return industryEdit;
			}

			public WebElement getAccountTypeEdt() {
				return accountTypeEdt;
			}

			public WebElement getEmailoutputEdt() {
				return emailoutputEdt;
			}

			public WebElement getRadioBtn1() {
				return radioBtn1;
			}

			public WebElement getRadiobtn2() {
				return radiobtn2;
			}

			public WebElement getSaveBtn() {
				return saveBtn;
			}

			public WebElement getCreatingNewOrganizationtxt() {
				return CreatingNewOrganizationtxt;
			}

			public WebElement getHeaderTxt() {
				return headerTxt;
			}
			
}

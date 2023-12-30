package com.crm.OrganiZation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.ObjectRepo.HomePage;
import com.crm.ObjectRepo.OrganizationPage;
import com.crm.genericLibrary.BaseClass;

public class CheckHomePageVisible_TC1 extends BaseClass {
	
	@Test(priority = 1,invocationCount = 2)
	public void CheckHomePage_TC1() {
		System.out.println("Home Page Visible....");
	}
	public SoftAssert sa=new SoftAssert();
	
	@Test(priority = 2,invocationCount = 2)
	public void Create_New_Organization_TC2() throws EncryptedDocumentException, IOException {
		
		//Step1: Click On Organization Module
		HomePage hp=new HomePage(driver);
		WebElement organization=hp.getOrganizationEdit();
		wlib.getExplicitWaitforVisiblityofWebElement(driver, 7, organization);
		organization.click();
		
		//Step2: Click on Lookup Btn
		OrganizationPage op=new OrganizationPage(driver);
		WebElement lkpbtn=op.getLokupBtn();
		wlib.getExplicitWaitforClickableofWebElement(driver, 10, lkpbtn);
		lkpbtn.click();
		
		//Step3: Create new Organization
		WebElement organizationtxt=op.getCreatingNewOrganizationtxt();
		wlib.getExplicitWaitforVisiblityofWebElement(driver, 5, organizationtxt);
		String orgName=tlib.getStringTestData("CreateOrganiZation", 1, 1)+jlib.getRandomNumber(100);
		String website=tlib.getStringTestData("CreateOrganiZation", 1, 2);
		String member=tlib.getStringTestData("CreateOrganiZation", 1, 4)+jlib.getRandomNumber(10);
//		double Employees=tlib.getNumericTestData("CreateOrganiZation", 1, 6);
		String email=tlib.getStringTestData("CreateOrganiZation", 1, 6);
		String industry= tlib.getStringTestData("CreateOrganiZation", 1, 7);
		String type=tlib.getStringTestData("CreateOrganiZation", 1, 8);
		op.getOrgNameEdt().sendKeys(orgName);
		op.getWebSiteEdt().sendKeys(website);
		op.getMemberEdit().sendKeys(member);
		op.getEmail12Edt().sendKeys(email);
		op.getIndustryEdit().sendKeys(industry);
		op.getAccountTypeEdt().sendKeys(type);
		op.getEmailoutputEdt().click();
		op.getRadioBtn1().click();
		op.getSaveBtn().click();
		
		//Step4: Verify Organization
		String ActualString=op.getHeaderTxt().getText();
		sa.assertEquals(ActualString, orgName);
//		sa.assertAll();
		System.out.println("Verify SucessFul....");
	}
}

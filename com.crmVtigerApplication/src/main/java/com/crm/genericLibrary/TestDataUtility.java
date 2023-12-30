package com.crm.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is use for Retrieve Test Data
 * @author DELL
 *
 */
public class TestDataUtility {
	/**
	 * This Method is Use for Get String Excel Sheet Data.
	 * @param sheetName
	 * @param rowindex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringTestData(String sheetName,int rowindex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\My_New_Practice_Projects\\com.crmVtigerApplication\\DataDriven\\OrganizationModule.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowindex);
		Cell cell=rw.getCell(cellIndex);
		String data=cell.getStringCellValue();
		wb.close();
		return data;
	}
	
	/**
	 * This Method is Use for Get IntigerValue Excel Sheet Data.
	 * @param sheetName
	 * @param rowindex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumericTestData(String sheetName,int rowindex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\My_New_Practice_Projects\\com.crmVtigerApplication\\DataDriven\\OrganizationModule.xlsx");
		WorkbookFactory wb=new WorkbookFactory();
		Workbook ab=wb.create(fis);
		Sheet sh=ab.getSheet(sheetName);
		Row rw=sh.getRow(rowindex);
		Cell cell=rw.getCell(cellIndex);
		double data=cell.getNumericCellValue();
		return data;
	}
}

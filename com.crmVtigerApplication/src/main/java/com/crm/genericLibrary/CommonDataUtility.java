package com.crm.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This Class Is Design for Common Data 
 * @author DELL
 *
 */
public class CommonDataUtility {
	/**
	 * This Method is use for retrieve Common Data From Properties File.
	 * @throws IOException
	 */
	public String getPropertiesFile(String key) throws IOException  {
		FileInputStream fis=new FileInputStream("./DataDriven/commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}
}

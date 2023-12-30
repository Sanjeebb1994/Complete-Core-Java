package com.crm.genericLibrary;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used for getRandom Number
	 * @return
	 */
	public int getRandomNumber(int range) {
		Random rn=new Random();
		int number=rn.nextInt(100);
		return number;
	}
	
	
	
	/**
	 * This method is used for get date and Time
	 * @return
	 */
	public String getDateAndTime() {
		Date dt=new Date();
		String dateAndTime=dt.toString();
		System.out.println(dateAndTime);
		String yyyy=dateAndTime.split(" ")[5];
		String dd=dateAndTime.split(" ")[2];
		int mm=dt.getMonth()+1;
		String actualDateAndTime=dd+"/"+mm+"/"+yyyy;
		return actualDateAndTime;		
	}

}

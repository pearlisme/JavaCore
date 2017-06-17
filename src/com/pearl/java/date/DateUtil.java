package com.pearl.java.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public DateUtil() {

	this.displayMonth();
	this.displayTime();
	}

	public void displayTime() {

	Date date = new Date();
	
	String strDateFormat = "HH:mm:ss";
	
	SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	
	System.out.println(sdf.format(date));
	}
	
	public void displayMonth(){
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime()); 
	}
}

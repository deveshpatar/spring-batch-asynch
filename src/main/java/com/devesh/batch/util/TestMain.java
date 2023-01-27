package com.devesh.batch.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestMain {

	/*public static void main(String[] args) {
		 Timestamp ts=new Timestamp(System.currentTimeMillis());  
         Date date=ts;  
         System.out.println(date);    
         
         System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	} */
	
	public static String toDateOld(long timestamp) {
	    Date date = new Date(timestamp * 1000);
	    return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	public static String toDate(long timestamp) {
	    LocalDate date = Instant.ofEpochMilli(timestamp * 1000).atZone(ZoneId.systemDefault()).toLocalDate();
	    return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

}

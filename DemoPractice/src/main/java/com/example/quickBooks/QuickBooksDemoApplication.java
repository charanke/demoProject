package com.example.quickBooks;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickBooksDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickBooksDemoApplication.class, args);
		
	//	addDays(Timestamp.valueOf("2022-11-28 17:08:48.557"), 2);

//		 Timestamp ts = new Timestamp(10000);
//		  
//	        // Display the timestamp object
//	        System.out.println("Timestamp time: "
//	                           + ts.toString());
//	  
//	        // Set the value of timestamp object
//	        // using setTime function
//	        ts.setTime(1000000000);
//	  
//	        // Display the new timestamp object
//	        System.out.println("New Timestamp time: "
//	                           + ts.toString());
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Timestamp ts = new Timestamp(calendar.getTimeInMillis());
        System.out.println("New Timestamp time: "+calendar.getTime());
        System.out.println("New Timestampdffdg time: "+ts);

	}
	
	public static Timestamp addDays(Timestamp date, int days) { 
		Calendar cal = Calendar.getInstance(); cal.setTime(date);
	cal.add(Calendar.DATE, days);
	
	System.out.println(new Timestamp(cal.getTime().getTime())); 
	
	 return new Timestamp(cal.getTime().getTime()); 
	 }
	}



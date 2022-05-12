package com.chainsys.datelessons;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class WorkingWithTime<Calender> {
public static void displayCurrentDate()
{
	Calendar vCalendar = Calendar.getInstance();
	Date date = vCalendar.getTime();
	System.out.println(date);
	}
   public static void SimpleDateFormat()
   {
	   Calendar vCalendar = Calendar.getInstance();
	   Date date = vCalendar.getTime();
	   System.out.println(date);
	   java.text.SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
	   System.out.println(dateFormat.format(date));
	    }
   public static void displayDOB()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your DOB:(YYYY-MM-DD");
	   String dob=sc.nextLine();
	   sc.close();
	   int year = Integer.parseInt(dob.substring(0, 4));
	   int month = Integer.parseInt(dob.substring(5, 7))-1;
	   int day = Integer.parseInt(dob.substring(8, 10));
	   System.out.println(year+"-"+month+"-"+day);
   }
   public static void displayDOB1()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your DOB:(YYYY-MM-DD");
	   String dob=sc.nextLine();
	   sc.close();
	   int year = Integer.parseInt(dob.substring(0, 4));
	   int month = Integer.parseInt(dob.substring(5, 7))-1;
	   int day = Integer.parseInt(dob.substring(8, 10));
	   System.out.println(year+"-"+month+"-"+day);
	   
	   Calendar date = new GregorianCalendar(year,month,day);
	   Date dob1 = date.getTime();
	   SimpleDateFormat f1 =new SimpleDateFormat("YYYY-MM-DD");
	   System.out.println("DOB"+ f1.format(dob1));
   }
   public static void simpleDateFormat(Calendar date, DateFormat f1) {
	   
	   date.add(Calendar.YEAR, 60);
	   date.add(Calendar.MONTH, 1);
	   date.add(Calendar.DAY_OF_MONTH, 1);
	   date.add(Calendar.DATE, -1);
   System.out.println("DOB"+ f1.format(date.getTime()));
   }
}
   





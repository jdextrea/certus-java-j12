/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.proyi18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author jdextre
 */
public class Horas {
    public static void main(String args[]) {
    
        //Mostrar la fecha actual
        LocalDate currentDate = LocalDate.now();
	System.out.println("Current Date is: "+currentDate);
        
        LocalDate pastDate = LocalDate.of(2016, 01, 23);
	System.out.println("Given Date is: "+pastDate);
        
         LocalDate givenDate3 = LocalDate.of(2023, 11, 14);  
	 System.out.println(givenDate3.isLeapYear());
         
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	String stringDate = "2017/10/23";
        LocalDate date = LocalDate.parse(stringDate, formatter);
        System.out.println("Local Date: "+date);
         
        
        //LocalDate dato = LocalDate.parse("2018-10-30");
        //LocalDate newDate = date.plusDays(10);
        //System.out.println(date);
        //System.out.println(newDate);
        //LocalDate date = LocalDate.parse("2018-10-30");
        //LocalDate newDate = date.plusMonths(3);
        //System.out.println(date);
        //System.out.println(newDate);
        
         validateJavaDate("12/29/2016");
	validateJavaDate("12-29-2016");
	validateJavaDate("12,29,2016");
    }
    
    public static boolean validateJavaDate(String strDate)
   {
	/* Check if date is 'null' */
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	/* Date is not 'null' */
	else
	{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
	}
   }
}

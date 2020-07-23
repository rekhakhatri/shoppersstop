package com.java.shopperstop;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Bill {

     static void bill() {
		Format dateFormat = new SimpleDateFormat("EEE dd.MM.yyyy");
	    String currDate = dateFormat.format(new Date());	    
    	    
	    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
		Date date = new Date();
		timeFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		
    	System.out.println("                           ****|SHOPPERSTOP BILL|****");
    	System.out.println("--------------------------------------------------------------------------------------------");
 		System.out.println("Date : "+currDate+"                                Time : "+timeFormat.format(date));
 		System.out.println("--------------------------------------------------------------------------------------------");
 		System.out.println("Customer Name : "+User.userName+"                     Phone No. : "+User.userNumber);
 		
 		//Carts items added
 		int i = 0;
 		int qty = 0;
 		double total = 0;
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.printf("%-20s%-20s%-20s%-20s\n","S.No   Item","  | Cost","  | Quantity","  | Total");
		System.out.println("--------------------------------------------------------------------------------------------");
		for(Cart item: Cart.cart) {
			qty = qty + item.qty;
			total = total + item.total;
			System.out.println((++i)+". "+item);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Total Qty : "+qty+"                                             Sub Total : "+total);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		
		double CGST = (total*9)/100;
		double SGST = (total*9)/100;
		double GST = (total*18)/100;
		double grandTotal = total+CGST+SGST+GST;
		System.out.println("CGST @9% :                                                                  "+CGST);
		System.out.println("SGST @9% :                                                                  "+SGST);
		System.out.println("Total GST @18% :                                                             "+GST);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Grand Total :                                                         "+grandTotal);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("                      Thank you for visiting *SHOPPERSTOP*                        ");
		System.out.println("                             Have a Nice Day                                      ");
		System.out.println("	                          Visit Again                                         ");
		System.out.println("--------------------------------------------------------------------------------------------");


     }

}

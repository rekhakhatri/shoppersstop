package com.java.shopperstop;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

class User{
	
	protected static String userName;
	protected static String userNumber;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public User(String userName, String userNumber) {
		this.userName = userName;
		this.userNumber = userNumber;
	}
	
}

class Index{
     
	static void displayIndex() {
		
		
		Format dateFormat = new SimpleDateFormat("EEE dd.MM.yyyy");
	    String currDate = dateFormat.format(new Date());	    
	    
	    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
		Date date = new Date();
		timeFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		 
		System.out.println("                           ****|SHOPPERSTOP|****");
		System.out.println("                      ****WELCOME TO SHOPPERSTOP****");
		System.out.println("Date : "+currDate+"                                           Time : "+timeFormat.format(date));
		System.out.println("************************************************************************************");
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name : ");
		User.userName = scan.nextLine();
		
		System.out.println("Enter your Phone number(10 digit):");
		User.userNumber = scan.next();
		
			
        displayChoice();
		
	}
	
	static void displayChoice() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("                      ****WELCOME "+User.userName+" TO SHOPPERSTOP****");
		System.out.println("************************************************************************************");
		System.out.println("                             ****WELCOME TO HOMEPAGE****");
		System.out.println("CATEGORIES\n 1. Clothes\n 2. Electronics \n 3. HomeAppliances \n 4. Books \n 5.Footwear \n 6. View Cart \n 7. Exit \n\nEnter your choice:");
        
		int choice = scan.nextInt();
		System.out.println("************************************************************************************");
		
	  
	    	switch (choice) {
			case 1:
				Clothes clothes = new Clothes();
				clothes.selectClothesCategory();
				break;
				
			case 2:
				Electronics electronics = new Electronics();
				electronics.selectElectronicsCategory();
				break;
				
			case 3:
				Appliances appliances = new Appliances();
				appliances.selectAppliancesCategory();
				break;	
			
			case 6:
				
				if(Cart.cart.size() != 0) {
					int i = 0;
					System.out.println("----------------------------------------------------------------------------------");
					System.out.printf("%-20s%-20s%-20s%-20s\n","S.No   Item","  | Cost","  | Quantity","  | Total");
					System.out.println("----------------------------------------------------------------------------------");
					for(Cart item: Cart.cart) {
						System.out.println((++i)+". "+item);
					}
					
					System.out.println("Do you want to remove items from cart ?");
					String status = scan.next();
					if(status.equalsIgnoreCase("Y")) {
						//Removing from cart
						System.out.println("Enter the S.No of the item you want to remove ");
						int no = scan.nextInt();
						Cart.cart.remove(no-1);
						System.out.println("Item removed from cart");
						Index.displayChoice();
					}else {
						Index.displayChoice();
					}
				}else {
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%      No items added to cart        %%%%%%%%%%%%%%%%%%%%%");
					Index.displayChoice();
				}
				
			case 7:
				System.out.println("Do you want to exit? \n 1. Bill \n 2. Home Page \n 3. Exit");
				int option = scan.nextInt();
				     switch (option) {
					case 1:
						Bill.bill();
						System.exit(0);
						break;
					case 2:
						Index.displayIndex();
						break;
					case 3:
						System.exit(0);
						break;

					default:
						System.out.println("INVALID INPUT");
						break;
					}
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
			}
	    
	}
}

public class Home {

	public static void main(String[] args) {
		ListItems.allListItems();
		Index index = new Index();
		index.displayIndex();
	}

}

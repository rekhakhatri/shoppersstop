package com.java.shopperstop;

import java.util.Scanner;

public class Appliances extends ListItems{
static void selectAppliancesCategory() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ELECTRONICS \n 1. WaterPurifier  \n 2. Geyser \n 3. Fan \n 4. Cooler\n 5. Home Page \n6. Exit \nEnter your choice : ");
		
		int choice = scan.nextInt();
		System.out.println("************************************************************************************");

		
			switch (choice) {
			case 1:
				selectInWaterPurifierCategory();
				break;
				
			case 2:
				selectInGeyserCategory();
				break;
				
			case 3:
				selectInFanCategory();
				break;
				
			case 4:
				selectInCoolerCategory();
				break;
			
			case 5:
				Index.displayChoice();
				break;
				
			case 6:
				System.out.println("Do you want to exit? \n 1. Bill \n 2. Home Page \n 3. Exit");
				int option = scan.nextInt();
				     switch (option) {
					case 1:
						Bill.bill();
						System.exit(0);
						break;
					case 2:
						Index.displayChoice();
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
				
			}
	}

    static void selectInWaterPurifierCategory() {
    	int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems purifier : purifiers) {
			System.out.println((++i)+". "+purifier);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			selectAppliancesCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*purifiers.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(purifiers.get(choice-1).name,purifiers.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				selectAppliancesCategory();
			}else {
				selectAppliancesCategory();
			}
		
			
		}
    }
    
    static void selectInGeyserCategory() {
    	int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems geyser : geysers) {
			System.out.println((++i)+". "+geyser);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			selectAppliancesCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*geysers.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(geysers.get(choice-1).name,geysers.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				selectAppliancesCategory();
			}else {
				selectAppliancesCategory();
			}
		
			
		}
    }
    
    static void selectInFanCategory() {
    	int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems fan : fans) {
			System.out.println((++i)+". "+fan);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			selectAppliancesCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*fans.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(fans.get(choice-1).name,fans.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				selectAppliancesCategory();
			}else {
				selectAppliancesCategory();
			}
		
			
		}
    }
    
    static void selectInCoolerCategory(){
    	int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems cooler : coolers) {
			System.out.println((++i)+". "+cooler);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			selectAppliancesCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*coolers.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(coolers.get(choice-1).name,coolers.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				selectAppliancesCategory();
			}else {
				selectAppliancesCategory();
			}
		
			
		}
    }

}

package com.java.shopperstop;

import java.util.Scanner;

public class Electronics {
static void selectElectronicsCategory() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ELECTRONICS \n 1. Mobiles \n 2. Cameras \n 3. Home page \n 4. Exit\nEnter your choice : ");
		
		int choice = scan.nextInt();
		System.out.println("************************************************************************************");

		
			switch (choice) {
			case 1:
				Mobile.selectInMobileCategory();
				break;
				
			case 2:
				Camera.selectInCamerasCategory();
				break;
				
			case 3:
				Index.displayChoice();
				break;
				
			case 4:
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

}

class Mobile extends ListItems{
	
	static void selectInMobileCategory() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems mobile : mobiles) {
			System.out.println((++i)+". "+mobile);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			Men.selectInMenCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*mobiles.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(mobiles.get(choice-1).name,mobiles.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Electronics.selectElectronicsCategory();
			}else {
				Electronics.selectElectronicsCategory();
			}
		
			
		}
	}

}

class Camera extends ListItems{
	static void selectInCamerasCategory() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems camera : cameras) {
			System.out.println((++i)+". "+camera);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			Men.selectInMenCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*cameras.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(cameras.get(choice-1).name,cameras.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Electronics.selectElectronicsCategory();
			}else {
				Electronics.selectElectronicsCategory();
			}
		
			
		}
	}
}
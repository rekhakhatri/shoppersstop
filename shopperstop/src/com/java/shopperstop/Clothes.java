package com.java.shopperstop;

import java.util.Scanner;


public class Clothes{

	static void selectClothesCategory() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("CLOTHES \n 1. Men's \n 2. Women's \n 3. Home page \n 4. Exit\nEnter your choice : ");
		
		int choice = scan.nextInt();
		System.out.println("************************************************************************************");

		
			switch (choice) {
			case 1:
				Men.selectInMenCategory();
				break;
				
			case 2:
				Women.selectInWomenCategory();
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

class Men extends ListItems{
	
	static void selectInMenCategory() {
		Scanner scan = new Scanner(System.in);
		System.out.println("MEN'S \n 1. Tshirts \n 2. Shirts \n 3. Pants \n 4. Shorts \n 5. Previous page \n 6. Home Page \nEnter your choice : ");
		
		int c = scan.nextInt();
	
			switch (c) {
			case 1:{
				tShirts();
				break;
			}
			case 2:{
				shirts();
				break;
			}
			case 3:{
				pants();
				break;
			}
			
			case 4:{
				shorts();
				break;
			}
			
			case 5:{
				Clothes.selectClothesCategory();
				break;
				
			}
			case 6:{
				Index.displayChoice();
				break;
			}
				
			default:
				System.out.println("Invalid Input");
			}
		
	}
	
	static void tShirts() {
			int i = 0;    
			System.out.printf("%-40s%-40s\n","   Brand","  Price");

			for(ListItems tshirt : tshirts) {
				System.out.println((++i)+". "+tshirt);
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
				double total = qty*tshirts.get(choice-1).price;
				
				System.out.println("are you sure want to add "+qty+" items to cart");
				System.out.println("Do you want to continue? Y/N");
				String status = scan.next();
				
				if(status.equalsIgnoreCase("Y")) {
					//Adding to cart
					Cart carts = new Cart(tshirts.get(choice-1).name,tshirts.get(choice-1).price,qty,total);
					Cart.cart.add(carts);
					System.out.println(qty+ " items added to cart");
					Men.selectInMenCategory();
				}else {
					Men.selectInMenCategory();
				}
			
				
			}
	}
	
	static void shirts() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems shirt : shirts) {
			System.out.println((++i)+". "+shirt);
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
			double total = qty*shirts.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(shirts.get(choice-1).name,shirts.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Men.selectInMenCategory();
			}else {
				Men.selectInMenCategory();
			}
		
			
		}
     }
	
	static void pants() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems pant : pants) {
			System.out.println((++i)+". "+pant);
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
			double total = qty*pants.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(pants.get(choice-1).name,pants.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Men.selectInMenCategory();
			}else {
				Men.selectInMenCategory();
			}
		
			
		}
     }
	
	static void shorts() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems shot : shorts) {
			System.out.println((++i)+". "+shot);
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
			double total = qty*shorts.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(shorts.get(choice-1).name,shorts.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Men.selectInMenCategory();
			}else {
				Men.selectInMenCategory();
			}
		
			
		}
     }
	
	
}

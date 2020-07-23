package com.java.shopperstop;

import java.util.Scanner;

class Women extends ListItems{
	
	static void selectInWomenCategory() {
		Scanner scan = new Scanner(System.in);
		System.out.println("WOMEN'S \n 1. Tshirts \n 2. Tops \n 3. Jeans \n 4. Dresses \n 5. Previous page \n 6. Home Page \nEnter your choice : ");
		
		int c = scan.nextInt();
	
			switch (c) {
			case 1:{
				kurtis();
				break;
			}
			case 2:{
				tops();
				break;
			}
			case 3:{
				jeans();
				break;
			}case 4:{
				dresses();
				break;
			}
			case 5:{
				Clothes.selectClothesCategory();
				break;
			}case 6:{
				Index.displayChoice();
				break;
			}
				
			default:
				System.out.println("Invalid Input");
			}
		
	}
	
	
	static void jeans() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems jean : jeans) {
			System.out.println((++i)+". "+jean);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			Women.selectInWomenCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*jeans.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(jeans.get(choice-1).name,jeans.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Women.selectInWomenCategory();
			}else {
				Women.selectInWomenCategory();
			}
		}
     }
	
	static void tops() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems top : tops) {
			System.out.println((++i)+". "+top);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			Women.selectInWomenCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*tops.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(tops.get(choice-1).name,tops.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Women.selectInWomenCategory();
			}else {
				Women.selectInWomenCategory();
			}
		}
     }
	
	static void kurtis() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems kurti : kurtis) {
			System.out.println((++i)+". "+kurti);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			Women.selectInWomenCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*kurtis.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(kurtis.get(choice-1).name,kurtis.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Women.selectInWomenCategory();
			}else {
				Women.selectInWomenCategory();
			}
		}
     }
	 
	static void dresses() {
		int i = 0;    
		System.out.printf("%-40s%-40s\n","   Brand","  Price");

		for(ListItems dress : dresses) {
			System.out.println((++i)+". "+dress);
		}
		System.out.println((i+1)+". Previouspage");
		System.out.println((i+2)+". Home Page");
		System.out.println((i+3)+". Exit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select choice ");
		int choice = scan.nextInt();
		
		if(choice == 7) {
			Women.selectInWomenCategory();
		}else if(choice == 8) {
			Index.displayChoice();
		}else if(choice == 9) {
			System.exit(0);
		}else if(choice >= 1 && choice <= 6) {
			System.out.println("Enter the quantity");
			int qty = scan.nextInt();
			double total = qty*dresses.get(choice-1).price;
			
			System.out.println("are you sure want to add "+qty+" items to cart");
			System.out.println("Do you want to continue? Y/N");
			String status = scan.next();
			
			if(status.equalsIgnoreCase("Y")) {
				//Adding to cart
				Cart carts = new Cart(dresses.get(choice-1).name,dresses.get(choice-1).price,qty,total);
				Cart.cart.add(carts);
				System.out.println(qty+ " items added to cart");
				Women.selectInWomenCategory();
			}else {
				Women.selectInWomenCategory();
			}
		}
     }
}


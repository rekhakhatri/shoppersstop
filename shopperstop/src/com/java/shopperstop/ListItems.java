package com.java.shopperstop;

import java.util.ArrayList;

public class ListItems {
	protected String name;
	protected double price;

	//for men
	static ArrayList<ListItems> tshirts = new ArrayList<ListItems>();
	static ArrayList<ListItems> shirts = new ArrayList<ListItems>();
	static ArrayList<ListItems> pants = new ArrayList<ListItems>();
	static ArrayList<ListItems> shorts = new ArrayList<ListItems>();
	
	//for women
	static ArrayList<ListItems> kurtis = new ArrayList<ListItems>();
	static ArrayList<ListItems> tops = new ArrayList<ListItems>();
	static ArrayList<ListItems> jeans = new ArrayList<ListItems>();
	static ArrayList<ListItems> dresses = new ArrayList<ListItems>();
	
	//mobiles
	static ArrayList<ListItems> mobiles = new ArrayList<ListItems>();
	
	//cameras
	static ArrayList<ListItems> cameras = new ArrayList<ListItems>();
	
	//for purifiers
	static ArrayList<ListItems> purifiers = new ArrayList<ListItems>();
	
	//for geysers
	static ArrayList<ListItems> geysers = new ArrayList<ListItems>();
	
	//for fan
	static ArrayList<ListItems> fans = new ArrayList<ListItems>();
	
	//for cooler
	static ArrayList<ListItems> coolers = new ArrayList<ListItems>();

	
	ListItems(){
		
	}
	
	ListItems(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	static void allListItems(){
		tshirts.add(new ListItems("Puma",900.00));
		tshirts.add(new ListItems("U.S.polo",850.00));
		tshirts.add(new ListItems("PeterEnglend",860.00));
		tshirts.add(new ListItems("Adidas",840.0));
		tshirts.add(new ListItems("Lacoste",950.0));
		tshirts.add(new ListItems("Gucci",908.0));
		
		shirts.add(new ListItems("Adidas",640.0));
		shirts.add(new ListItems("U.S.polo",550.00));
		shirts.add(new ListItems("Lacoste",8950.0));
		shirts.add(new ListItems("PeterEnglend",360.00));
		shirts.add(new ListItems("Gucci",408.0));
		shirts.add(new ListItems("Puma",1000.00));
		
		pants.add(new ListItems("PeterEnglend",787.00));
		pants.add(new ListItems("U.S.polo",534.00));
		pants.add(new ListItems("Adidas",543.0));
		pants.add(new ListItems("Gucci",408.0));
		pants.add(new ListItems("Puma",465.00));
		pants.add(new ListItems("Lacoste",786.0));
		
		shorts.add(new ListItems("Adidas",890.0));
		shorts.add(new ListItems("Lacoste",998.0));
		shorts.add(new ListItems("U.S.polo",557.00));
		shorts.add(new ListItems("Gucci",456.0));
		shorts.add(new ListItems("PeterEnglend",576.00));
		shorts.add(new ListItems("Puma",897.00));
		
		kurtis.add(new ListItems("Zivaa",1200.0));
		kurtis.add(new ListItems("Inara",1800.0));
		kurtis.add(new ListItems("Harper",1100.0));
		kurtis.add(new ListItems("Soch",1890.0));
		kurtis.add(new ListItems("Chabrra",2100.0));
		kurtis.add(new ListItems("Mohey",7800.0));
		
		tops.add(new ListItems("Here & Now",768.0));
		tops.add(new ListItems("JuneBerry",679.0));
		tops.add(new ListItems("Mast & harbour",756.0));
		tops.add(new ListItems("Roadster",879.0));
		tops.add(new ListItems("Ajio",589.0));
		tops.add(new ListItems("Forever 21",1200.0));
		
		jeans.add(new ListItems("Forever 21",1800.0));
		jeans.add(new ListItems("Denim",4500.0));
		jeans.add(new ListItems("Levis",5700.0));
		jeans.add(new ListItems("Jack & Jones",1800.0));
		jeans.add(new ListItems("Woodland",5679.0));
		jeans.add(new ListItems("Caprese",5900.0));
		
		dresses.add(new ListItems("Tokyo talkies",719.0));
		dresses.add(new ListItems("U&F",832.0));
		dresses.add(new ListItems("DressBerry",5940.0));
		dresses.add(new ListItems("H&M",789.0));
		dresses.add(new ListItems("Nayo",579.0));
		dresses.add(new ListItems("RARE",7550.0));
		
		mobiles.add(new ListItems("Samsung Galaxy M30S",42999.0));
		mobiles.add(new ListItems("One Plus 7 Pro",12999.0));
		mobiles.add(new ListItems("Redmi Note 8 Pro",13999.0));
		mobiles.add(new ListItems("Redmi Note 8",12999.0));
		mobiles.add(new ListItems("Vivo U20",10990.0));
		mobiles.add(new ListItems("Samsung Galaxy M30",9499.0));
		mobiles.add(new ListItems("Vivo U10",8990.0));
		
		cameras.add(new ListItems("Canon EOS 1500D ",79999.0));
		cameras.add(new ListItems("Sony Aplha ILCE-6100Y",25990.0));
		cameras.add(new ListItems("Nikon D3500 W/AF PDX-Nikkor",27999.0));
		cameras.add(new ListItems("Nikon D5600 with AF-P 18",49499.0));
		cameras.add(new ListItems("Nikon D5-300 24.2 Digital SLR",46880.0));
		cameras.add(new ListItems("Canon EOS 80D 24.2 Digital SLR",15990.0));
		
		purifiers.add(new ListItems("Rico Water Purifier",2155.0));
		purifiers.add(new ListItems("Aqua Libra Water Purifier",4399.0));
		purifiers.add(new ListItems("Aquafresh swift Water Purifier",9990.0));
		purifiers.add(new ListItems("Eureka Forbes Water Purifier",15990.0));
		purifiers.add(new ListItems("Kent new grand Water Purifier",18990.0));
		purifiers.add(new ListItems("Water Kleo Water Purifier",15990.0));
		
		geysers.add(new ListItems("Bajaj Instant Heater",1799.0));
		geysers.add(new ListItems("Power Pie Heater",2899.0));
		geysers.add(new ListItems("Bajaj Flora Instant",2727.0));
		geysers.add(new ListItems("Crompton Bliss ",2454.0));
		geysers.add(new ListItems("Bajaj New Shakti",5699.0));
		geysers.add(new ListItems("Crompton Arno Neo",3009.0));
		
		fans.add(new ListItems("Usha Diplomat 1200M",1570.0));
		fans.add(new ListItems("Rio Ceiling Fan",2260.0));
		fans.add(new ListItems("Orient Electric Apex-FX ",1349.0));
		fans.add(new ListItems("Usha Max Air",2370.0));
		fans.add(new ListItems("Havells Leganza",2919.0));
		fans.add(new ListItems("Crompton Hill",1349.0));
		
		coolers.add(new ListItems("Symphony Ice Cube",6190.0));
		coolers.add(new ListItems("Asian Magna",9990.0));
		coolers.add(new ListItems("Crompton Ozone",9499.0));
		coolers.add(new ListItems("Symphony Diet",5699.0));
		coolers.add(new ListItems("Crompton Optimus",10489.0));
		coolers.add(new ListItems("Bajaj PCF",4499.0));
		
		

	}
	
	@Override
	public String toString() {
		return String.format("%-40s%-40s",name,price);
	}

}

class Cart{
	protected String item;
	protected double cost;
	protected int qty;
	protected double total;
	
	static ArrayList<Cart> cart = new ArrayList<Cart>();

	
	Cart(String item,double cost,int qty,double total) {
		this.item = item;
		this.cost = cost;
		this.qty = qty;
		this.total = total;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20s%-20s","   |"+item,"|"+cost,"|"+qty,"|"+total);
	}
}


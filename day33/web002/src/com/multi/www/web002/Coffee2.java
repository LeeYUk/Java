package com.multi.www.web002;

public class Coffee2 {

	int price;
	String name;
	
	public static Coffee2 coffee2;
	
	
	public static Coffee2 getInstance() {
		
		if(coffee2==null) {
		 coffee2 =new Coffee2(1500, "아메리카노");
		 coffee2= new Coffee2(3500, "헤이즐넛");
		}
		 return coffee2;
	}

	
	private Coffee2(int price, String name) {
		this.price = price;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Coffee2 [price=" + price + ", name=" + name + "]";
	}
	
	
	
}

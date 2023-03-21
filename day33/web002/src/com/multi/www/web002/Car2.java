package com.multi.www.web002;

public class Car2 {

	//싱글톤으로 만들어보자
	
	String color;
	int price;
	int speed;
	
	//하나만 제공하는 객체는 (static)
	//내부에서 객체를 생성하고 외부에서 호출(public)해서 사용
	public static Car2 car2;
	
	
	public static Car2 getInstance() {
		if(car2==null) {
		car2=new Car2("red", 100, 200);
		}
		
		return car2;
	}
	
	public void run() {
		System.out.println("run");
	}
	
	//싱글톤은 해당클래스에서 하나만 만들어서 제공
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

}

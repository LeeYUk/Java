package com.multi.www.web002;

public class Car {
	//멤버변수
	//멤버 메소드
	//toString()
	//객체생성시 멤버변수값을 한꺼번에 넣어서 초기화
	// ->객체생성시 자동호출되는 메소드를 추가
	//->생성자 메소드 ,constructor
	
	String color;
	int price;
	int speed;
	
	
	public Car(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}
	
	
}

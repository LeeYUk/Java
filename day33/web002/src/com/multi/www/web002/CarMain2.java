package com.multi.www.web002;

public class CarMain2 {

	public static void main(String[] args) {
		// Car class main
		
		Car car;
		for (int i = 0; i < 1000; i++) {
			car = new Car("red"+i , 10, 200);
			
			System.out.println(car);
		}
		
		
	}

}

package com.multi.www.web002;

public class CarMain3 {

	public static void main(String[] args) {
		// Car class main
		
		Car2 car2;
		for (int i = 0; i < 1000; i++) {
			car2=Car2.getInstance();
			
			System.out.println(car2);//주소확인
		}
		
		
	}

}

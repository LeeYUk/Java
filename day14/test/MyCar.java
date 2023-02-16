package test;

public class MyCar {

	public static void main(String[] args) {
		// Car의 메인
		
		CoffeeTruck co=new CoffeeTruck();
		co.color="red";
		co.price=2500;
		co.weight=1;
		
		co.move();
		co.sell();

	}

}

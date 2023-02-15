package classReview;

public class CarMain {

	public static void main(String[] args) {
		// class Car의 메인
		
		Car car1=new Car();//객체생성, 객체를 1개 생성할때 마다 2개씩 램에 저장공간 생김
		Car car2=new Car();
		
		car1.color="검정색";
		System.out.println(car1.color);
		car1.run();
		
		car2.color="빨간색";
		System.out.println(car2.color);
		car2.run();
		car2.up();
	}

}

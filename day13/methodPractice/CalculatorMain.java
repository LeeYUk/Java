package methodPractice;

public class CalculatorMain {

	public static void main(String[] args) {
		//Calculator class 메인
		
		Calculator cal=new Calculator();
		cal.add(2, 3);
		cal.multiply(2, 3);
		int result=cal.subtraction(500, 200);
		System.out.println(result-100);
	}
	

}

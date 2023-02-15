package methodPractice;

public class Calculator3 {
	//계산기3
	
	//메소드 이름을 입력값이 다르면 , 다 동일하게 사용해도 됨
	//하나의 이름으로 다양한 형태를 구현 가능.
	//==>다형성(overloading)
	public int add(int x,int y) {
		return x+y;
	}
	
	public int minus(int x,int y) {
		return x-y;
	}
	
	public int mul(int x,int y) {
		return x*y;
	}
	
	public double div(double x,int y) {
		return x/y;
	}
	
	

	
	
}

package methodPractice;

public class Calculator {
	//계산기
	
	public void add(int x,int y) {
		System.out.println("더하기");
		System.out.println(x+y);
	}
	public void multiply(int x,int y) { //매개변수 ,parameter
		System.out.println("곱하기");
		System.out.println(x*y);
	}
	public int subtraction(int x, int y) {
		System.out.println("빼기 기능 처리 방법 내용");
		
		return x-y;
	}
}

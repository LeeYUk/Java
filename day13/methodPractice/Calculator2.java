package methodPractice;

public class Calculator2 {
	//계산기2
	
	//메소드 이름을 입력값이 다르면 , 다 동일하게 사용해도 됨
	//하나의 이름으로 다양한 형태를 구현 가능.
	//==>다형성(overloading)
	public int add(int x,int y) {
		return x+y;
	}
	public double add(int x,double y) {
		return x+y;
	}
	public double add(double x,double y) {
		return x+y;
	}
	public String add(String x,int y) {
		return x+y+"시에 점심을 먹겠어";
	}
	
	
	
}

package review;

public class Employee {
	//접근제어자
	//직원 class
	public String name;// 아무곳에든 접근가능
	String address; //같은 패키지에서만 접근 가능
	protected int salary; //같은 패키지+ 다른 패키지에서만 접근가능(상속할때만)
	private int rrn; //해당 클래스 안에서만 접근가능
	
	public int getRrn() {// 해당 클래스에서 private 변수를 접근할때 사용
		return rrn;
	}
}

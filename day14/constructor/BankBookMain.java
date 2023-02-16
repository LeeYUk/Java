package constructor;

public class BankBookMain {

	public static void main(String[] args) {
		//class BankBook메인
		
		BankBook bb1= new BankBook("홍길동", "980505", 10000);
		BankBook bb2= new BankBook("이순신", "990505", 20000);

		
		System.out.println(bb1);

	}

}

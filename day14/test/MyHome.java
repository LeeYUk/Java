package test;

public class MyHome {

	public static void main(String[] args) {
		//class Daughter 메인, 우리집.java
		
		Daughter d1=new Daughter();
		Daughter d2=new Daughter();
		Daughter d3=new Daughter();
		
		d1.WatchTv("홍길동", '여');
		d2.WatchTv("김길동", '여');
		d3.WatchTv("이길동", '여');
		
		System.out.println("딸들의 정보");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("딸이 몇명? "+Daughter.count+ "명");//딸이 몇명?
		System.out.println("아빠의 지갑 사정은? "+Daughter.wallet+"원");

	}

}

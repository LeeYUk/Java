package constructor;

public class Call {
	//클래스 전화기
	//클래스는 맴버변수를 가지고있다
	//동작; 맴버 메소드 =>함수와 동일
	
	public Call() {
		System.out.println("Call 객체가 하나 생성됨");
	}
	public int price; //맴버변수는 자동으로 변수 초기화
	public String shape;//기본형이 아닌경우 null로 초기화
	
	//눈에 보이지는 않지만 기본 생성자가 만들어져있음
	//묵시적으로 기본 생성자가 만들어져 있음
	//==>객체 생성할 때마다 이 메소드를  자동 호출
	// Call객제가 만들어졌다 출력할때 생성자 호출
	
	//동작
	public void internet() {//메소드 생성
		System.out.println("와이파이 연결");
		System.out.println("데이터를 사용해서 연결");
		
	}
	public void kakaotalk() {
		System.out.println("자바 단체톡을 하다");
		System.out.println("게시물을 올리다");
	}
	
	
	

}

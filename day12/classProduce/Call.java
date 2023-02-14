package classProduce;

public class Call {
	//클래스 전화기
	//클래스는 맴버변수를 가지고있다
	//동작; 맴버 메소드 =>함수와 동일
	
	public int price; //맴버변수는 자동으로 변수 초기화
	public String shape;//기본형이 아닌경우 null로 초기화
	
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

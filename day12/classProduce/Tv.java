package classProduce;

public class Tv {
	//Tvclass
	//맴버변수, 선언이 클래스 바로 아래에 되어있기 때문에
	//클래스 전체 영역에서 이 변수를 사용할 수 있음
	//전역변수라고 부름
	//멤버변수는 자동초기화, 전역변수는 자동 초기화 됨
	
	public int ch;//채널
	public int vol;//볼륨
	public boolean onOff;//false
	
	public void ChangeCh() {
		int change=1;
		System.out.println(ch+"에서"+change+"로 바꾸다.");
	}
	
	public void Youtube() { //메소드를 만드는것 =>기능을 정의
		System.out.println(vol+"을 키워서 동영상을 보다");
	}
	
}

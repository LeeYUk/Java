package constructor;

public class Tv {
	//Tvclass
	//맴버변수, 선언이 클래스 바로 아래에 되어있기 때문에
	//클래스 전체 영역에서 이 변수를 사용할 수 있음
	//전역변수라고 부름
	//멤버변수는 자동초기화, 전역변수는 자동 초기화 됨
	
	public int ch;//채널
	public int vol;//볼륨
	public boolean onOff;//false
	
	
	//다른 생성자 메소드가 없으면 객체가 자동으로 생성됨
	//기본 생성자(default constructor)
//	public Tv() {
//		System.out.println("Tv객체가 1개 생성됨");
//	}
	//객체를 생성할때 마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 눈에 보이게 다시 만들기(명시적으로)
	
	public Tv() {
		
		//객체가 생성될때 무조건 호출됨
		System.out.println("객체가 하나 생성됨");
	}
		
//	public Tv(int ch,int vol,boolean onOff) {//매개변수(파라미터)
//		//heap영역에 저장된 맴버변수에 값을 넣어주는 역할
//		this.ch=ch;
//		this.vol=vol;
//		this.onOff=onOff;
//	}
	//파레메타가 있는 생성자가 있을 때는 기본생성자는 자동생성 되지 않음
	public Tv(int ch, int vol, boolean onOff) {
	this.ch = ch;
	this.vol = vol;
	this.onOff = onOff;
}
	
	public void ChangeCh() {
		int change=1;
		System.out.println(ch+"에서"+change+"로 바꾸다.");
	}
	
	



	public void Youtube() { //메소드를 만드는것 =>기능을 정의
		System.out.println(vol+"을 키워서 동영상을 보다");
	}
	
}

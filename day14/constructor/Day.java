package constructor;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;//누적이나 공유할 목적으로 사용할 변수는 static으로 선언
	
	
	
	public Day(String doing, int time, String location) {
		//객체를 생성할때 처리하고 싶은 내용이 있으면, 생성자 메소드에 추가
		//객체 생성 할때 생성자 메소드가 자동 호출되기 때문에 무조건 처리해줌
		count++;
		sum =sum+time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}

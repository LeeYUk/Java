package constructor;

public class DayMain {

	public static void main(String[] args) {
		// class Day 메인
		
		Day day1=new Day("자바공부", 8 , "창원광장"); 
		System.out.println(Day.count);
		System.out.println("-"+Day.sum);//static이 붙은 메소드나 변수는 클래스에 바로 접근 가능
		
		Day day2=new Day("주변산책", 1 , "부원역"); 
		System.out.println(Day.count);
		System.out.println("-"+Day.sum);
		
		Day day3=new Day("졸업식", 2 , "학교"); 
		System.out.println(Day.count);
		System.out.println("-"+Day.sum);
		//총 12개 다이나믹 생성, 멤버변수==> 객체생성할 때마다 다이나믹하게 heap에 생긴 변수
		//인스턴스 변수 라고 부름
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);

	}

}

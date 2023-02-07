package loop;

import java.util.Date;

public class IfLoop4 {

	public static void main(String[] args) {
		//if 문
		//Date -년 월일 시분 초,java.util
		
		Date date=new Date();
		int hour=date.getHours();
		
//		int hour =15;
		
		if(hour<11) {
			System.out.println("굿모닝");
		}
		else if(hour<14) {
			System.out.println("굿에프터눈");
		}
		else if(hour<20) {
			System.out.println("굿이브닝");
		}
		else {
			System.out.println("굿나잇");
		}
		
		int month=date.getMonth()+1;
		System.out.println(month);
//		int month=2;
		switch (month) {
		case 3: case4: case5:
			System.out.println("봄");
			break;
			
		case 6: case7: case8:
			System.out.println("여름");
			break;
			
		case 9: case10: case11:
			System.out.println("가을");
			break;

		default:
			System.out.println("겨울");
			break;
		}
	}

}

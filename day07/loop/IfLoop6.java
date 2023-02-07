package loop;

import java.util.Date;

public class IfLoop6 {

	public static void main(String[] args) {
		
		
		Date date=new Date();
		//1
		
		int year=(date.getYear()+1900);
		System.out.println("현재 년도: "+year+"년");
		
		if(year>2000)
		{
			System.out.println("밀레니엄 세대이시군요");
		}
		else {
			System.out.println("밀레니엄 세대가 아니군요");
		}
		
		//2
		int day=date.getDay();
		
		switch (day) {
		
		case 0:case 6:
			System.out.println("쉬자");
			break;

		default:
			System.out.println("공부하자");
			break;
		}
		
		//3
		int month=date.getMonth()+1;
		System.out.println("현재 월: "+month+"월");
		
	switch (month) {
	case 2:
		System.out.println("2월은 28일까지");
		break;
	case 4: case 6: case 9: case 11:
		System.out.println("30일까지");
		break;

	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		System.out.println("31일까지");
		break;
	}

  }
}

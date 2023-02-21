package review;

import java.util.ArrayList;

import javax.swing.JButton;

public class Review {

	public static void main(String[] args) {
		// 복습 1
		//인덱스, 순서, 직접접근 ==> ArrayList
		ArrayList list=new ArrayList();
		list.add("홍길동"); //object <- String(자동형 변환)
		list.add(100);//object <- Integer(랩퍼클래스)<-오토박싱-int
		list.add(10.5);//object <- double
		list.add(new JButton());//object <- Jutton
		
		String name=(String)list.get(0);//직접 접근 랜덤엑세스 가능 강제형변환
		//String <-Object,강제형변환
		int age =(Integer)list.get(1);
	}

}

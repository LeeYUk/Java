package casting;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;

import javax.swing.JButton;

public class ReferenceCasting {

	public static void main(String[] args) {
		// 참조형 형변환 == 클래스 형변환
		//상속관계 일때만 형변환이 가능
		
		ArrayList list= new ArrayList();
		//자동형 변환 (업캐스팅)
		list.add("홍길동"); //Object <-String
		list.add(100);//Object <-Integer
		list.add(11.45);//Object <-double
		list.add(new JButton());//Object <-JButton
		
		//강제형변환(다운캐스팅)
		String name=(String)list.get(0);
		//String이 가지는 메소드를 사용하려면 String으로 강제형변환 해주어야한다
		System.out.println(name.charAt(0));
		
		System.out.println(name.length());
		
		int age=(Integer)list.get(1);
		System.out.println(age+1);
		
		double sum=(Double)list.get(2);
		System.out.println(sum+10);
		
		JButton button=(JButton)list.get(3);
		button.setText("진짜 버튼");
		

	}

}

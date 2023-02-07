package sequential;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame2 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 메소드를 사용해보자
		//사용될 Jframe은 변수 f에 저장
		
		JFrame f=new JFrame(); //Jframe 메소드 선언
		f.setSize(700, 700);

		//버튼 정렬, 버튼 2개 이상시 덮어쓰기 방지
		FlowLayout flow =new FlowLayout();
		
		f.setLayout(flow);
		

		

		JButton b1=new JButton();//버튼
		JButton b2=new JButton();
		b1.setText("");
		b2.setText("");
		
		
		ImageIcon icon1=new ImageIcon("car.PNG");//사진넣기
		ImageIcon icon2=new ImageIcon("buga.PNG");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		
		
		f.add(b1);
		f.add(b2);
		
		//보여지는 것
		f.setVisible(true);

	}

}

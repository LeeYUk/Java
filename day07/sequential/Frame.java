package sequential;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame {

	public static void main(String[] args) {
		// 자주 사용하지 않는 메소드를 사용해보자
		//사용될 Jframe은 변수 f에 저장
		
		JFrame f=new JFrame(); //Jframe 메소드 선언
		f.setSize(500, 300);

		//버튼 정렬, 버튼 2개 이상시 덮어쓰기 방지
		FlowLayout flow =new FlowLayout();
		
		f.setLayout(flow);
		
		JLabel text1=new JLabel();//글씨 
		text1.setText("아이디");

		JLabel text2=new JLabel();
		text2.setText("패스워드");
		
		JTextField input1=new JTextField(10);//텍스트박스
		JTextField input2=new JTextField(10);
		
		JButton b1=new JButton();//버튼
		JButton b2=new JButton();
		b1.setText("버튼");
		b2.setText("버튼");
		
		Font font=new Font("궁서",1,20);//오브젝트 폰트지정
		text1.setFont(font);
		text2.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		
		
		
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		
		f.add(text2);
		f.add(input1);
		f.add(b2);
		
		//보여지는 것
		f.setVisible(true);

	}

}

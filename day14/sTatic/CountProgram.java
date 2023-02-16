package sTatic;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountProgram {
	static int count; //카운트 변수 static 으로 선언

	public static void main(String[] args) {
		//나의 카운터 프로그램
		
		
		JFrame f=new JFrame();
		f.setSize(450,600);
		
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		
		JLabel num=new JLabel("0");
		Font font=new Font("궁서",Font.BOLD,100);
		Font font2=new Font("궁서",Font.BOLD,30);
		
		num.setFont(font);
		num.setForeground(Color.CYAN);
		
		JButton b1=new JButton("+1");
		b1.setFont(font2);
		
		JButton b2=new JButton("0으로 초기화");
		b2.setFont(font2);
		
		JButton b3=new JButton("-1");
		b3.setFont(font2);
		
		b1.setBackground(Color.GRAY);
		b2.setBackground(Color.red);
		b3.setBackground(Color.GRAY);
		
		b1.addActionListener(new ActionListener() {//b1클릭시 발생하는 이벤트 처리
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++; //버튼클릭시 카운트 +1증가
				num.setText(count+"");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {//b2클릭시 발생하는 이벤트 처리
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count=0; //카운트 0으로 초기화
				num.setText(count+"");
				
			}
		});
		
		b3.addActionListener(new ActionListener() {//b3클릭시 발생하는 이벤트 처리
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;//버튼클릭시 카운트 -1감소
				num.setText(count+"");
				
			}
		});
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(num);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);

	}

}

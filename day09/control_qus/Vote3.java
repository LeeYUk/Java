package control_qus;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vote3 {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(450,700);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("k-pop 인기투표");
		
		JLabel text2 = new JLabel(); //글씨
		text2.setText("아이유");
		
		JLabel text3 = new JLabel(); //글씨
		text3.setText("방탄");
		
		JLabel text4 = new JLabel(); //글씨
		text4.setText("뉴진스");
		
		
		Font font = new Font("궁서", 1, 30);
		text1.setFont(font);
		
		Font font2 = new Font("궁서", 1, 20);
		text2.setFont(font2);
		text3.setFont(font2);
		text4.setFont(font2);
	

		JButton b1 = new JButton();
		b1.setText("");
		ImageIcon icon1=new ImageIcon("11.PNG");

		JButton b2 = new JButton();
		b2.setText("");
		ImageIcon icon2=new ImageIcon("캡처2.PNG");

		JButton b3 = new JButton();
		b3.setText("");
		ImageIcon icon3=new ImageIcon("13.PNG");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		
		
		f.add(text1);
		
		f.add(b1);
		f.add(text2);
		
		f.add(b2);
		f.add(text3);
		
		f.add(b3);
		f.add(text4);
		
	
		b1.addActionListener(new ActionListener() {
			int iu=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼1 처리
				iu++;
				text2.setText("아이유"+iu+"표");
					
			}
		});
		
		b2.addActionListener(new ActionListener() {
			int bts=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼2 처리
				bts++;
				text3.setText("방탄"+bts+"표");
					
			}
		});
		b3.addActionListener(new ActionListener() {
			int njs=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼3 처리
				njs++;
				text4.setText("뉴진스"+njs+"표");
					
			}
		});
		f.setVisible(true);

	}

}

package stockProgram;
//코드 미완성 b4버튼 이벤트 처리를 못함 
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling4 {
	// 네이버 증권 크롤링
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setSize(300,400);
		f.getContentPane().setBackground(Color.gray);
		f.setLayout(new FlowLayout());
		Font font=new Font("궁서",Font.BOLD,30);
		
		JButton b1=new JButton("삼성전자");
		JButton b2=new JButton("카카오");
		JButton b3=new JButton("네이버");
		JButton b4=new JButton("크롤링");
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.cyan);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.green);
		b4.setBackground(Color.red);
		
		JLabel label =new JLabel("CODE");
		label.setFont(font);
		
		JTextField text= new JTextField(7);
		text.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1클릭시 발생하는 이벤트 처리
				//삼성전자 크롤링
				Samsong c=new Samsong();
				c.samsong("005930");
				text.setText("005930");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1클릭시 발생하는 이벤트 처리
				//삼성전자 크롤링
				Kakao c=new Kakao();
				c.kakao("035720");
				text.setText("035720");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1클릭시 발생하는 이벤트 처리
				//삼성전자 크롤링
				Naver c=new Naver();
				c.naver("035420");
				text.setText("035420");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1클릭시 발생하는 이벤트 처리
				//삼성전자 크롤링
				if(text.equals("005930")) {
					
				}
				else 
				{}
				
			}
		});
		
		f.setVisible(true);
		
	}
	

}




package gui_DB_Connect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java_DB_Connect.Exam_ApplicationDAO;
import java_DB_Connect.Exam_ApplicationVO;


public class Exam_ApplicationUI3 extends JFrame{
	
	Exam_ApplicationUI3(){
		super("창3");//타이틀
		
		
		
		JFrame f=new JFrame();
		Panel p=new Panel();
		
		f.setTitle("안내문");
		f.setBounds(750, 200, 400, 600);
		f.getContentPane().setBackground(new Color(225, 210, 152));
		
		JLabel l1=new JLabel("        안내문        ");
		TextArea text=new TextArea("신청하기전에 ...\n\n신청할수 있는 과목은5개:\n(정보처리기능사,정보처리기사,정보처리산업기사,화공기술사,전기기능사)\n"
				+"\n\n"+"신청가능한 시험날짜 3개: 23-05-05,  23-05-10,  23-05-25"
						+ "\n\n"+"수험번호 작성요령>>\n 수험번호가 1자리수일경우 앞에0을 붙임\n 예) 수험번호가 1번일경우 01로 작성,   2번일경우 02로 작성...",25,50);
		
		
		
		
		
//		JLabel l2=new JLabel("id");
//		JLabel l3=new JLabel("과목명");
//		JLabel l4=new JLabel("시험날짜");
//		JLabel l5=new JLabel("수험번호");
		


		RoundedButton b1=new RoundedButton("돌아가기");

		
		FlowLayout flow =new FlowLayout();
		
		Font font =new Font("굴림",Font.BOLD,40);
		Font font2 =new Font("돋움",Font.BOLD,50);
		
		f.setLayout(flow);
		
		f.add(l1);
		l1.setForeground(Color.gray);
//		l2.setForeground(new Color(255,247,242));
//		l3.setForeground(new Color(255,247,242));
//		l4.setForeground(new Color(255,247,242));
//		l5.setForeground(new Color(255,247,242));
		
		p.add(text);
		f.add(p,"Center");
//		f.add(jp);
//		f.add(l3);
//		f.add(l4);
//		f.add(l5);
		f.add(b1);

		
		
		
		l1.setFont(font2);
//		l2.setFont(font);
//		l3.setFont(font);
//		l4.setFont(font);
//		l5.setFont(font);

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 돌아가기
				new Exam_ApplicationUI();
				f.setVisible(false);
				
			}
		});
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
}


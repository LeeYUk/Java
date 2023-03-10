package gui_DB_Connect;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java_DB_Connect.Exam_ApplicationDAO;
import java_DB_Connect.Exam_ApplicationVO;

public class Exam_ApplicationUI {

	public static void main(String[] args) {
		// ui화면
		
		
		JFrame f=new JFrame();
		
		f.setTitle("원서접수신청");
		f.setSize(400,600);
		f.getContentPane().setBackground(new Color(225, 210, 152));
		
		JLabel l1=new JLabel("        원서 접수        ");
		
		JLabel l2=new JLabel("id");
		JLabel l3=new JLabel("과목명");
		JLabel l4=new JLabel("시험날짜");
		JLabel l5=new JLabel("수험번호");
		
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JTextField t3=new JTextField(10);
		JTextField t4=new JTextField(10);

		RoundedButton b1=new RoundedButton("신청하기");
		RoundedButton b2=new RoundedButton("신청취소");
		RoundedButton b3=new RoundedButton("입력전에 읽어보기");
		
		FlowLayout flow =new FlowLayout();
		
		Font font =new Font("굴림",Font.BOLD,40);
		Font font2 =new Font("돋움",Font.BOLD,50);
		
		f.setLayout(flow);
		
		f.add(l1);
		l1.setForeground(Color.gray);
		l2.setForeground(new Color(255,247,242));
		l3.setForeground(new Color(255,247,242));
		l4.setForeground(new Color(255,247,242));
		l5.setForeground(new Color(255,247,242));
		
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		
		
		l1.setFont(font2);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 신청하기 누를시 발생하는 이벤트 처리
				System.out.println("------원서접수-----");
				
				//String certName[]= {"정보처리기능사","정보처리기사","정보처리산업기사","화공기술사","전기기능사"};//정해진 과목 저장을 위해 배열선언
				
				String id =t1.getText();
				String cert_name =t2.getText();
				String cert_day =t3.getText();
				String cert_num =t4.getText();
				
				
				
				if(id.equals(""))
				{
					System.out.println("입력칸을 채워");
					JOptionPane.showMessageDialog(f, "빈칸을 입력해주세요!!");
				}
				else if(cert_name.equals(""))
				{
					System.out.println("입력칸을 채워");
					JOptionPane.showMessageDialog(f, "빈칸을 입력해주세요!!");
					
				}
				else if(cert_day.equals(""))
				{
					System.out.println("입력칸을 채워");
					JOptionPane.showMessageDialog(f, "빈칸을 입력해주세요!!");
				}
				else if(cert_num.equals(""))
				{
					System.out.println("입력칸을 채워");
					JOptionPane.showMessageDialog(f, "빈칸을 입력해주세요!!");
				}
				
				Exam_ApplicationDAO dao=new Exam_ApplicationDAO();
				
				Exam_ApplicationVO bag= new Exam_ApplicationVO();
				
				bag.setId(id);
				bag.setCert_name(cert_name);
				bag.setCert_day(cert_day);
				bag.setCert_num(cert_num);
				
				int result= dao.insert(bag);
				
				if(result ==1) {
					JOptionPane.showMessageDialog(f, "신청완료");
				}
				else
				{
					JOptionPane.showMessageDialog(f, "신청실패");
				}
				System.out.println("처리완료");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Exam_ApplicationUI2();
				f.setVisible(false);
			}
		});
		
		
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

package gui_DB_Connect;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java_DB_Connect.Exam_ApplicationDAO;
import java_DB_Connect.Exam_ApplicationVO;


public class Exam_ApplicationUI2 extends JFrame{
	
	Exam_ApplicationUI2(){
		super("창2");//타이틀
		
		
		
		JFrame f=new JFrame();
		
		f.setTitle("원서접수취소");
//		f.setSize(400,600);
		f.setBounds(750, 200, 400, 600);
		f.getContentPane().setBackground(new Color(225, 210, 152));
		
		JLabel l1=new JLabel("        접수 취소        ");
		
//		JLabel l2=new JLabel("id");
//		JLabel l3=new JLabel("과목명");
//		JLabel l4=new JLabel("시험날짜");
		JLabel l5=new JLabel("수험번호");
		
//		JTextField t1=new JTextField(10);
//		JTextField t2=new JTextField(10);
//		JTextField t3=new JTextField(10);
		JTextField t4=new JTextField(10);

		RoundedButton b1=new RoundedButton("신청취소");
		RoundedButton b2=new RoundedButton("돌아가기");
//		RoundedButton b3=new RoundedButton("입력전에 읽어보기");
		
		FlowLayout flow =new FlowLayout();
		
		Font font =new Font("굴림",Font.BOLD,40);
		Font font2 =new Font("돋움",Font.BOLD,50);
		
		f.setLayout(flow);
		
		f.add(l1);
		l1.setForeground(Color.gray);
//		l2.setForeground(new Color(255,247,242));
//		l3.setForeground(new Color(255,247,242));
//		l4.setForeground(new Color(255,247,242));
		l5.setForeground(new Color(255,247,242));
		
//		f.add(l2);
//		f.add(t1);
//		f.add(l3);
//		f.add(t2);
//		f.add(l4);
//		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
//		f.add(b3);
		
		
		
		l1.setFont(font2);
		//l2.setFont(font);
		//l3.setFont(font);
		//l4.setFont(font);
		l5.setFont(font);
		//t1.setFont(font);
		//t2.setFont(font);
		//t3.setFont(font);
		t4.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 신청취소하기
				System.out.println("-----접수취소------");
				
				String cert_num =t4.getText();
				
				if(cert_num.equals("")) 
				{
					System.out.println("빈칸 필수로 입력");
					JOptionPane.showMessageDialog(f, "빈칸을 입력해주세요");
				}
				
				Exam_ApplicationDAO dao=new Exam_ApplicationDAO();
				
				Exam_ApplicationVO bag= new Exam_ApplicationVO();
				bag.setCert_num(cert_num);
				
				int result =dao.delete(bag);
				
				if(result ==1)
				{
					JOptionPane.showMessageDialog(f, "취소완료");
				}
				else 
				{
					JOptionPane.showMessageDialog(f, "fail");
				}
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 돌아가기
				new Exam_ApplicationUI();
				f.setVisible(false);
				
			}
		});
		
		Dimension frameSize =getSize();
		Dimension windowSize=Toolkit.getDefaultToolkit().getScreenSize();
		
		setLocation((windowSize.width- frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
}


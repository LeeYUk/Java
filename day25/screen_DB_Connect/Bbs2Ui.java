package screen_DB_Connect;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java_DB_Connect.Bbs2DAO;

public class Bbs2Ui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame();
		
		f.setTitle("회원가입");
		f.setSize(330,500);
		
		JLabel l1=new JLabel("--  게시판   --");
	
		JLabel l2=new JLabel(" no");
		JLabel l3=new JLabel("title");
		JLabel l4=new JLabel("content");
		JLabel l5=new JLabel("작성자");
		
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JTextField t3=new JTextField(10);
		JTextField t4=new JTextField(10);
		
		JButton b1=new JButton("게시물작성");
		JButton b2=new JButton("게시물삭제");
		JButton b3=new JButton("게시물수정");
		JButton b4=new JButton("게시물검색");
		
		//f에 위에 있는 요소들을 add로 붙여줘야함
		FlowLayout flow =new FlowLayout();
		
		//폰트설정
		Font font=new Font("궁서",Font.BOLD,30);
		
		
		f.setLayout(flow);
		
		f.add(l1);
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
		f.add(b4);
		
		
		b1.setBackground(Color.green);
		b1.setForeground(Color.white);
		
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		
		b3.setBackground(Color.yellow);
		
		
		l1.setFont(font);
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
				// 게시글 작성 이벤트 처리
				System.out.println("==게시글작성==");
				
				
//				String title= t2.getText();
//				String content= t3.getText();
//				String writer= t4.getText();
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 게시글 삭제 이벤트 처리
				
			}
		});
	
		b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// 게시글 수정 이벤트
			
			}
		});
	
		b4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// 게시글 검색 이벤트
			System.out.println("게시글 검색 id입력");
			
			String no=t1.getText();
			
			int no2=Integer.parseInt(no);
					
			Bbs2DAO dao=new Bbs2DAO();
			BbsVO bag=dao.one(no2);
			
			if(bag != null) {
				t2.setText(bag.getTitle());
				t3.setText(bag.getContent());
				t4.setText(bag.getWriter());
				
				t2.setBackground(Color.cyan);
				t3.setBackground(Color.cyan);
				t4.setBackground(Color.cyan);
			}
			else {
				
				t2.setText("");
				t3.setText("");
				t4.setText("");
				JOptionPane.showMessageDialog(f, "결과없음");
			}
			
			
			
			
			}
		});
		
		
		f.setVisible(true);	
	}

}


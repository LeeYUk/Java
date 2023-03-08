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

import java_DB_Connect.MemberDAO2;
import java_DB_Connect.MemberDAO3;

public class MemberUi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame();
		
		f.setTitle("회원가입");
		f.setSize(330,500);
		
		JLabel l1=new JLabel("--회원가입화면--");
	
		JLabel l2=new JLabel("id");
		JLabel l3=new JLabel("pw");
		JLabel l4=new JLabel("이름");
		JLabel l5=new JLabel("전화번호");
		
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JTextField t3=new JTextField(10);
		JTextField t4=new JTextField(10);
		
		JButton b1=new JButton("회원가입");
		JButton b2=new JButton("회원탈퇴");
		JButton b3=new JButton("회원수정");
		JButton b4=new JButton("회원검색");
		
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
				// 회원가입 버튼 처리 이벤트
				
				System.out.println("-----회원가입처리-----");
				String id= t1.getText();
				String pw= t2.getText();
				String name= t3.getText();
				String tel= t4.getText();
				
				if(id.equals("")) //id 미입력시 경고문 처리
				{
					System.out.println("id는 필수 입력");
					JOptionPane.showMessageDialog(f, "id는 필수입니다");
				}
				
				MemberDAO3 dao=new MemberDAO3(); //MemberDAO2 클래스 호출
				
				MemberVO bag=new MemberVO(); //MemberVO클래스 호출 ,인스턴스 생성
				bag.setId(id); 
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				
				//값이 들어있는 VO전달
				int result = dao.insert(bag); //MemberDAO2 클래스 insert 메소드에 매개변수 전달 
				
				if(result==1) {
					JOptionPane.showMessageDialog(f, "가입완료");
				}
				else 
				{
					JOptionPane.showMessageDialog(f, "가입실패");
				}
				
				System.out.println("처리완료.");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원 탈퇴 처리
				System.out.println("-----회원탈퇴처리-----");
				System.out.println("-----id만 입력-----");
				String id= t1.getText();
				
				MemberDAO3 dao=new MemberDAO3();
				int result=dao.delete(id);
				
				if(result==1) {
					JOptionPane.showMessageDialog(f, "탈퇴완료");
				}
				else 
				{
					JOptionPane.showMessageDialog(f, "탈퇴실패");
				}
				
				
				System.out.println("처리완료.");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원 수정 처리
				System.out.println("-----회원정보수정-----");
				System.out.println("-----변경할 전화번호 ,id입력-----");
				String id= t1.getText();
				String tel= t4.getText();
				
				MemberDAO3 dao=new MemberDAO3();
				
				MemberVO bag= new MemberVO();
				
				bag.setId(id);
				bag.setTel(tel);
				
				int result=dao.update(bag);
				
				if(result==1) {
					JOptionPane.showMessageDialog(f, "수정완료");
				}
				else 
				{
					JOptionPane.showMessageDialog(f, "수정실패");
				}
				
				
				System.out.println("처리완료.");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원 검색
				
			}
		});
		
		f.setVisible(true);	
	}

}
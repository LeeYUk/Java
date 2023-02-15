package methodPractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyMovie {
	//나의 영화
	static int index=2;
	public static void main(String[] args) {
		String title[]= {"기생충","남산의부장들","라라랜드","어벤져스","백두산"};
		String img[]= {"기생충.PNG","남산의 부장들.PNG","라라랜드.PNG","어벤져스.PNG","백두산.PNG"};
		double num1[]= {9.28, 9.72 ,8.82 , 6.62 ,8.85};
		
		JFrame f=new JFrame();
		f.setSize(590, 700);
		f.getContentPane().setBackground(Color.CYAN);
		
		Font font=new Font("궁서",Font.BOLD,40);//객체를 생성을 할때 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
		
		//배치 객체를 바꾸어 주지 않으면 경계레이아웃을 사용하도록 세팅
		//BorderLayout
		JLabel top=new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.gray);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);
		
		JLabel center=new JLabel("");
		center.setFont(font);
		ImageIcon icon=new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		JLabel under=new JLabel(String.valueOf(num1[2]));//문자열 자리에 double형이 못들어가서 형변환을 시켜줌
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		
		JButton left=new JButton("<<");
		left.setFont(font);
		f.add(left,BorderLayout.WEST);
		
		//버튼 이벤트 처리
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index>0) {
					// 왼쪽 버튼을 클릭시 발생하는 이벤트를 처리함
					//현재 인덱스보다 하나 작은 값들로 top,center,under를 지정
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(num1[index - 1] + "");
					index--;
				}else {
					JOptionPane.showMessageDialog(f,"더이상 없습니다");
				}
			}
		});
		
		JButton right=new JButton(">>");
		right.setFont(font);
		f.add(right,BorderLayout.EAST);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index<4) {
					// 오른쪽 버튼을 클릭시 발생하는 이벤트를 처리함
					//현재 인덱스보다 하나 높은 값들로 top,center,under를 지정
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(num1[index + 1] + "");
					index++;
				}
				else {
					JOptionPane.showMessageDialog(f,"더이상 없습니다");
				}
			}
		});
		
		//프로그램이 끝나면 자동으로exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}

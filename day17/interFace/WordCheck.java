package interFace;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class WordCheck {

	public static void main(String[] args) {
		//문자 판독기ㅏ
		JFrame f=new JFrame("문자 판독기");
		f.setSize(400,500);
		f.setLayout(new FlowLayout());
		Font font=new Font("궁서",Font.BOLD,30);
		
		JLabel label=new JLabel("문장을 넣으시오");
		JTextArea area=new JTextArea(7,10);
		
		JButton b1=new JButton("글자수 세기");
		JButton b2=new JButton("배경색 변경");
		JButton b3=new JButton("글자색 변경");
		
		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//text.length(); 글자수 구해줌
		//area.setBackGround(Color.색)
		//area.setForeground()
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1클릭시 발생하는 이벤트 처리
				String text=area.getText();//입력한 문장 get
				JOptionPane.showMessageDialog(f, "글자수는"+text.length()+"개");
				area.setText("");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b2 클릭시 발생하는 이벤트 처리
//				int color[]=new int[3];
				area.setBackground(Color.CYAN);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b3 클릭시 발생하는 이벤트 처리
//				int color[]=new int[3];
				area.setForeground(Color.GREEN);
			}
		});
		
		f.setVisible(true);

	}

}

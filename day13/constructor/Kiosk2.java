package constructor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Kiosk2 {
	final static int PRICE[]= {3500,3000,4000};
	static int count2[]=new int[3];
	static int count;//0으로 초기화 됨
	//1.버튼 클릭시 ,각 음식의 주문량을 체크해서 f의 title로 보여주기
	//2.음식의 값을 다 분리, 짬뽕은3500, 우동 3000, 짜장4000원으로
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식주문시스템");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("짬뽕");
		JButton b2 = new JButton("우동");
		JButton b3 = new JButton("짜장");
		Font font = new Font("궁서", Font.ITALIC, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.cyan);
		
		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon(" ");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.png");
				imgLabel.setIcon(icon);
				count++;
				count2[0]++;
				countLabel.setText(count+"개");
				result.setText("결제금액 "+count*PRICE[0]+"원");
				f.setTitle("짬뽕"+count2[0]+"개 "+"우동"+count2[1]+"개 "+"짜장"+count2[2]+"개" );
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("우동.png");
				imgLabel.setIcon(icon);
				count++;
				count2[1]++;
				countLabel.setText(count+"개");
				result.setText("결제금액 "+count*PRICE[1]+"원");
				f.setTitle("짬뽕"+count2[0]+"개 "+"우동"+count2[1]+"개 "+"짜장"+count2[2]+"개" );
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짜장면.png");
				imgLabel.setIcon(icon);
				count++;
				count2[2]++;
				countLabel.setText(count+"개");
				result.setText("결제금액 "+count*PRICE[2]+"원");
				f.setTitle("짬뽕"+count2[0]+"개 "+"우동"+count2[1]+"개 "+"짜장"+count2[2]+"개" );
			}
		});
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
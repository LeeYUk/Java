package review;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MySwing {

	public static void main(String[] args) {
		//나의 그래픽
		
		JFrame f=new JFrame("이벤트 처리");
		f.setSize(300,300);
		
		JButton b=new JButton("버튼");
		
		f.add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b를 클릭시 발생하는 이벤트 처리
				System.out.println("버튼 클릭 됨");//콘솔창에 해당 글자를 띄움
				
			}
		} );
		
		
		f.setVisible(true);
		

	}

}

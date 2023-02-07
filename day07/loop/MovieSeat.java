package loop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MovieSeat {

	public static void main(String[] args) {
		// 영화 예매좌석 만들기
		
		JFrame f=new JFrame();
		f.setSize(300,500);
		
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		
		
	
		for (int i = 0; i < 100; i++) {
			JButton button = new JButton("버튼");
			f.add(button);
		}
		f.setVisible(true);

	}

}

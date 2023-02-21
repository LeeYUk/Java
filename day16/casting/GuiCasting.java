package casting;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiCasting {

	public static void main(String[] args) {
		// 그래픽형 변환
		
		JFrame f=new JFrame();
		f.setSize(500,500);
		//FlowLayout flow =new FlowLayout();
		f.setLayout(new FlowLayout());
		
		f.add(new JButton("버튼"));// Component <-JButton(자동형 변환)
		f.add(new JLabel("래이블"));
		f.add(new JTextField(10));
	
		f.setVisible(true);

	}

}

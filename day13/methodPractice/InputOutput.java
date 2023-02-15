package methodPractice;

import java.util.Random;

import javax.swing.JOptionPane;

public class InputOutput {
	//입력값반환값 체크
	
	public static void main(String[] args) {
		Random r=new Random();
		int data1 =r.nextInt(5);//0~4
		String data2= JOptionPane.showInputDialog("이름 입력");//String으로 리턴
		JOptionPane.showMessageDialog(null,data2);//void 리턴값이 없음
		
	}

}

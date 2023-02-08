package loop;

import javax.swing.JOptionPane;

public class ForLoop2 {

	public static void main(String[] args) {
		// for반복문
		
		for ( ; ; ) {//무한루프
			System.out.println("잘안씀");
			String data=JOptionPane.showInputDialog("종료할까요? y를입력");
			
			if(data.equals("y")){
				System.out.println("종료");
				break;//for문의 break임
			}
		}
		
		


	}
	
	
}

package conditional;

import javax.swing.JOptionPane;

public class Vote {

	public static void main(String[] args) {
		// 10명에게 배부른가요? 물어보기
		// 배부른사람 안배부른사람 카운트하기
		
		int full =0;
		int noFull=0;
		
		for(int i=0;i<10;i++) {
			String data =JOptionPane.showInputDialog("배부른가");
			if(data.equals("1")) {
				full+=1; //full++;
			}
			else if(data.equals("2"))
			{
				noFull++;//noFull+=1;
			}
		}
		System.out.println("배부근사람"+full+"명");
		System.out.println("안배부근사람"+noFull+"명");

	}

}

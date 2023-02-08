package conditional;

import javax.swing.JOptionPane;

public class Vote2 {

	public static void main(String[] args) {

		//인기투표를 하려고 합니다 ==>10명투표
		//1)아이유 2)유재석 3)BTS
		
		int iu=0;
		int yjs=0;
		int bts=0;
		
		for(int i=0;i<10;i++) {
			String data =JOptionPane.showInputDialog("당신의 1등에게 투표하세요");
			if(data.equals("1")) {
				iu+=1; //iu++;
			}
			else if(data.equals("2"))
			{
				yjs++;
			}
			else if(data.equals("3"))
			{
				bts++;
			}
		}
		System.out.println("iu:"+iu+"명 , " +"유재석:"+yjs+"명 , " +"bts:"+bts+"명 ");
		
	}

}

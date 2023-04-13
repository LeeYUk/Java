package str;

public class StrArr {

	public static void main(String[] args) {
		//스트링을 배열로
		String all="국어, 영어, 수학, 컴퓨터";
		
		//1.String[]로 바꾸시오
		//2. 바꿔서 공백이 포함되었다면 ,공백을 모두 제거 후, 다시 배열로 넣으시오
		//3. 과목수는?
		//4. 컴퓨터의 index는?
		//5.과목명이 3글자 미만인 과목수는?
		String all2=all.replace(" ", "");
		String Strall[]=all2.split(",");
		
		System.out.println(all2);
		
		System.out.println("과목수는? : "+ Strall.length+"개");
		
		int count=0;
		for (int i = 0; i < Strall.length; i++) {
			if(Strall[i].equals("컴퓨터"))
			{
					System.out.println("컴퓨터의 index는: "+i+" (배열의 index는  0부터 시작)");	
			}
			
			if(Strall[i].length()<3) {
				count++;
			}
		}
		
		System.out.println("과목명이 3글자가 넘어가는 과목수: "+count);
		
		

	}

}

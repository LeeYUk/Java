package arrayApp2;

import javax.swing.JOptionPane;

public class ArraySc {

	public static void main(String[] args) {
		// 배열 입력받아 평균내기
		
		int num1[]=new int[5];
		double sum=0;
		int sum2=0;
		
		for (int i = 0; i < num1.length; i++) {
			String data=JOptionPane.showInputDialog("숫자입력");
			//숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣기
			 num1[i]=Integer.parseInt(data);
			 sum=sum+num1[i];//전체합구하기
			 
			 if(num1[i]>=300)//300상 조건문
			 {
				 sum2=sum2+num1[i]; //합구하기
				 System.out.println("300이상 인덱스 위치 "+i);// 300이상 인덱스 출력
			 }
		}
		
		
		System.out.println("-----------------------");
		
		for (int x : num1) {
			System.out.println("입력한 값 "+x+" ");
		}
		
		System.out.println("-----------------------");
		//1.전체 합구해서,평균구하기
		System.out.println("1. 전체합 평균:"+sum/5);//.1 출력문에서 평균으로 계산후 출력
		//2. 300이상되는 숫자만 찾아서, 합구하기
		System.out.println("2. 300이상 숫자 더하기:"+sum2);//2
		//3. 300이상 되는 위치인 index 출력
		
	}

}

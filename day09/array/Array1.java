package array;

public class Array1 {

	public static void main(String[] args) {
		// 배열의 개념
		//1.값을 이미 알고있는 경우
		int[] sum={10,20,30,40};//length 까지 index가 5개 생김,int형 값이 들어간 sum배열 공간 선언
		System.out.println(sum);
		System.out.println(sum[0]);
		System.out.println(sum[1]);
		System.out.println(sum[2]);
		System.out.println(sum[3]);
		System.out.println(sum.length);
		
		sum[0]=100;
		System.out.println(sum[0]);
		
		
		System.out.println("----------------------");
		
		
		//2.값을 아직 모르고 있는데, 먼저 저장공간을 만들어두고
		//나중에 값을 넣는 경우
		int[] sum2=new int[4];
		sum2[0]=200;
		System.out.println(sum2[0]);

	}

}

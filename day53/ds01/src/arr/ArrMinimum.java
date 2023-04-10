package arr;

public class ArrMinimum {

	public static void main(String[] args) {
		// 배열의 최소값 구하기1
		int s[]= {90,80,20,60,70};

		int min=s[0];
		
		for (int x : s) {
			if(x< min) {
				min=x;	
			}
		}
		System.out.println(min);
	}

}

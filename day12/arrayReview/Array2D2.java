package arrayReview;

public class Array2D2 {

	public static void main(String[] args) {
		//2차원 배열 출력2
		
		String s[][]= {
				{"1","2","3"},	
				{"4","5","6"},	
				{"7","8","9"}	
		};
		
		//배열 인덱스값 출력
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				
				System.out.println(s[i][j]);
				
			}
		}
		
	
	}

}

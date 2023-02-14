package arrayReview;

public class Array2D {

	public static void main(String[] args) {
		//2차원 배열 출력
		
		//배열을 만들때 이미 알고 있는 경우
		int count=0;
		
		int n1[][]= {
				{1,2,3},
				{4,5,6,7}
		};
		
		System.out.println(n1.length);//2차원 배열의 length(행),2개
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		
		for (int i = 0; i < n1.length; i++) { //행
			
			for (int j = 0; j < n1[i].length; j++) {//열
				System.out.println(n1[i][j]);
			}
		}
		//배열을 만들때 아직 모르고 있는경우 ,공간을 먼저 만든다.
		int n2[][]=new int [2][3]; //행의 공간 갯수가 다르면 두번째 []칸은 비워둔다
	}

}

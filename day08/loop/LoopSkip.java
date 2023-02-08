package loop;

public class LoopSkip {

	public static void main(String[] args) {
		// 반복문안에서 스킵하기
		
		//1번부터 10번까지 중에서 짝수만 프린트
		
		for (int i = 0; i <= 10; i++) {
			if((i%2)==0) {
				System.out.println(+i);
			}
		}

	}

}

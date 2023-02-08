package review;

public class conditional {

	public static void main(String[] args) {
		// 조건문 복습
		
		int target=77;//숫자맞추기를 해봅시
		int me =88;//내가 시도한 값
		
		//조건문은 결과가 무조건 논리형으로 출력됨(true/false)
		if (target==me) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
		//문자열 조건
		String str1="로또";
		switch (str1) {
		case "로또":
			System.out.println("정답");
			break;
			
		default://디폴트는 위의 조건이 모두 아닐때 값을 넣어줌 생략가능 
			System.out.println("오답");
			break;
		}
	}

}

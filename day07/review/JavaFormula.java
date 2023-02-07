package review;

public class JavaFormula {

	public static void main(String[] args) {
		// 자바 연산시 주의점
		int x=20; //한줄 복사 ctrl+alt+화살표 아래
		int y=30;
		
		System.out.println(x/y); //int형에서 나눗셈을 할경우 결과값이 실수일때 소수점 을 빼고 출력됨
		System.out.println(x%y);
		
		//이미 정수로 저장된 값을 cpu가 가져다가 실수 연산을 하고 싶은 경우
		//cpu가 정수를 실수로 변환해서 할 수 있음
		//강제 타입 변환(강제형 변환)==>(강제로 바꾸고싶은 타입)변수명
		//System.out.println(x/(double)y);
		
	}

}

package extendS;

public class Exception {

	public static void main(String[] args) {
		// 예외처리1
		//실행 될 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것.
		
		System.out.println("1.난 프린트 될 거야.");
		
		try {
			
			System.out.println("2. 문제 발생 코드>>"+10/0);
		}
		catch (java.lang.Exception e) 
		{
			System.out.println("에러 발생");
			
			//e.printStackTrace(); 에러정보 보여 줌 
			
		}
		System.out.println("3. 나는 프린트 될까요?");

	}

}

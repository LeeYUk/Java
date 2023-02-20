package extendS;

import java.io.FileWriter;
import java.io.IOException;

public class Exception3 {

	public static void main(String[] args) {
		// 예외처리3

		int num[] = new int[3];
		
		try {
			num[3] = 2;// 문제가 생길 여지가 있는 코드!!
		} 
		catch (java.lang.Exception e) {
			// 예외 처리
			System.out.println("에러발생");

		}
		System.out.println(num.length);
	}

}

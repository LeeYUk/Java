package extendS;

import java.io.FileWriter;
import java.io.IOException;

public class Exception2 {

	public static void main(String[] args) {
		// 예외처리2
		//실행 될 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것.
		
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("ㅎㅇ\n");
			file.write("ㅂㅂ\n");
			file.close();
		} catch (IOException e) {
			//예외 처리
			System.out.println("에러발생");
			e.printStackTrace();
		}
	}

}

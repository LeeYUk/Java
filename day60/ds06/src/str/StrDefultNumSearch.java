package str;

import java.util.Arrays;

public class StrDefultNumSearch {

	public static void main(String[] args) {
		//문자열다루기 기본숫자찾기
		String s = "a234"; //false
		//String s = "1234"; //true
		boolean answer = true;
		
		//0. 4글자, 6글자인지 판단해서 맞으면
		//   아래를 실행해주자.
		//글자수를 구해주자.
		int size = s.length();
		if(size == 4 || size == 6) {
			//1.글자하나씩 떨어뜨려라.
			//  for문 돌려서 하나씩 꺼낸 다음
			//  글자하나하나가 0~9사이인지 확인 
			char[] c = s.toCharArray();
			System.out.println(Arrays.toString(c));
			
			for (char x : c) {
				if(x < '0' || x > '9') {
					answer = false;
					break;
				}
			}
		}else { //
			answer = true;
		}
		System.out.println(answer);
		System.out.println('A' + 32);
		
		//2. 숫자로 바꾸어서 에러가 생기면 
		//   문자가 포함되어 있음.
		if(size==4|| size==6) {
			//String을 int로 바꾸어서 error생기는지 확인 --> error가 생겼으면 문자가 
			try {
				Integer.parseInt(s);
			}
			catch (NumberFormatException e) {
				//숫자로만 이루어지지 않음을 예외처리
				answer=false;
			}
			
		}
		else {
			answer=true;
		}
		System.out.println(answer);
		
	}

}

package str;

public class StringBuilderTest {

	public static void main(String[] args) {
		// StringBuilder
		String s="pongpong";
		String s2="pongpong";
		System.out.println(s==s2);//주소비교
		System.out.println(s.equals(s2));//주소가 가르키는 값 비교
		
		s="hahaha";
		System.out.println(s==s2);//주소비교
		System.out.println(s.equals(s2));//주소가 가르키는 값 비교

	}

}

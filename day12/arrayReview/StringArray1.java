package arrayReview;

public class StringArray1 {

	public static void main(String[] args) {
		//문자열과 배열1
		//String의 일부를 추출, 확인사용하는 메소드
		String str1="나는 프로그래머";
		String str2="진짜!!";
		
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));//문자열 더하기
		System.out.println(str1.charAt(0));
		char c=str1.charAt(0);//한문자만 추출
		System.out.println(str1.endsWith("야"));//true/false
		boolean result=str1.endsWith("야");
		String result2=str1.substring(3);//인덱스 3부터 끝까지 추출 ==>
		String result3=str1.substring(3,8);//인덱스 3부터 7까지 추출
		boolean result4=str1.contains(str2);//boolean
		int index=str1.lastIndexOf("프");//8
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.length());//글자갯수
		
		str1=str1.replace("나", "너");//비파괴 함수
		System.out.println(str1);
		

	}

}

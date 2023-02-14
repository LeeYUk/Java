package arrayReview;

public class StringArray2 {

	public static void main(String[] args) {
		//문자열과 배열2
		String s="감자,고구마,양파";
		//String에 들어있는 문자열을 분리시키고 싶을때 split(기준) 함수 사용 ,기준을 구분자라고 부름
		//분리된 결과는 배열에 들어감.
		String s2[]=s.split(",");
		System.out.println(s2.length);
		System.out.println(s2[0]);
		
		String ss="감자,고구마,양파";
		String s22[]=ss.split("");
		System.out.println(s22[2]);
		
		String s3="   홍길동";//4
		System.out.println(s3.trim());
		String s4=s3.trim();
		System.out.println(s4.length());
		
		String s5=s3.replace("    ", "");
		System.out.println(s5.length());
		
		String s6="홍길동";//각각의 글자 하나하나 불리하고 싶을때
		char s7[]= s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);

		

	}

}

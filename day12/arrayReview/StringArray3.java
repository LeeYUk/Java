package arrayReview;

public class StringArray3 {

	public static void main(String[] args) {
		//문자열과 배열2
		String s1=" 011-245-1234 ";
		String s2=s1.trim();//양쪽 공백을 제거하시오
		String s3[]=s2.split("-");//-을 기준으로 분리해내세요
		
		//배열의 첫번째 문자열을 구분
		if(s3[0].equals("011")) {
			System.out.println("Sk");
		}
		else if(s3[0].equals("019"))
		{
			System.out.println("LG");
		}
		else {System.out.println("APPLE");
		}
		
		//배열에 두번쨰 문자열 길이 구분
		if(s3[1].length()>=4) {
			System.out.println("최신폰");
		}
		else 
		{
			System.out.println("올드폰");
		}
		
		int total =s3[0].length()+s3[1].length()+s3[2].length();
		
		System.out.println(total);
		if(total>=10) {
			System.out.println("유효한");
		}
		else 
		{ 
			System.out.println("무효한");
		}
	 
				
	
		
		
		
		
		
		

	}

}

package arrayIntensify;

public class ArrayDeepCopy {

	public static void main(String[] args) {
		// 배열의 깊은 복사응용
		
		String sub[]= {"국어","영어","수학","컴퓨터","회화"};
		int num1[]= {44,66,22,99,100};//1학기 성적
		int num2[]=num1.clone();//2학기 성적 ,깊은 복사시 두개의 주소가 다르게 나옴
		int count=0;
		int upcount=0;
		
		//System.out.println(num1==num2);//주소 비교
		
		num2[0]=22;
		num2[2]=88;
		
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]+" ");
		}
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]+" ");
		}
		
		for (int i = 0; i < num2.length; i++) {
			if(num1[i]==num2[i]) {
				count++;
			}
			else if(num1[i]<num2[i])
			{
				upcount++;
				System.out.println("성적이 오늘 과목은: "+sub[i]);
				
			}
		}
	
		System.out.println("1,2학기 성적중  오른 과목수: "+upcount);
		System.out.println("1,2학기 성적이 같은 과목수: "+count);
		
	}

}

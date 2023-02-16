package constructor;

public class StaffMain {

	public static void main(String[] args) {
		// class Staff 메인
		
		
		Staff work1=new Staff("홍길동", 25, '여');
		Staff work2=new Staff("김길동", 24, '남');
		Staff work3=new Staff("송길동", 26, '여');
		
		System.out.println("우리회사 직원의 수는 : "+Staff.count+"명");//1.총 직원의 수 출력 
		System.out.println("회사의 직원 정보 출력");//2.직원수 출력
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		
		System.out.println(Staff.sum/(double)Staff.count);//3.직원의 나이 평균 출력
		
		

	}

}

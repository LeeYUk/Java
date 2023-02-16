package constructor;

public class EnrolmentMain {

	public static void main(String[] args) {
		// class Enrolment 메인
		
		Enrolment sub1=new Enrolment("자바", "14:30", "홍길동");
		Enrolment sub2=new Enrolment("JSP", "9:30", "김길동");
		
		System.out.println(sub1);
		
		System.out.println(sub2);

	}

}

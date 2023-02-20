package extendS;

import review.Employee;

public class EmployeeMain{

	public static void main(String[] args) {
		// class Employee 메인
		
		Employee work =new Employee();
		work.name="홍길동";
//		work.address="강남구";//default =>같은 패키지에서만 접근가능
//		work.salary=100;//protected =>상속관계일때만 접근가능
		work.getRrn();

	}

}

package conditional;

import java.util.Scanner;

public class Sc2 {

	public static void main(String[] args) {
		// scanner콘솔입력
		
		Scanner sc=new Scanner(System.in); //scanner인스턴스 생성
		System.out.println("이름입력 >>");
		String name=sc.nextLine();
		
		System.out.println("나이 입력 >>");
		int age =sc.nextInt();
		
		System.out.println("키 입력 >>");
		double height =sc.nextDouble();
		
		System.out.println("저녁을 먹었나");
		boolean food=sc.hasNextBoolean();
		
		System.out.println("올해의 목표는");
		sc.hasNextLine();
		String life =sc.nextLine();
	
		System.out.println("===============");
		System.out.println("내 이름은"+name);
		System.out.println("내년 나이는"+(age+1));
		System.out.println("내년 키는"+(height+10));
		
		if(food) {
			System.out.println("배부름");
		}
		else {
			System.out.println("배고픔");
		}
		
		System.out.println("올해의 목표는"+life);
		
		sc.close();
	}

}

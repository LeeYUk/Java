package conditional;

import java.util.Scanner;

public class Sc3 {

	public static void main(String[] args) {
		// scanner콘솔입력
		
		Scanner sc=new Scanner(System.in); //scanner인스턴스 생성
		//나에 대한 정보
		System.out.println("---------------");
		System.out.print("이름 입력 >>");
		String name=sc.nextLine();
		
		System.out.print("나이입력>>");
		String age=sc.nextLine();
		
		System.out.print("취미입력>>");
		String habby=sc.nextLine();

		System.out.println("---------------");
		
		System.out.println("나의이름은 "+name);
		System.out.println("나의 나이는 "+age);
		System.out.println("나의 취미는 "+habby +"입니다.");
		
		sc.close();
	}

}

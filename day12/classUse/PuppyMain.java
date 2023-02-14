package classUse;

import classProduce.Puppy;

public class PuppyMain {

	public static void main(String[] args) {
		// 강아지 메인
		
		Puppy p1=new Puppy();
		p1.age=3;
		p1.name="강아지";
		
		System.out.println("강아지의 나이 : "+p1.age);
		System.out.println("강아지의 이름 : "+p1.name);
		
		p1.action();
		

	}

}

package extend;

public class Hero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Man p=new Man();
		p.name="홍길동";
		p.age=100;
		System.out.println(p);
		p.eat();
		
		Man2 man2= new Man2();
		man2.run();
		
		Superman s=new Superman();
		s.name="칼엘";
		s.age=25000;
		s.power=50000;
		s.fly=true;
		s.eat();
		s.run();
		s.space();
		
	}

}

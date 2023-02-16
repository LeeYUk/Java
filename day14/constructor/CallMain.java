package constructor;



public class CallMain {

	public static void main(String[] args) {
		//call class 메인
		
		
		Call p1=new Call();
		p1.price=1000;
		p1.shape="폴더";
		p1.internet();
		System.out.println("p1의 가격 : "+p1.price);
		System.out.println("p1의 모양 : "+p1.shape);
		
		Call p2=new Call();
		p2.price=2000;
		p2.shape="네모";
		p2.kakaotalk();
		System.out.println("p2의 가격 : "+p2.price);
		System.out.println("p2의 모양 : "+p2.shape);
	}

}

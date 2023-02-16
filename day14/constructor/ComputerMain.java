package constructor;

public class ComputerMain {

	public static void main(String[] args) {
		//class Computer 메인
		
		Computer c1=new Computer(10000, "Apple", 50);
		Computer c2=new Computer(20000, "LG", 27);
		Computer c3=new Computer(50000, "Samsong", 27);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}

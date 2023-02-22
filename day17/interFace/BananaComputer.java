package interFace;

public class BananaComputer implements Computer {

	@Override
	public void on() {
		System.out.println("조용하게 켜진다");
		
	}

	@Override
	public void off() {
		System.out.println("조용하게 꺼진다");
		
	}

	@Override
	public void run() {
		System.out.println("속도는 느리다");
		
	}

}

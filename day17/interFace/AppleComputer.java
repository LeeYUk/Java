package interFace;

public class AppleComputer implements Computer{

	@Override
	public void on() {
		System.out.println("요란하게 켜진다");
		
	}

	@Override
	public void off() {
		System.out.println("요란하게 꺼진다");
		
	}

	@Override
	public void run() {
		System.out.println("속도는 빠르다");
		
	}
	
}

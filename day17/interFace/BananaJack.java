package interFace;

public class BananaJack implements Iphone {

	@Override
	public void flatten() {
		// 납작하게 만들다
		System.out.println("검정색으로 납작하게 만들다");

	}

	@Override
	public void twoCmMake() {
		// 2cm로 만들다
		System.out.println("짧은 줄로 2cm로 만들다");

	}

}

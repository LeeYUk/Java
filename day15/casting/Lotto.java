package casting;

import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		//로또 문제
		
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		System.out.println(bag);
		bag.add("볼펜");//중복제거!
		System.out.println(bag);

	}

}

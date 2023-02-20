package casting;

import java.util.HashSet;
import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		// 로또 문제

		Random r = new Random();
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add(r.nextInt(45) + 1); // 1~45
		}

		System.out.println(lotto.size());
		System.out.println(lotto);

	}

}

package casting;

import java.util.HashSet;
import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		//로또 문제
		
		Random r=new Random(42);
		HashSet lotto=new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; i <1000 ; i++) {
			lotto.add(r.nextInt(1000));
		}
		
		System.out.println(lotto.size());
		System.out.println(lotto);
		
	}

}

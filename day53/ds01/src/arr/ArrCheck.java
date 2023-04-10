package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrCheck {

	public static void main(String[] args) {
		// 배열을 만드는 방법
		//배열만들 때 부터 값을 알고있는 경우
		int ages[]= {60,50,30,20,10};
		
		//배열을 만드는방법2
		//배열을 만들 때는 값을 모르고 있다고 나중에 넣는경우
		double weight[]=new double[5];
		weight[0]=77.8;
		weight[1]=45.5;
		weight[2]=88.5;
		weight[3]=99.5;
		weight[4]=33.5;
		
		//for문 2가지
		//기본 for문
		for (int i = 0; i < weight.length; i++) {
			System.out.println(ages[i] + " " +weight[i]);
		}
		//for-each
		for (double d : weight) {
			System.out.println(d);
		}
		
		
		
		
		

	}

}

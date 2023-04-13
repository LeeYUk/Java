package collaction;

import java.awt.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;

public class ArrCollac2 {


	public static void main(String[] args) {
		//배열과컬렉션변환2
		
		
		String[] s2 = {"감자", "고구마", "우유", "감자", "양파"};
		stringPrint(s2);
		
		java.util.List<String> list=Arrays.asList(s2);
		System.out.println(list.lastIndexOf("감자"));
		stringPrint(s2);
	
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
		
	}

}

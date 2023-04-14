package 문자열;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String sno = "2056521";
    	
    	String[] qq = sno.split("");
    	Arrays.sort(qq);
    	String에서Char배열에옮기기2.print(qq);
    	System.out.println(Arrays.binarySearch(qq, "2"));
    	
	}

}

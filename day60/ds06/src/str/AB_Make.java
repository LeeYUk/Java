package str;

import java.util.Arrays;

public class AB_Make {

	public static void main(String[] args) {
		// A를 B로 만들기
		
		String before="olleh";
		String after="hello";
		
		char b[]=before.toCharArray();
		char a[]=after.toCharArray();

		Arrays.sort(b);
		Arrays.sort(a);
		
		int answer=0;
		
		if(Arrays.equals(a, b)) {
			answer=1;
		}
	}

}

package arrTest;

import java.util.Arrays;

public class ArrElement {
	public static void main(String[] args) {
		//각도기 문제
		String strlist[]= { "I", "Love", "Programmers."};
		
		Solution2 sol=new Solution2();
		int answer[]=sol.solution(strlist);
		System.out.println(Arrays.toString(answer));
		
		
	
		
	}
}
class Solution2 {
    public int[] solution(String[] strlist) {
        int answer[] = new int[strlist.length];
        for(int i=0;i<strlist.length;i++) {
        	answer[i]=strlist[i].length();
        }
        return answer;
    }
}
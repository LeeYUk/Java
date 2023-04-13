package arrTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrTest2 {

		public static void main(String[] args) {
			int[] array = { 1, 2, 3, 4, 5 };
			int start = 1;
			int end = 3;

			Solution5 sol = new Solution5();
			int[] answer = sol.solution(array, start, end);
			System.out.println(Arrays.toString(answer));
		}
	}

	class Solution5 {
		public int[] solution(int[] array, start, end) { 
			int[] answer = {};
			return answer;
		}
	
	}

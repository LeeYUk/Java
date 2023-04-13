package defaultTest;

public class PizzaTest1 {
	public static void main(String[] args) {
		// 각도기 문제
		int n = 15;
		Solution3 sol = new Solution3();
		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution3 {
	public int solution(int n) {
		int answer = 0;

		if (n <= 7) {
			answer = 1;
		} else if (n % 7 == 0) {
			answer = n / 7;
		} else {
			answer = n / 7 + 1;
		}

		return answer;
	}
}
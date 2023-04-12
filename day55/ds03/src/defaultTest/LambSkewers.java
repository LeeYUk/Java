package defaultTest;

public class LambSkewers {
	public static void main(String[] args) {
		// 각도기 문제
		int angle = 70;
		Solution2 sol = new Solution2();
		int n = 10;// 꼬치 주문
		int k = 3;// 음료 꼬치 주문
		int answer = sol.solution(n, k);
		System.out.println(answer);

	}
}

class Solution2 {
	public int solution(int n, int k) {
		int free = n / 10;
//10인분 주문시        10 * 12000 + 3 * 2000 - 1 * 2000 = 124,000원
//64인분 주문시        64 * 12000 + 6 * 2000 - 6 * 2000 = 768,000원
		int answer =n*12000+k*2000-free*2000;
		
		return answer;
	}
}
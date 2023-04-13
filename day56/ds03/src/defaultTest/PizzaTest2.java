package defaultTest;

public class PizzaTest2 {
	public static void main(String[] args) {
		// 피자 나눠먹기 2
		int n = 15;
		Solution5 sol = new Solution5();
		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution5 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n;i++) {
        	if(i*6%n==0) {
        		answer =i;
        		break;
        	}
        }
        return answer;
    }
}
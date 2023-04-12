package defaultTest;

public class PizzaTest3 {
	public static void main(String[] args) {
		// 각도기 문제
		int n = 12;//피자먹을 사람 수
		int slice=4;//피자 조각수 
		Solution4 sol = new Solution4();
		int answer = sol.solution(slice,n);
		System.out.println(answer);

	}
}

class Solution4 {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n<=slice) {
        	answer=1;
        }
        else if(n%slice==0) {
        	answer=n/slice;
        }
        else {
        	answer=n/slice+1;
        }
        
        return answer;
    }
}
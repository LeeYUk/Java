package arrTest;

public class ReturnArr {

	public static void main(String[] args) {
		// 리턴 여러개 배열로
		
		int money=15000;
		
		Solution0 sol =new Solution0();
		int answer[]=sol.solution(money);

	}

}

class Solution0{
	public int[] solution(int money) {
		int  answer[] = {0,0};
		return answer;
	}
}

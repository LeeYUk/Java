package arrTest;

public class MusscHeight {

	public static void main(String[] args) {
		//머쓱이보다 키 큰 사람
		int array[]= {149, 180, 192, 170};
		int height=167;
		Solution1 sol=new Solution1();
		int answer=sol.solution(array, height);
		System.out.println(answer);
		
	}

}
	class Solution1 {
		    public int solution(int[] array, int height) {
		        int answer = 0;
		      for (int x : array) {
				if(x>height) {
					answer++;
				}
			}
		        
		        return answer;
		    }
		}
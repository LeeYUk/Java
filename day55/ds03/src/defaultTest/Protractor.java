package defaultTest;

public class Protractor {
	public static void main(String[] args) {
		//각도기 문제
		int angle=70;
		Solution sol=new Solution();
		int answer=sol.solution(angle);
		System.out.println(answer);
		
		
	
		
	}
}

	class Solution {
		    public int solution(int angle) {
		    	  int answer = 0;
		    	  
		          if(angle>0 && angle <90) {
		        	  answer =1;
		          }
		          else if(angle==90) {
		        	  answer=2;
		          }
		          else if(angle>90 && angle<180) {
		        	  answer=3;
		          }
		          else if(angle ==180) {
		        	  answer=4;
		          }
    	
		       return answer;
		    }
		}
		
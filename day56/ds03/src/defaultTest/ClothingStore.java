package defaultTest;

public class ClothingStore {
	public static void main(String[] args) {
		//옷가게 할인받기
		int price=150000;
		Solution6 sol=new Solution6();
		int answer=sol.solution(price);
		System.out.println(answer);
		
		
	
		
	}
}
class Solution6 {
    public int solution(int price) {
        int answer = 0;
        
        if(price >=500000) {
        	answer=(int)(price-(price*0.2));
        }
        else if(price >=300000) {
        	answer=(int)(price-(price*0.1));
        }else if(price >=100000) {
        	answer=(int)(price-(price*0.05));
        }
        else {
        	answer=price;
        }
        
        
        return answer;
    }
}
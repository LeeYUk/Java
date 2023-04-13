package arr;

public class ArrDouble {

	public static void main(String[] args) {
		//배열두배만들기
		int numbers[]= {1, 2, 3, 4, 5};
		Solution1 sol=new Solution1();
		int answer[]=sol.solution(numbers);
		System.out.println(answer);

	}

}

class Solution1 {
    public int[] solution(int[] numbers) {
        int answer[]=new int[numbers.length];
        
        for(int  i=0;i<numbers.length;i++){
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}
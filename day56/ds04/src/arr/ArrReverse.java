package arr;

public class ArrReverse {

	public static void main(String[] args) {
		//배열뒤집기
		int num_list[]= {1, 2, 3, 4, 5};
		Solution2 sol=new Solution2();
		int answer[]=sol.solution(num_list);
		System.out.println(answer);

	}

}

class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j=num_list.length-1;
        for(int i=0;i<num_list.length;i++) {
        	answer[j]=num_list[i];
        	j--;
        }
        return answer;
    }
}
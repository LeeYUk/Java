package casting;
import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		// queue확인문제
		
		LinkedList text=new LinkedList();
		
		text.add("수학");
		text.add("영어");
		text.add("컴퓨터");
		
		System.out.println("전체 시험볼 과목: "+text);
		
		for (int i = 0; i < text.size()+2; i++) {
			System.out.println((i+1)+"일차 시험본 후 남은 과목 : "+text);
			text.remove();

		}
	}

}

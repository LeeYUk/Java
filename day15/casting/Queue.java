package casting;

import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
		// 큐 자료형

		LinkedList milk=new LinkedList();
		milk.add("어제 상한 우유");
		milk.add("오늘 싱싱한 우유");
		milk.add("내일 더 싱싱한 우유");
		milk.remove();
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}

package stack;

import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/12909
		
		String s=")()(";
		
		Stack<Character> stack=new Stack<Character>();
		boolean answer=false;
		
		try 
		{
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='(') {
					stack.push('(');
				}else {
					stack.pop();
				}
			}
			answer=stack.empty();
		}
		catch(Exception e)
		{
			answer=false;
		}

		System.out.println(answer);
	}

}

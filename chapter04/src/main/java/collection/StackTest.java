package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");
		
		while (!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}

		System.out.println("======================================");
		
		stack.push("Hello");

		System.out.println(stack.pop());
		
//		 비어있는 경우, pop()을 호출하면 예외가 발생한다.
//		System.out.println(stack.pop());
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
	}

}

package stack;

import java.util.Stack;

public class StackDemo03 {
	public static void main(String[] args) {
		Stack<String> strings = new Stack<String>();
		strings.push("Apple");
		strings.push("Grapes");
		strings.push("Mango");
		strings.push("Orange");
		
		System.out.println("Stack :"+strings);
		
		String peek = strings.peek();
		System.out.println("Element at Top :"+peek);
		System.out.println("Stack Element :"+strings);
	}
}

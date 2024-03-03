package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo01 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Elements OF Stack :"+stack);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Fetching The Value Of Stack Using Pop.");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("is Stack Empty :"+stack.empty());
	
	}
}


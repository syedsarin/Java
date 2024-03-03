package stack;

import java.util.Stack;

public class StackDemo04 {
	public static void main(String[] args) {
		Stack<String> strings = new Stack<String>();
		strings.push("Apple");
		strings.push("Grapes");
		strings.push("Mango");
		
		System.out.println("Print Offset Position :"+strings.search("Mango"));
		System.out.println("Ofset Position :"+strings.search("Banana"));
		System.out.println("is Stack Empty :"+strings.empty());
		System.out.println("Index Position :"+strings.indexOf("Mango"));
	}
}

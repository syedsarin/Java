package stack;

import java.util.Stack;

public class StackDemo02 {
	public static void main(String[] args) {
		Stack<Integer> integer = new Stack<>();
		integer.push(11);
		integer.push(22);
		integer.push(43);
		integer.forEach(num->System.out.println(num));
		System.out.println("-------------------------------------------------------------------------");
		Stack<String> string = new Stack<>();
		string.push("Mir");
		string.push("Nure");
		string.push("Fisha");
		string.forEach(name-> System.out.println(name));
		System.out.println("-------------------------------------------------------------------------");
		Stack<Character> characters = new Stack<>();
		characters.push('A');
		characters.push('B');
		characters.push('C');
		characters.forEach(ch->System.out.println(ch));
		System.out.println("-------------------------------------------------------------------------");
		Stack<Double> doubles = new Stack<>();
		doubles.push(5.0);
		doubles.push(2.0);
		doubles.push(1.0);
		doubles.forEach(doub-> System.out.println(doub));
	}
}

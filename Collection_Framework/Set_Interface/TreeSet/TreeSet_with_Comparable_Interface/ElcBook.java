package treeSet;

import java.util.TreeSet;

public class ElcBook {
	public static void main(String[] args) {
		// TreeSet<Book> books = new TreeSet<>((o1, o2) ->
		// o1.bookName().compareTo(o2.bookName()) ); by Using Comparator
		
		
		TreeSet<Book> books = new TreeSet<>();// By Using Comparable
		books.add(new Book("Core Java", "James"));
		books.add(new Book("Advanced Java", "gos"));
		books.add(new Book("Oracle", "IBM"));
		books.add(new Book("JavaScript", "Echma"));

		books.forEach(System.out::println);
	}
}

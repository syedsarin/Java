package treeSet;

public record Book(String bookName, String authorName) implements Comparable<Book>{

	@Override
	public int compareTo(Book b) {
				return  this.bookName.compareTo(b.bookName);
	}
	
}

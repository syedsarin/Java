package exam_feb28;

import java.util.ArrayList;

public class RemoveElement {
	public static void main(String[] args) {
		ArrayList<String> arlist = new ArrayList<>();
		arlist.add("Red");
		arlist.add("Green");
		arlist.add("Orange");
		arlist.add("White");
		arlist.add("Black");
		System.out.println("Before Removing :"+arlist);
		arlist.remove(3);
		arlist.remove(1);
		System.out.println("After Removing"+arlist);
	}
}

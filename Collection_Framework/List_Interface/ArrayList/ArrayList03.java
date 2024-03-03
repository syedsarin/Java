package arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Ravi","NIT","HYD");
		list.add("Rahul");//UnsupportedOperationException
		
		list.forEach(System.out::println);
	}

}

/*java.util.Arrays class is containing a predefined static method 
asList(T ...x) through which we can create list of elements, after creating we can't perform any kind of operartion otherwise
UnsupportedOperationException will be generated as shown in the above program.
*/


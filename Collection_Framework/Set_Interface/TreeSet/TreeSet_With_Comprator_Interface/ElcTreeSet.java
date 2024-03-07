package treeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ElcTreeSet 
{
	public static void main(String[] args) 
	{
		Set<Product> products = new TreeSet<>((p1, p2) -> p1.productId() - p2.productId());
		products.add(new Product(01, "SUPRA"));
		products.add(new Product(02, "AUDI"));
		products.add(new Product(03, "BENTLY"));
		products.add(new Product(04, "URUS"));
		products.add(new Product(05, "BMW"));
		
		products.forEach(System.out::println);
		
		System.out.println("=============================Soting Based on Descending Order.==================================");
		Set<Product> products1 = new TreeSet<>((p3, p4) -> p4.productId() - p3.productId());
		products1.add(new Product(01, "SUPRA"));
		products1.add(new Product(02, "AUDI"));
		products1.add(new Product(03, "BENTLY"));
		products1.add(new Product(04, "URUS"));
		products1.add(new Product(05, "BMW"));
		
		products1.forEach(System.out::println);

		System.out.println("=============================Soting Based on Alphabetical Order.==================================");
		Set<Product> products3 = new TreeSet<>((p5, p6) -> p5.productName().compareTo(p6.productName()));
		products3.add(new Product(01, "SUPRA"));
		products3.add(new Product(02, "AUDI"));
		products3.add(new Product(03, "BENTLY"));
		products3.add(new Product(04, "URUS"));
		products3.add(new Product(05, "BMW"));
		
		products3.forEach(System.out::println);
		
		System.out.println("=============================Soting Based on Reverse Order.==================================");
		Set<Product> products4 = new TreeSet<>((p7, p8) -> - p7.productName().compareTo(p8.productName()));
		products4.add(new Product(01, "SUPRA"));
		products4.add(new Product(02, "AUDI"));
		products4.add(new Product(03, "BENTLY"));
		products4.add(new Product(04, "URUS"));
		products4.add(new Product(05, "BMW"));
		
		products4.forEach(System.out::println);

		
}
}
package treeSet;

public record Product(int productId ,String productName) 
{	
	public Product
	{
		if(productId < 0)
		{
			throw new IllegalArgumentException();
		}
	}
}
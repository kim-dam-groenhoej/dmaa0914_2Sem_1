package ModelLayer;

public class Clothing extends Product {
	
	private String size;
	private String color;
	
	public Clothing(int id, String name, double purchasePrice,double salePrice, double rentPrice, Country country, int minStock, int amountinstock, Supplier supplier,  String size, String color){
		super(id, name, purchasePrice, salePrice, rentPrice, country, minStock, amountinstock, supplier);
		this.size = size;
		this.color = color;
	}
	
	
	/**
	 * Constructor for creating new Product.
	 * @param name
	 * @param purchasePrice
	 * @param salePrice
	 * @param rentPrice
	 * @param country
	 * @param minStock
	 * @param amountinstock
	 * @param supplier
	 * @param size
	 * @param color
	 */
	public Clothing( String name, double purchasePrice,double salePrice, double rentPrice, Country country, int minStock, int amountinstock, Supplier supplier,  String size, String color){
		super(name, purchasePrice, salePrice, rentPrice, country, minStock, amountinstock, supplier);
		this.size = size;
		this.color = color;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public String getSize() 
	{
		return size;
	}
	
	public void setSize(String size) 
	{
		this.size = size;
	}
	

}

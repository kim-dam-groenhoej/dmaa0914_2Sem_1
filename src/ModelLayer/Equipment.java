/**
 * 
 */
package ModelLayer;

/**
 * @author Tobias
 *
 */
public class Equipment extends Product {

	private String type;
	private String description;
	
	/**
	 * @param id
	 * @param name
	 * @param purchasePrice
	 * @param salePrice
	 * @param rentPrice
	 * @param country
	 * @param minStock
	 * @param amountinstock
	 * @param supplier
	 */
	public Equipment(int id, String name, double purchasePrice, double salePrice, double rentPrice, Country country, int minStock, int amountinstock, Supplier supplier, String type, String description) {
		super(id, name, purchasePrice, salePrice, rentPrice, country, minStock, amountinstock, supplier);
		this.type = type;
		this.description = description;
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
	 * @param type
	 * @param description
	 */
	public Equipment( String name, double purchasePrice, double salePrice, double rentPrice, Country country, int minStock, int amountinstock, Supplier supplier, String type, String description) {
		super(name, purchasePrice, salePrice, rentPrice, country, minStock, amountinstock, supplier);
		this.type = type;
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

package ModelLayer;

public class Product {
	
	
	private int id;
	private String name;
	private double purchasePrice;
	private double salePrice;
	private double rentPrice;
	private String countryOfOrigin;
	private int minStock;
	private int amountInStock;
	private Supplier supplier;
	
	
	public Product(int id, String name, double purchasePrice,double salePrice, double rentPrice, String countryOfOrigin, int minStock, int amountinstock, Supplier supplier  )
	{
		this.id = id;
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		this.rentPrice = rentPrice;
		this.countryOfOrigin = countryOfOrigin;
		this.minStock = minStock;
		this.amountInStock = amountinstock;
		this.supplier = supplier;
		
	}

	/**  Gets the id
	 * @return id
	 */
	public int getId() {
		return id;
	}


	/*public void setId(int id) {
		this.id = id;
	}
*/ 
	/**  Gets the name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**  sets the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**  Gets the purchasePrice
	 * @return purchasePrice
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}

	/**  sets the purchasePrice
	 */
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**  Gets the salePrice
	 * @return salePrice
	 */
	public double getSalePrice() {
		return salePrice;
	}

	/**  sets the salePrice
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	/**  Gets the rentPrice
	 * @return rentPrice
	 */
	public double getRentPrice() {
		return rentPrice;
	}

	/**  sets the rentPrice
	 */
	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	/**  Gets the countryOfOrigin
	 * @return countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**  sets the countryOfOrigin
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	/**  Gets the minStock
	 * @return minStock
	 */
	public int getMinStock() {
		return minStock;
	}

	/**  sets the minStock
	 */
	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	/**  Gets the amountInStock
	 * @return amountInStock
	 */
	public int getAmountInStock() {
		return amountInStock;
	}

	/**  sets the amountInStock
	 */
	public void setAmountInStock(int amountInStock) {
		this.amountInStock = amountInStock;
	}

	/**  Gets the supplier
	 * @return supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}

	/** sets the supplier
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	

}

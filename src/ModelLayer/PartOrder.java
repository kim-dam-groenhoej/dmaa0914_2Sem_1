package ModelLayer;

/**
 * This class represent PartOrder
 * PartOrder take care of purchased counted for a invoice
 * @author Kim Dam Grønhøj
 *
 */
public class PartOrder {
	private Sale saleOrder;
	private Product product;
	private int amount;
	
	/**
	 * This is the constructor witch creates a instance of PartOrder model 
	 */
	public PartOrder(Sale saleOrder, Product product, int amount)
	{
		this.setSaleOrder(saleOrder);
		this.setProduct(product);
		this.setAmount(amount);
	}

	/**
	 * Get instance of Product witch is sold
	 * @return a instance of Product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * set instance of Product witch is sold
	 * @param product current sold Product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * Get current Sale instance
	 * @return instance of Sale
	 */
	public Sale getSaleOrder() {
		return saleOrder;
	}

	/**
	 * Set Sale instance
	 * @param saleOrder current Sale instance
	 */
	public void setSaleOrder(Sale saleOrder) {
		this.saleOrder = saleOrder;
	}

	/**
	 * Get amount of Product sold
	 * @return int amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Set amount of Product sold
	 * @param amount current amount of sold Products
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
}

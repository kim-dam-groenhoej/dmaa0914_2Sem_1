/**
 * 
 */
package ModelLayer;

/**
 * @author Tobias
 *
 */
public class GunReplica extends Product {

	private String material;
	private String calibre;
	
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
	public GunReplica(int id, String name, double purchasePrice, double salePrice, double rentPrice, Country country, int minStock, int amountinstock, Supplier supplier, String material, String calibre) {
		super(id, name, purchasePrice, salePrice, rentPrice, country, minStock, amountinstock, supplier);
		this.material = material;
		this.calibre = calibre;
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
	 * @param material
	 * @param calibre
	 */
	public GunReplica( String name, double purchasePrice, double salePrice, double rentPrice, Country country, int minStock, int amountinstock, Supplier supplier, String material, String calibre) {
		super( name, purchasePrice, salePrice, rentPrice, country, minStock, amountinstock, supplier);
		this.material = material;
		this.calibre = calibre;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the calibre
	 */
	public String getCalibre() {
		return calibre;
	}

	/**
	 * @param calibre the calibre to set
	 */
	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

}

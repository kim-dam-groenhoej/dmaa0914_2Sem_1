package ControllerLayer;

import DBLayer.ProductDB;
import ModelLayer.Product;

public class ProductCtr {

	private ProductDB productdb;
	
	public ProductCtr()
	{
		productdb = new ProductDB();
	}
	
	
	/**  Calls the function findProduct on ProductDB class
	 * @return Product
	 */
	public Product findProduct(int productno)
	{
		return productdb.findProduct(productno);
	}
	
	/**  Calls the function createProduct on ProductDB class
	 */
	public int createProduct(Product product)
	{
		try {
			return productdb.createProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		return 0;
	}
	
	/**  Calls the function updateProduct on ProductDB class
	 */
	public int updateProduct(Product product)
	{
		return productdb.updateProduct(product);
	}
	
	/**  Calls the function deleteProduct on ProductDB class
	 */
	public int deleteProduct(int productno)
	{
		return productdb.deleteProduct(productno);
	}
}

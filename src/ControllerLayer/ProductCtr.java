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
	public void createProduct(int productno)
	{
		productdb.createProduct(productno);
	}
	
	/**  Calls the function updateProduct on ProductDB class
	 */
	public int updateProduct(Product product)
	{
		return productdb.updateProduct(product);
	}
	
	/**  Calls the function deleteProduct on ProductDB class
	 */
	public void deleteProduct(int productno)
	{
		productdb.deleteProduct(productno);
	}
}

package ControllerLayer;

import DBLayer.ProductDB;
import ModelLayer.Product;

public class ProductCtr {

	private ProductDB productdb;
	
	public ProductCtr()
	{
		productdb = new ProductDB();
	}
	
	public Product findProduct(int productno)
	{
		return productdb.findProduct(productno);
	}
	
	public void createProduct(int productno)
	{
		productdb.createProduct(productno);
	}
	
	public void updateProduct(Product product)
	{
		productdb.updateProduct(product);
	}
	public void deleProduct(int productno)
	{
		productdb.deleProduct(productno);
	}
}

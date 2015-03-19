package ControllerLayer;

import java.util.Date;

import DBLayer.ProductDB;
import DBLayer.SaleDB;
import ModelLayer.Customer;
import ModelLayer.PartOrder;
import ModelLayer.Product;
import ModelLayer.Sale;

/**
 * @author Tobias
 *
 */
public class SaleCtr {
	
	private Sale s;
	private ProductCtr productCtr;
	private CustomerCtr customerCtr;
	private SaleDB saleDb;
	
	/**
	 * 
	 */
	public SaleCtr()
	{
		
	}
	
	/**
	 * Starts a new sale
	 */
	public void createSale()
	{
		s = new Sale();
	}
	
	/**
	 * @param productNo The number of the product
	 * @param quantity The quantity of the given product
	 * @return The product with the corresponding product number
	 */
	public Product enterProduct(int productNo, int quantity)
	{
		Product p = productCtr.findProduct(productNo);
		PartOrder po = new PartOrder(s,p, quantity);
		s.addPartorders(po);
		return p;
	}
	
	/**
	 * @param phoneNo the phone number of the customer to find
	 * @return The customer
	 */
	public Customer findCustomer(String phoneNo)
	{
		//Customer c = customerCtr.findCustomer(phoneNo);
		//s.setCustomer(c);
		//return c;
		return null;
	}
	
	/**
	 * @param date The date to set
	 */
	public void setDeliveryDate(Date date)
	{
		s.setDeliveryDate(date);
	}
	
	/**
	 * Saves and finishes the current sale
	 */
	public void  finishSale()
	{
		//saleDb.saveSale(s);
	}
}

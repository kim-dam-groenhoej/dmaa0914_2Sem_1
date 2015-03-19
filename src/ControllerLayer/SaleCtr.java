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
	
	public SaleCtr()
	{
		
	}
	
	public void createSale()
	{
		s = new Sale();
	}
	
	public Product enterProduct(int productNo, int quantity)
	{
		Product p = productCtr.findProduct(productNo);
		PartOrder po = new PartOrder(p, quantity);
		s.addPartorders(po);
		return p;
	}
	
	public Customer findCustomer(String phoneNo)
	{
		Customer c = customerCtr.findCustomer(phoneNo);
		s.setCustomer(c);
		return c;
	}
	
	public void setDeliveryDate(Date date)
	{
		s.setDeliveryDate(date);
	}
	
	public void  finishSale()
	{
		saleDb.saveSale(s);
	}
}

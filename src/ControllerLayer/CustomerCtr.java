package ControllerLayer;
import ModelLayer.Customer;
import DBLayer.CustomerDB;

/**
 * 
 * @author Frank Eskelund
 * @version
 */
public class CustomerCtr {

	private CustomerDB customerDB;
	
	
	public CustomerCtr()
	{
		customerDB = new CustomerDB();
	}
	
	/*This funktion finds customer by phonenumber*/
	public Customer findCustomer(String phonenumber)
	{
		return customerDB.findCustomer(phonenumber);
	}
	/*This funktion creates customer by phonenumber*/
	public void createCustomer(String phonenumber)
	{
		customerDB.createCustomer(phonenumber);
	}
	/*This funktion updates customer by customer*/
	public void upDateCustomer(String phoneNumber, Customer customer) throws Exception
	{
		customerDB.upDateCustomer(phoneNumber, customer);
	}
	/*This funktion delete customer by phonenumber*/
	public void delCustomer(int phonenumber)
	{
		customerDB.delCustomer(phonenumber);
	}
	
}

package DBLayer;

import ModelLayer.Customer;


public class CustomerDB {
	
	private DBConnection con;
	
	public CustomerDB()
	{
		con = DBConnection.getInstance();
	}
	
	public Customer findCustomer(String phonenumber)
	{
		return null;
	}
	
	public void createCustomer(String phonenumber)
	{
		
	}
	
	public void upDateCustomer(Customer customer)
	{
		
	}
	public void delCustomer(int phonenumber)
	{
		
	}
}



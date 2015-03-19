package ControllerLayer;
import java.sql.SQLException;

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
	/*This funktion creates customer by Customer model*/
	public void createCustomer(Customer customer) throws Exception
	{
		customerDB.createCustomer(customer);
	}
	/*This funktion updates customer by phonenumber and customer*/
	public void upDateCustomer(String phoneNumber, Customer customer) throws Exception
	{
		customerDB.upDateCustomer(phoneNumber, customer);
	}
	/*This funktion delete customer by phonenumber*/
	public void delCustomer(String phonenumber) throws SQLException
	{
		customerDB.delCustomer(phonenumber);
	}
}

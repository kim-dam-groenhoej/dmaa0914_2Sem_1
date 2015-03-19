package DBLayer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ModelLayer.City;
import ModelLayer.Customer;
import ModelLayer.Enums.CustomerType;

/**
 * 
 * @author Kim Dam Grønhøj, Frank
 *
 */
public class CustomerDB {
	
	private Connection con;
	
	/**
	 * Creates a instance of CustomerDB and creates a private instance of database connection also.
	 */
	public CustomerDB()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	/**
	 * Find a customer from Database
	 * @param phonenumber current customer phonenumber
	 * @return Found customer from DB
	 */
	public Customer findCustomer(String phonenumber)
	{
		String wClause = " phonenumber = '" + phonenumber +"'";
		return singleWhere(wClause);
	}

	/**
	 * Author: Kim Dam Grønhøj
	 * Create a customer to database
	 * @param phonenumber
	 * @throws SQLException 
	 */
	public void createCustomer(Customer customer) throws SQLException
	{
		String query = "INSERT INTO [Customer] (fname, lname, address, zipcode, phonenumber, email, customertype) VALUES(?, ?, ? ,? , ?, ?, ?)";
		
		int customerType = 1;
		CustomerType type = customer.getCustomertype();
		
		switch (type)
		{
			case PRIVATE: {
				customerType = 1;
				break;
			}			
			case CLUB: {
				customerType = 2;
				break;
			}		
		}
		
		// Prepared statement is used to protect from SQL injections
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setQueryTimeout(5);
		// Insert all parameters to query by index. First ? in query is fx. index 1. and next ? is index 2...
		stmt.setString(1, customer.getFname());
		stmt.setString(2, customer.getLname());
		stmt.setString(3, customer.getAddress());
		stmt.setInt(4, customer.getCity().getZipCode());
		stmt.setString(5, customer.getPhonenumber());
		stmt.setString(6, customer.getEmail());
		stmt.setInt(7, customerType);
		
		stmt.executeUpdate();
		stmt.close();
	}
	
	/**
	 * Update a customer in databsae
	 * @param phoneNumber current phonenumber in database right now
	 * @param customer all values witch should be updated in database
	 * @throws Exception
	 */
	public void upDateCustomer(String phoneNumber, Customer customer) throws Exception
	{
		String wClause = " phonenumber = '" + phoneNumber + "'";
		
		int customerType = 1;
		CustomerType type = customer.getCustomertype();
		
		switch (type)
		{
			case PRIVATE: {
				customerType = 1;
				break;
			}			
			case CLUB: {
				customerType = 2;
				break;
			}
				
		}
		
		String sClause = " fname = '" + customer.getFname() + "', lname = '" + customer.getLname() + "', [address] = '" + customer.getAddress() + "', zipcode = " + customer.getCity().getZipCode() + ", phonenumber = '" + customer.getPhonenumber() + "', email = '" + customer.getEmail() + "', customertype = " + customerType + " ";
		
		singleWhereUpdate(wClause, sClause);
	}
	
	/**
	 * Delete a custoemr in database
	 * @param phoneNumber current phonenumber
	 * @throws SQLException
	 */
	public void delCustomer(String phoneNumber) throws SQLException
	{
		String wClause = " phonenumber = '" + phoneNumber + "'";
		
		singleWhereDelete(wClause);
	}
	
	/**
	 * Helper method for delete customer
	 * @param wClause insert where query for delete without "Where"
	 * @throws SQLException
	 */
	private void singleWhereDelete(String wClause) throws SQLException
	{
		Statement stmt = con.createStatement();
		stmt.setQueryTimeout(5);
		String query = buildQueryDelete(wClause);
		
		stmt.execute(query);
		
		stmt.close();
	}
	
	/**
	 * Build the delete query with WHERE
	 * @param wClause insert where query for delete without "Where"
	 * @return full SQL delete query
	 */
	private String buildQueryDelete(String wClause)
	{
		String query = "DELETE [Customer] WHERE ";
		
		if(wClause.length()>0)
		{
			query += wClause;
		}
		
		return query;
	}
	
	/**
	 * Update customer in database
	 * @param wClause insert where query for update without "Where" 
	 * @param sClause insert sets query for update without "SETS"
	 * @throws Exception
	 */
	private void singleWhereUpdate(String wClause, String sClause) throws Exception
	{
		Statement stmt = con.createStatement();
		stmt.setQueryTimeout(5);
		String query = buildQueryUpdate(wClause, sClause);
		
		stmt.executeUpdate(query);
		
		stmt.close();
	}
	
	/**
	 * Build update query
	 * @param wClause insert where query for update without "Where" 
	 * @param sClause insert sets query for update without "SETS"
	 * @return Full SQL update query
	 */
	private String buildQueryUpdate(String wClause, String sClause)
	{
		String query = "UPDATE [Customer] SET ";

		if(sClause.length()>0)
		{
			query += sClause;
		}
		
		if(wClause.length()>0)
		{
			query += " WHERE " + wClause;
		}
		
		return query;
	}
	
	/**
	 * Read a customer from database
	 * @param wClause Insert where clause query for a customer without "WHERE"
	 * @return Found customer
	 */
	private Customer singleWhere(String wClause) {
		// TODO Auto-generated method stub
		
		
			ResultSet results;
			Customer customer = null;
			String query = buildQuery(wClause);
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);
			
			if(results.next()){
				customer = buildCustomer(results);
				stmt.close();
			}
		}catch(Exception e){
		System.out.println(e.getMessage());	
		}
		
		return customer;
	}

	/**
	 * Fill the Customer object with data
	 * @param results current relationel model result from database
	 * @return Filled Customer object
	 */
	private Customer buildCustomer(ResultSet results) throws Exception {
		Customer customer;
		
			
			int id = results.getInt("id");
			String lname = results.getString("lname");
			String fname = results.getString("fname");
			String address = results.getString("address");
			//City city = results.getCity("city");
			String email = results.getString("email");
			String phonenumber = results.getString("phonenumber");
			int customertypeNo = results.getInt("customertype");
			CustomerType customerType = CustomerType.values()[customertypeNo -1];
			
			customer = new Customer(id, lname, fname, address, null, phonenumber, email, customerType);
			return customer;
			
		
	}

	/**
	 * Build SQL read query
	 * @param wClause Insert read SQL where clause query
	 * @return Full SQL read query
	 */
	private String buildQuery(String wClause) {
		// TODO Auto-generated method stub
		String query="SELECT * FROM Customer";
		
		if(wClause.length()>0)
		{
			query=query+" where " + wClause;
		}	
		return query;
	}
}
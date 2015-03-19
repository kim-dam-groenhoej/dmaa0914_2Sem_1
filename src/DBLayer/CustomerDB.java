package DBLayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ModelLayer.City;
import ModelLayer.Customer;
import ModelLayer.Enums.CustomerType;


public class CustomerDB {
	
	private Connection con;
	
	public CustomerDB()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public Customer findCustomer(String phonenumber)
	{
		String wClause = " phonenumber = '" + phonenumber +"'";
		return singleWhere(wClause);
	}

	public void createCustomer(String phonenumber)
	{
		
	}
	
	public void upDateCustomer(String phoneNumber, Customer customer)
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
		
		String sClause = " fname = '" + customer.getFname() + "', lname = '" + customer.getLname() + "', address = '" + customer.getAddress() + "', city = " + customer.getCity().getZipCode() + ", phonenumber = '" + customer.getPhonenumber() + "', email = '" + customer.getEmail() + "', customertype = " + customerType + " ";
		
		try {
			singleWhereUpdate(wClause, sClause);
		} catch (Exception ex) {
		
		}
	}
	
	public void delCustomer(int phonenumber)
	{
		
	}
	
	private void singleWhereUpdate(String wClause, String sClause) throws Exception
	{
		Statement stmt = con.createStatement();
		stmt.setQueryTimeout(5);
		String query = buildQueryUpdate(wClause, sClause);
		
		stmt.executeUpdate(query);
		
		stmt.close();
	}
	
	private String buildQueryUpdate(String wClause, String sClause)
	{
		String query = "UPDATE [Customer] SET ";

		if(sClause.length()>0)
		{
			query += sClause;
		}
		
		if(wClause.length()>0)
		{
			query += sClause;
		}
		
		return query;
	}
	
	/**
	 * @param wClause
	 * @return
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
	 * @param results
	 * @return
	 */
	private Customer buildCustomer(ResultSet results) throws Exception {
		Customer customer;
		
			
			int id = results.getInt("id");
			String lname = results.getString("lname");
			String fname = results.getString("fname");
			String address = results.getString("adress");
			//City city = results.getCity("city");
			String email = results.getString("email");
			String phonenumber = results.getString("phonenumber");
			int customertypeNo = results.getInt("customertype");
			CustomerType customerType = CustomerType.values()[customertypeNo -1];
			
			customer = new Customer(id, lname, fname, address, null, phonenumber, email, customerType);
			return customer;
			
		
	}

	/**
	 * @param wClause
	 * @return
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




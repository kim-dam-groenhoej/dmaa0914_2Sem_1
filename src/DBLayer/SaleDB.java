package DBLayer;

import java.sql.*;
import ModelLayer.Sale;
import ModelLayer.Customer;

public class SaleDB {
	private Connection con;
	
	public SaleDB()
	{
		this.con = DBConnection.getInstance().getDBcon();
	}
	
	public Customer simgleWhereFindCustomer(int id) throws SQLException
	{
		Customer customer = null;
		String sql = "SELECT * FROM [Customer] WHERE id = ?";
		try
		{
			ResultSet result;
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setQueryTimeout(5);
			stmt.setInt(1, 1);
			
			result = stmt.executeQuery();
			result.next();
			
			customer = new Customer(result.getInt("id"), "", "", "", null, "", "", null);
						
			stmt.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return customer;
	}

	public void saveSale(Sale sale)
	{
		
	}
}

package DBLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ModelLayer.Clothing;
import ModelLayer.Equipment;
import ModelLayer.GunReplica;
import ModelLayer.Product;

public class ProductDB {
	
	private Connection con;
	
	public ProductDB()
	{
		con = DBConnection.getInstance().getDBcon();
	}
	
	public Product findProduct(int productno)
	{
		String wClause = " id = " + productno;
		return singleWhere(wClause);
	}
	

	public int createProduct(Product product) throws Exception
	{
		int rc = -1;
		String query ="INSERT INTO Product(name,purchaseprice, salesprice,rentprice,minstock,amountinstock,supplierid,countryid) VALUES('"+
				product.getName() +"','" +
				product.getPurchasePrice() +"','" +
				product.getSalePrice() +"','" +
				product.getRentPrice() +"','" +
				product.getMinStock() +"','" +
				product.getAmountInStock() +"'," +
				1 +"," + 2 + ")";
				
                //"supplierid ='"+ product.getSupplier().getId() + "' " +
                //"countryid ='"+ product.getcountry().getId() + "' " +
                
		
		try{ // insert new employee +  dependent
	          Statement stmt = con.createStatement();
	          stmt.setQueryTimeout(5);
	     	  rc = stmt.executeUpdate(query);
	          stmt.close();
	      }//end try
	       catch(SQLException ex){
	    	   System.out.println(ex.getMessage());
	          System.out.println("Product ikke oprettet");
	          throw new Exception ("Product is not inserted correct");
	       }
	       return rc;
	}
	
	public int updateProduct(Product product)
	{
		int rc=-1;
		
		String query ="UPDATE Product SET "+
			 	  "name ='"+ product.getName() +"', "+
			 	  "purchaseprice ='"+ product.getPurchasePrice() + "', " +
                  "salesprice ='"+ product.getSalePrice() + "', " +
                  "rentprice ='"+ product.getRentPrice() + "', " +
                  "minstock ='"+ product.getMinStock() + "', " +
                  "amountinstock ='"+ product.getAmountInStock() + "', " +
                  //"supplierid ='"+ product.getSupplier().getId() + "' " +
                  //"countryid ='"+ product.getcountry().getId() + "' " +
                  "supplierid ='"+ 1 + "', " +
                  "countryid ='"+ 1 + "' " +                  
                  " WHERE id = '"+ product.getId() + "'";
		
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			rc = stmt.executeUpdate(query);
			stmt.close();
		}catch(Exception ex){
	 	 	System.out.println("Update exception in employee db: "+ex);
	  	}
		return rc;
	}
	
	public int deleteProduct(int productno)
	{
		int rc =-1;
		String query ="DELETE FROM Product WHERE id = '"+productno +"'";
		try{ // delete from employee
	 		Statement stmt = con.createStatement();
	 		stmt.setQueryTimeout(5);
	 	  	rc = stmt.executeUpdate(query);
	 	  	stmt.close();
  		}//slut try	
   	        catch(Exception ex){
   	        System.out.println(ex.getMessage());
	 	  	System.out.println("Delete exception in employee db: "+ex);
   	        }
		return(rc);
	}
	
	private Product singleWhere(String wClause) {
		ResultSet results;
		Product product = null;
		String query = buildQuery(wClause);
		
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			results = stmt.executeQuery(query);
			
			if(results.next()){
				product = buildProduct(results);
				stmt.close();
			}
			
		}catch(Exception e){
			
		}
		
		return product;
	}
	
	private boolean isClothing(ResultSet results) throws SQLException{
		return (results.getString("size") != null);
	}
	
	private boolean isEquipment(ResultSet results) throws SQLException{
		return (results.getString("type") != null);
	}

	private boolean isGunReplica(ResultSet results) throws SQLException{
		return (results.getString("calibre") != null);
	}
	
	private Product buildProduct(ResultSet results) throws Exception {
		
		Product product = null;
		int id = results.getInt("id");
		String name = results.getString("name");
		double purchasePrice = results.getDouble("purchaseprice");
		double salesPrice = results.getDouble("salesprice");
		double rentPrice = results.getDouble("rentprice");
		int minStock = results.getInt("minstock");
		int amountInStock = results.getInt("amountinstock");
		//TODO: get supplier
		//TODO: get country
		
		if(isClothing(results)){
			String size = results.getString("size");
			String color = results.getString("colour");
			product = new Clothing(id, name, purchasePrice, salesPrice, rentPrice, null, minStock, amountInStock, null, size, color);
		}else if(isEquipment(results)){
			String type = results.getString("type");
			String desc = results.getString("description");
			product = new Equipment(id, name, purchasePrice, salesPrice, rentPrice, null, minStock, amountInStock, null, type, desc);
		}else if(isGunReplica(results)){
			String material = results.getString("material");
			String calibre = results.getString("calibre");
			product = new GunReplica(id, name, purchasePrice, salesPrice, rentPrice, null, minStock, amountInStock, null, material, calibre);
		}
		
		return product;
	}

	private String buildQuery(String wClause) {
		String query="SELECT * FROM Product AS p LEFT JOIN Clothing AS c ON p.id = c.productid LEFT JOIN Equipment AS e ON p.id = e.productid LEFT JOIN GunReplicas AS g ON p.id = g.productid";
		
		if(wClause.length() > 0){
			query = query + " WHERE " + wClause;
		}
		
		return query;
	}
}

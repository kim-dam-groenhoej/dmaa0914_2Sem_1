package DBLayer;

import java.sql.*;
import java.util.ArrayList;

import ModelLayer.Invoice;
import ModelLayer.PartOrder;
import ModelLayer.Sale;
import ModelLayer.Customer;

public class SaleDB {
	private Connection con;
	
	public SaleDB()
	{
		this.con = DBConnection.getInstance().getDBcon();
	}

	public void saveSale(Sale sale)
	{
		Invoice invoice = new Invoice(sale.getTotal());
		int invoiceno = insertInvoice(invoice);
		sale.setInvoiceno(invoiceno);
		int saleOrderId = insertSaleOrder(sale);
		insertPartOrders(sale.getPartorders(), saleOrderId);
	}

	private void insertPartOrders(ArrayList<PartOrder> partorders,
			int saleOrderId) {
		String query = "";
		for(PartOrder partOrder : partorders)
		{
			query += buildPartOrderInsert(partOrder, saleOrderId);
		}
		
		try{ // insert new employee +  dependent
	          Statement stmt = con.createStatement();
	          stmt.setQueryTimeout(5);
	     	  stmt.executeUpdate(query);
	          stmt.close();
	      }//end try
	       catch(SQLException ex){
	    	   System.out.println(ex.getMessage());
	          System.out.println("Product ikke oprettet");
	       }
		
	}
	
	

	private String buildPartOrderInsert(PartOrder partOrder, int saleOrderId) {
		String sql = "INSERT INTO PartOrder(saleorderid, productid, amount) VALUES("+saleOrderId+","+partOrder.getProduct().getId()+","+partOrder.getAmount()+")";
		return sql;
	}

	private int insertSaleOrder(Sale sale) {
		int id = 0;
		String query ="INSERT INTO SaleOrder(date, deliverystatus, deliverydate, customerid, invoiceno) VALUES(?,?,?,?,?)";
		
		try{ // insert new employee +  dependent
	          PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	          
	          stmt.setObject(1, new java.sql.Date(sale.getDate().getTime()));
	          stmt.setInt(2, sale.getDeliverystatus().ordinal());
	          stmt.setObject(3, new java.sql.Date(sale.getDeliveryDate().getTime()));
	          stmt.setInt(4, sale.getCustomer().getId());
	          stmt.setInt(5, sale.getInvoiceno());
	          
	          stmt.setQueryTimeout(5);
	     	  stmt.executeUpdate();
	     	  ResultSet result = stmt.getGeneratedKeys();
	     	  if(result.next()){
	     		  id = result.getInt(1);
	     	  }
	          stmt.close();
	      }//end try
	       catch(SQLException ex){
	    	   System.out.println(ex.getMessage());
	       }
		return id;
	}

	private int insertInvoice(Invoice invoice)
	{
		int id = 0;
		System.out.println(invoice.getPaymentDate().toString());
		String query ="INSERT INTO Invoice(paymentdate, total) VALUES(?,?)";
		
		try{ // insert new employee +  dependent
	          PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	          stmt.setObject(1, new java.sql.Date(invoice.getPaymentDate().getTime()));
	          stmt.setDouble(2, invoice.getTotal());
	          stmt.setQueryTimeout(5);
	     	  stmt.executeUpdate();
	     	  ResultSet result = stmt.getGeneratedKeys();
	     	  if(result.next()){
	     		  id = result.getInt(1);
	     	  }
	          stmt.close();
	      }//end try
	       catch(SQLException ex){
	    	   System.out.println(ex.getMessage());
	    	   ex.printStackTrace();
	       }
		return id;
	}
}

package ModelLayer;

import java.sql.Date;
import java.util.ArrayList;

import ModelLayer.Enums.DeliveryStatus;

public class Sale {
	private int id;
	private Date date;
	private DeliveryStatus deliverystatus;
	private Customer customer;
	private int invoiceno;
	private ArrayList<PartOrder> partorders;
	
	public Sale(int id, Date date,DeliveryStatus deliverystatus, Customer customer, int invoiceno )
	{
		this.id = id;
		this.date = date;
		this.deliverystatus = deliverystatus;
		this.customer = customer;
		this.invoiceno = invoiceno;
		partorders = new ArrayList<PartOrder>();
	}
/**
 *  Gets the id
 * @return id
 */
	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/
	
	/**
	 * Gets the date 
	 * @return date
	 */

	public Date getDate() {
		return date;
	}

	
	/**
	 * Sets the date 
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the Deliverystatus 
	 * @return Deliverystatus
	 */
	public DeliveryStatus getDeliverystatus() {
		return deliverystatus;
	}

	/**
	 * Sets the Deliverystatus 
	 */
	public void setDeliverystatus(DeliveryStatus deliverystatus) {
		this.deliverystatus = deliverystatus;
	}

	/**
	 * Gets the Customer
	 * @return Customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * sets the Customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Gets the invoiceno
	 * @return invoiceno
	 */
	public int getInvoiceno() {
		return invoiceno;
	}

	/**
	 * sets the invoiceno
	 */
	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<PartOrder> getPartorders() {
		return partorders;
	}

	/**
	 * adds a partorder to the arraylist
	 */
	public void addPartorders(PartOrder partorder) {
		partorders.add(partorder);
	}	
	
}

package ModelLayer;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

import ModelLayer.Enums.DeliveryStatus;

public class Sale {
	private int id;
	private Date deliveryDate;
	private DeliveryStatus deliverystatus;
	private Customer customer;
	private int invoiceno;
	private ArrayList<PartOrder> partorders;
	
	public Sale(int id, Date date,DeliveryStatus deliverystatus, Customer customer, int invoiceno )
	{
		this.id = id;
		this.deliveryDate = date;
		this.deliverystatus = deliverystatus;
		this.customer = customer;
		this.invoiceno = invoiceno;
		partorders = new ArrayList<PartOrder>();
	}
	
	public Sale()
	{
		this.deliverystatus = DeliveryStatus.NOTDELIVERED;
		this.partorders = new ArrayList<PartOrder>();
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

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	
	/**
	 * Sets the date 
	 */
	public void setDeliveryDate(Date date) {
		this.deliveryDate = date;
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

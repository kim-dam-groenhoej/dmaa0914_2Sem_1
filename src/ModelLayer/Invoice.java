package ModelLayer;

import java.util.Date;

/**
 * This Class represent the employee
 * @author frankeskelund
 *
 */
public class Invoice {
	
	private int invoiceNo;
	private Date paymentDate;
	private double total;

	public Invoice (int invoiceNo, Date paymentDate, double total)
	{
		this.invoiceNo = invoiceNo;
		this.paymentDate = paymentDate;
		this.total = total;
	}

	/**
	 * @return the invoiceNo
	 */
	public int getInvoiceNo() {
		return invoiceNo;
	}

	/**
	 * @param invoiceNo the invoiceNo to set
	 */
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
}

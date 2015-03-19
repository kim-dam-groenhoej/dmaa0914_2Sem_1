/**
 * 
 */
package UnitTest;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import DBLayer.SaleDB;
import ModelLayer.Customer;

/**
 * @author Kim Dam Grønhøj
 *
 */
public class JunitSale {

	@Test
	public void test() throws Exception {
		SaleDB s = new SaleDB();
		Customer c = s.simgleWhereFindCustomer(1);
		
		System.out.println("customer ID " + c.getId());
		assertEquals("customer ID", c.getId());
	}

}

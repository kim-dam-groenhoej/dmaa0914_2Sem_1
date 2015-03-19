/**
 * 
 */
package UnitTest;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import ControllerLayer.SaleCtr;
import DBLayer.SaleDB;
import ModelLayer.Customer;

/**
 * @author Kim Dam Grønhøj
 *
 */
public class JunitSale {

	@Test
	public void test(){
		SaleCtr saleCtr = new SaleCtr();
		saleCtr.createSale();
		saleCtr.enterProduct(1, 2);
		saleCtr.findCustomer("98909829");
		saleCtr.setDeliveryDate(new Date());
		saleCtr.finishSale();
	}

}

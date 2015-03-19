/**
 * 
 */
package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ControllerLayer.CustomerCtr;
import ModelLayer.Customer;

/**
 * @author Kim Dam Gr�nh�j
 *
 */
public class JunitCustomer {


@Test 
public void canFindCustomer(){
		CustomerCtr customerCtr = new CustomerCtr();
		Customer customer = customerCtr.findCustomer("98909829");
		assertNotNull(customer);
}

}

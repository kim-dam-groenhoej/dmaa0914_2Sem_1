/**
 * 
 */
package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ControllerLayer.CustomerCtr;
import ModelLayer.City;
import ModelLayer.Customer;
import ModelLayer.Enums.CustomerType;

/**
 * @author Kim Dam Gr�nh�j
 * 
 */
public class JunitCustomer {
	@Test 
	public void canFindCustomer(){
//			CustomerCtr customerCtr = new CustomerCtr();
//			Customer customer = customerCtr.findCustomer("98909829");
//			assertNotNull(customer);
	}
	
	@Test
	public void customerCreate() {
//		CustomerCtr customerCtr = new CustomerCtr();
//		
//		try {
//			customerCtr.createCustomer(new Customer(-1, "jensesbix", "jensen", "frankevej 68", new City(9000, "Aalborg"), "98909830", "jensen@frujensen.dk", CustomerType.CLUB));
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//			fail("fejl");
//		}
	}
	
	@Test
	public void customerDelete(){
//		CustomerCtr customerCtr = new CustomerCtr();
//		
//		try {
//			customerCtr.delCustomer("98909830");
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//			fail("fejl");
//		}
	}
	
	@Test
	public void customerUpdate(){
//		CustomerCtr customerCtr = new CustomerCtr();
//		Customer customer = new Customer(1, "franksbix", "frank", "frankevej 68", new City(9000, "Aalborg"), "98909829", "frank@frank.frank", CustomerType.PRIVATE);
//		try{
//			customerCtr.upDateCustomer("98909829", customer);
//		}
//		catch(Exception ex){
//			System.out.println(ex.getMessage());
//			fail("fejl");
//		}
	}
}

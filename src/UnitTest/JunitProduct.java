/**
 * 
 */
package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ControllerLayer.ProductCtr;
import ModelLayer.Product;

/**
 * @author Kim Dam Grønhøj
 *
 */
public class JunitProduct {
	
	@Test
	public void canFindProduct(){
		ProductCtr ctr = new ProductCtr();
		Product p = ctr.findProduct(1);
		System.out.println(p.getName());
		assertNotNull(p);
	}

}

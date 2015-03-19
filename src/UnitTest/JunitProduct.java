/**
 * 
 */
package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ControllerLayer.ProductCtr;
import ModelLayer.Country;
import ModelLayer.Equipment;
import ModelLayer.Product;
import ModelLayer.Supplier;

/**
 * @author Kim Dam Grønhøj
 *
 */
public class JunitProduct {
	
	/*@Test
	public void canFindProduct(){
		ProductCtr ctr = new ProductCtr();
		Product p = ctr.findProduct(1);
		System.out.println(p.getName());
		assertNotNull(p);
	}*/
	
	
	/*@Test
	public void canUpdateProduct(){
		Product p1 = new Equipment(1,"cowboyhat",150.00,800.00,0.00,null,4,5,null,"hat","hest");
		ProductCtr ctr = new ProductCtr();		
		int p = ctr.updateProduct(p1);
		System.out.println(p);
		assertEquals(1, p); 
	}*/
	
	/*@Test
	public void canInsertProduct(){
		Product p1 = new Equipment("cowboyBoots",250.00,500.00,0.00,null,4,5,null,"hat","hest");
		ProductCtr ctr = new ProductCtr();		
		int p = ctr.createProduct(p1);
		System.out.println(p);
		assertEquals(1, p); 
	}*/
	
	
	@Test
	public void canDeleteProduct(){
		ProductCtr ctr = new ProductCtr();		
		int p = ctr.deleteProduct(2);
		System.out.println(p);
		assertEquals(1, p); 
	}

}

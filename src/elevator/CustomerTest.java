/**
 * 
 */
package elevator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Gary Murphy (gmurph05)
 *
 */
public class CustomerTest {

	Elevator e = new Elevator();
	Customer a = new Customer();
	int expected;
	
	@Test
	public void testCustomer() {
		
		expected = 1;
		int actual = Customer.getCustomerID();
		assertEquals("Wrong answer", 1, actual );			
	}

}

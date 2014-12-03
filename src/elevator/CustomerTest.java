/**
 * 
 */
package elevator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

/**
 * @author Gary Murphy + Radu Asavei
 *
 */
public class CustomerTest {

	Elevator e = new Elevator(10);
	Customer a = new Customer();
	
	@Test
	public void getCustomerIDTest() {
		int expected = 4;
		int actual = a.getCustomerID();
		assertEquals("Wrong answer", expected, actual );			
	}
	
	@Test
	public void setCustomerIDTest() {
		int expected = 2;
		int actual = Customer.setCustomerID(2);
		assertEquals("Wrong answer", expected, actual );			
	}
	
	@Test
	public void startFloorTest(){
		Random expected = null;
		Random actual = null; 
		/*Customer.getStartFloor();*/
		assertEquals("Wrong start floor", expected, actual );
	}
	
	@Test
	public void setDestinationFloorTest(){
		Random expected = null;
		Random random = null;
		Random actual = Customer.setDestinationFloor(random);
		assertEquals("Wrong destination floor", expected, actual );
		
	}

}

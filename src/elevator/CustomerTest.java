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
		int expected = 1;
		int actual = a.getCustomerID();
		assertEquals("Wrong answer", expected, actual );			
	}
	
	@Test
	public void setCustomerIDTest() {
		int expected = 2;
		int actual = Customer.setCustomerID();
		assertEquals("Wrong answer", expected, actual );			
	}
	
	@Test
	public void startFloorTest(){
		int expected = 10;
		int actual = a.setStartFloor(e.getNUM_OF_FLOORS()); 
		/*Customer.getStartFloor();*/
		assertEquals("Wrong start floor", expected, actual);
	}
	
	@Test
	public void setDestinationFloorTest(){
		int expected = 10;
		//Random random = null;
		int actual = a.setDestinationFloor(e.getNUM_OF_FLOORS());
		System.out.printf("Destination floor is: " + actual);
		assertEquals("Wrong destination floor", expected, actual);
		
		
	}

}

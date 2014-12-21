/*
 * @author Gary Murphy + Radu Asavei
 *
 * 
 */
package elevator;
import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class CustomerTest {

	Elevator e = new Elevator(10);
	Customer a = new Customer(13);
	
	@Test
	public void setCustomerIDTest() {
		//int actual = a.resetID();
		int expected = 2;
		int actual = a.setCustomerID();
		assertEquals("Wrong answer", expected, actual );			
	}
	
	@Test
	//TODO the customerID variable is supposed to increment, but it is not doing that...
	public void getCustomerIDTest() {
		int expected = 2;
		int actual = a.getCustomerID();
		//int actual = a.resetID();
		assertEquals("Wrong answer", expected, actual );			
	}
	
	@Test
	public void startFloorTest(){
		/* Can't test for Random numbers, 
		 * but checks errors to confirm that startFloor changes i.e. is random
		 * and checks that startFloor does not exceed the int in Customer(int i)
		 */
		int expected = 7;
		int actual = a.setStartFloor(e.getNUM_OF_FLOORS()); 
		/*Customer.getStartFloor();*/
		assertEquals("Wrong start floor", expected, actual);
	} // end of startFloorTest() test method
	
	@Test
	public void setDestinationFloorTest(){
		/* Can't test for Random numbers, 
		 * but checks errors to confirm that startFloor changes i.e. is random
		 * and checks that startFloor does not exceed the int in Customer(int i)
		 */
		int expected = 7;
		int actual = a.setDestinationFloor(e.getNUM_OF_FLOORS());
		assertEquals("Wrong destination floor", expected, actual);	
	} // end of setDestinationFloorTest() test method
}

/**
 * 
 */
package elevator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Gary Murphy + Radu Asavei
 *
 */
public class ElevatorTest {

	@Test
	public void getCurrentFloorTest() {
		Elevator e = new Elevator(10);
		int expected = 1;
		int actual = e.getCurrentFloor();
		assertEquals("Wrong answer: ", expected, actual);
	}
	
	@Test
	public void setCurrentFloorTest(){
		Elevator e = new Elevator(10);
		int expected = 2;
		int actual = e.setCurrentFloor(2);
		assertEquals("Wrong answer: ", expected, actual);
	}
 
}

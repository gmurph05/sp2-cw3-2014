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

	private int currentFloor;
	private int destinationFloor;

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
	
	@Test
	public void moveTest(){
		Elevator e = new Elevator(16);
		int expected = 14;
		int actual = e.move(13,true);
		assertEquals("Wrong answer: ", expected, actual);
	}
	
	@Test
	public void getTopFloorTest() {
		Elevator e = new Elevator(16);
		int expected = 17;
		int actual = e.getTopFloor();
		assertEquals("Wrong answer: ", expected, actual);
	}
 
}

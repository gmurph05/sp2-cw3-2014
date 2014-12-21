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
	Elevator e = new Elevator(20);

	@Test
	public void getCurrentFloorTest() {
		int expected = 1;
		int actual = e.getCurrentFloor();
		assertEquals("Wrong answer: ", expected, actual);
	}
	
	@Test
	public void setCurrentFloorTest(){
		int expected = 2;
		int actual = e.setCurrentFloor(2);
		assertEquals("Wrong answer: ", expected, actual);
	}
	
	@Test
	public void moveTest(){
		int expected = 14;
		int actual = e.move(13,true);
		assertEquals("Wrong answer: ", expected, actual);
	}
	
	@Test
	public void getTopFloorTest() {
		int expected = 21;
		int actual = e.getTopFloor();
		assertEquals("Wrong answer: ", expected, actual);
	}
	
	@Test
	public void setDestinationFloorTest() {
		int expected = 17;
		int actual = e.se();
		assertEquals("Wrong answer: ", expected, actual);
	}
 
}

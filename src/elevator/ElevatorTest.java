/**
 * @author Radu Asavei + Gary Murphy
 *
 */
package elevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElevatorTest {
	
	private int currentFloor;
	private int destinationFloor;
	Elevator e = new Elevator(20);

	@Test
	public void moveTest(){
		int expected = 14;
		int actual = e.move(7);
		assertEquals("Wrong answer: ", expected, actual);
	}

}

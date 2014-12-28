/**
 * @author Radu Asavei + Gary Murphy
 *
 */
package elevator;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ElevatorTest {
	
	//private int currentFloor;
	//private int destinationFloor;
	Elevator e = new Elevator(20);

	/*
	 * @Test in progress - move method incomplete
	 * 	
	 */
	@Test
	public void moveTest(){
		int expected = 1;
		int actual = e.move(1);
		assertEquals("Wrong answer: ", expected, actual);
	}
	
}

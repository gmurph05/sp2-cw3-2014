/**
 * 
 */
package elevator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Gary Murphy
 *
 */
public class BuildingTest {

	Elevator elev = new Elevator(13);
	int[] customerList = new int[3];
	Building bldg = new Building(elev, 13, customerList);
	
	
	@Test
	public void numOfFloorsTest() {
		Building bldg = new Building(elev, 13, customerList);
		int expected = 13;
		int actual = bldg.getNumOfFloors();
		assertEquals("Wrong answer: ", expected, actual);
	}

}

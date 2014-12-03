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

	//Building(Elevator elev, int numOfFloors, int[] customerList)
	
	Elevator elev = new Elevator(13);
	int[] customerList = new int[3];
	Building bldg = new Building(elev, 13, customerList);
	
	
	@Test
	public void numOfFloorsTest() {
		int expected = 13;
		int actual = Building.getNumOfFloors();
		assertEquals("Wrong answer: ", expected, actual);
	}

}

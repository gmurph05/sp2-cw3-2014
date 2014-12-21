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
public class BuildingTest {

	Elevator elev = new Elevator(13);
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	Building bldg = new Building(elev, 13, 5);
	
	
	@Test
	public void numOfFloorsTest() {
		Building bldg = new Building(elev, 13);
		int expected = 13;
		int actual = bldg.getNumOfFloors();
		assertEquals("Wrong answer: ", expected, actual);
	}

}

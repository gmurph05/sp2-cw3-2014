/**
 * 
 */
package elevator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gary Murphy
 *
 */
public class Building {

	private static int numOfFloors = 2; // default number of floors in building
	//Elevator elev = new Elevator(10);
	private int NUM_OF_CUSTOMERS = 3;
	//private int[] customerList;
	
	// building constructor
	public Building(Elevator elev, int numOfFloors, int[] customerList) {
		this.setNumOfFloors(numOfFloors);
		//this.customerList = customerList;
		//this.elev = elev;
	}

	/**
	 * @return the numOfFloors
	 */
	public static int getNumOfFloors() {
		return numOfFloors;
	}

	/**
	 * @param numOfFloors the numOfFloors to set
	 */
	public void setNumOfFloors(int numOfFloors) {
		Building.numOfFloors = numOfFloors;
	}

}

/**
 * 
 */
package elevator;
import java.util.Random;

/**
 * @author Gary Murphy (gmurph05)
 *
 */
public class Customer {
	
	private static Random startFloor = new Random();
	private static Random destinationFloor = new Random();
	private static int customerID = 1;
	
	// Start of customer constructor
	public Customer() {
		Customer.customerID = getCustomerID();
		customerID++;
		
	} //end of customer constructor
	
	public int getCustomerID(){
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public static int setCustomerID(int customerID) {
		Customer.customerID = customerID;
		return Customer.customerID;
	}

	/**
	 * @return the startFloor
	 */
	public static Random getStartFloor() {
		return startFloor;
	}

	/**
	 * @param startFloor the startFloor to set
	 */
	public static void setStartFloor(Random startFloor) {
		Customer.startFloor = startFloor;
	}

	/**
	 * @return the destinationFloor
	 */
	public static Random getDestinationFloor() {
		return destinationFloor;
	}

	/**
	 * @param destinationFloor the destinationFloor to set
	 * @return 
	 */
	public static Random setDestinationFloor(Random destinationFloor) {
		Customer.destinationFloor = destinationFloor;
		return Customer.destinationFloor;
	}
	
	

}

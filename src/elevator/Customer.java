/**
 * 
 */
package elevator;
import java.util.Random;

/**
 * @author Gary Murphy + Radu Asavei
 *
 */
public class Customer {
	
	private Random startFloor = new Random();
	private Random destinationFloor = new Random();
	public static int customerID = 0;
	private boolean finished = false;
	
	// Start of customer constructor
	public Customer(int numOfFloors) {
		this.setCustomerID();
		this.setStartFloor(numOfFloors);
		this.setDestinationFloor(numOfFloors);
		customerID++;	
	} //end of customer constructor
	
	public int getCustomerID(){
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public int setCustomerID() {
		return customerID;
	}

	/**
	 * @return the startFloor
	 */
	public Random getStartFloor() {
		return startFloor;
	}

	/**
	 * @param i 
	 */
	public int setStartFloor(int i) {
		return startFloor.nextInt(i);
	}

	/**
	 * @return the destinationFloor
	 */
	public Random getDestinationFloor() {
		return destinationFloor;
	}

	/**
	 * @param destinationFloor the destinationFloor to set
	 * @return 
	 */
	public int setDestinationFloor(int i) {
		return destinationFloor.nextInt(i);
	}

	/**
	 * @return the finished
	 */
	public boolean isFinished() {
		return finished;
	}

	/**
	 * @param finished the finished to set
	 */
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	public int resetID(){
		return customerID = 0;
	}
	
	

}

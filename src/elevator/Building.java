/**
 * 
 */
package elevator;

/**
 * @author Gary Murphy
 *
 */
public class Building {

	/**
	 * @param args
	 */
	
	private static final int numOfFloors = 2; // default number of floors in building
	private int customerList = 0;
	
	Elevator elev = new Elevator();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the numOfFloors
	 */
	public int getNumOfFloors() {
		return numOfFloors;
	}

	/**
	 * @param numOfFloors the numOfFloors to set
	 */
	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}

	/**
	 * @return the customerList
	 */
	public int getCustomerList() {
		return customerList;
	}

	/**
	 * @param customerList the customerList to set
	 */
	public void setCustomerList(int customerList) {
		this.customerList = customerList;
	}

}

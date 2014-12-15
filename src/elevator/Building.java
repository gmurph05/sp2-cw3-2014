/**
 * 
 */
package elevator;
//import java.util.ArrayList;

/**
 * @author Gary Murphy
 *
 */
public class Building {

	private static int numOfFloors = 2; // default number of floors in building
	private Elevator elev;
	private ArrayList<Customer> customerList= new ArrayList<Customer>();
	
	// building constructor
	public Building(Elevator elev, int numOfFloors, ArrayList<Customer> customerList) {
		this.setNumOfFloors(numOfFloors);
		this.setCustomerList(customerList);
		this.setElev(elev);
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
		Building.numOfFloors = numOfFloors;
	}

	/**
	 * @return the customerList
	 */
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	/**
	 * @param customerList the customerList to set
	 */
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	
	/**
	 * @return the elev
	 */
	public Elevator getElev() {
		return elev;
	}

	/**
	 * @param elev the elev to set
	 */
	public void setElev(Elevator elev) {
		this.elev = elev;
	}

}

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
	
	Random startFloor = new Random();
	Random destinationFloor = new Random();
	private static int customerID = 1;
	
	// Start of customer constructor
	public Customer() {
		Customer.customerID = getCustomerID();
		customerID++;
		
	} //end of customer constructor
	
	public static int getCustomerID(){
		return customerID;
	}

}

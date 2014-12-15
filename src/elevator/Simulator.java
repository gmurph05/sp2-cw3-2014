/**
 * 
 */
package elevator;
/**
 * @author Gary Murphy + Radu Asavei
 *
 */
import java.util.Scanner;

public class Simulator {

	/**
	 * @param args
	 */
	int numOfFloorsVisited = 0;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of floors for the building: ");
		int numOfFloors = input.nextInt();
		Elevator elev = new Elevator(numOfFloors);
		System.out.println("Enter the number of customers: ");
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		input.close();
		Building bldg = new Building(elev, numOfFloors, customerList);
				
		System.out.println("The number of floors in the building is: " + bldg.getNumOfFloors());
		System.out.println("The number of customers in the building is: ");
		System.out.println("The number of floors the elevator can access is: " + elev.getNUM_OF_FLOORS());
		
		outputInfo(customerList.hashCode());
	}

	private static void outputInfo(int numOfCustomers) {
		// ...
		for(int i = 1; i <= numOfCustomers; i++){
			System.out.println("Customer " + i + "\'s start floor is ");
		}
		
	}// end of outputInfo method
	
	
}

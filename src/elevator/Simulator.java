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
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of floors for the building: ");
		int numOfFloors = input.nextInt();
		Elevator elev = new Elevator(numOfFloors);
		System.out.println("Enter the number of customers: ");
		int[] customerList = new int[input.nextInt()];
		input.close();
		Building bldg = new Building(elev, numOfFloors, customerList);
				
		System.out.println("The number of floors in the building is: " + bldg.getNumOfFloors());
		System.out.println("The number of customers in the building is: " + customerList.length);
		System.out.println("The number of floors in the elevator is: " + elev.getNUM_OF_FLOORS());
		

	}

}

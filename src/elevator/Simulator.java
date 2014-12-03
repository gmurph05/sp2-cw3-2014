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
		Elevator elev = new Elevator(input.nextInt());
		int numOfFloors = input.nextInt();
				
		System.out.println("Enter the number of customers: ");
		int[] customerList = new int[input.nextInt()];
		input.close();
		Building bldg = new Building(elev, numOfFloors, customerList);
				
		System.out.println("The number of floors in the building is: " + bldg.getNumOfFloors());
		System.out.println("The number of customers in the building is: " + customerList.length);
		

	}

}

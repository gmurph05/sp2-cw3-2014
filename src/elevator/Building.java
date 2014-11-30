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
	private static int[] customerList;
	Elevator elev = new Elevator();
	
	// building constructor
	public Building(Elevator elev, int numOfFloors, int[] customerList) {
		this.numOfFloors = numOfFloors;
		this.customerList = customerList;
		this.elev = elev;
	}

	//start of main method
	public static void main(String[] args) {
		// Prompt user for input to create building
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of floors in the building: ");
		numOfFloors = in.nextInt();
		System.out.println("Please enter the number of customers: ");
		customerList = new int[in.nextInt()];		
		in.close();
		
	}//end of main method

}

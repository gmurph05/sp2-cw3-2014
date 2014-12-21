/**
 * 
 */
package elevator;
/*
 *  @author Gary Murphy + Radu Asavei
 */
import java.util.ArrayList;

import java.util.Arrays;
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
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		System.out.println("Enter the number of customers: ");
		for(int i = 0; i < input.nextInt(); i++){
			customerList.add(new Customer(numOfFloors));
		}
		input.close();
		Building bldg = new Building(elev, numOfFloors);
				
		System.out.println("The number of floors in the building is: " + bldg.getNumOfFloors());
		System.out.println("The number of customers in the building is: " + customerList.size());
		System.out.println("The number of floors the elevator can access is: " + elev.getNUM_OF_FLOORS());
		
		for(int i = 0; i < customerList.size(); i++){
			System.out.print("Customer ID = " + customerList.get(i).getCustomerID());
			System.out.print("Start floor = " + (customerList.get(i).getStartFloor()));
			System.out.printf("Destination floor = " + customerList.get(i).getDestinationFloor());
			System.out.println(" ");
		}
		
	}

}

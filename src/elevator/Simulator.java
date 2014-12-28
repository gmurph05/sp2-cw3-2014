package elevator;

/**
 * @author Radu Asavei + Gary Murphy
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Simulator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of floors for the building: ");
		int numOfFloors = input.nextInt();
		Building building1  = new Building(numOfFloors);
		//System.out.println("Your building has: "+ numOfFloors+" floors." );

		System.out.println("Enter the number of customers for the elevator: ");
		int numOfCustomers = input.nextInt();
		input.close();
		
		//Start simulation
		System.out.print("The simulation will run for "+ numOfCustomers+ " customers, ");
		initiateSimulation(building1);
		createCustomers(building1,numOfCustomers);
		int defaultRuns = runDefaultStrategy(building1);
		int ourRuns = runOurStrategy(building1);
		
		//check runs and show result
		if (defaultRuns == ourRuns){
			System.out.println ("Both strategies have the same efficiency");
		} else if (defaultRuns<ourRuns){
					System.out.println ("The default strategy is more efficient");
				} else {
					System.out.println ("Our strategy is more efficient");
				}
	}

	private static int runOurStrategy(Building building1) {
		// TODO Auto-generated method stub
		int result = 0;
		return result;
	}

	private static int runDefaultStrategy(Building building1) {
		// TODO Auto-generated method stub
		int result = 0;
		return result;
	}

	private static void createCustomers(Building building1, int numOfCustomers) {
		// TODO Auto-generated method stub
		
	}

	static void initiateSimulation(Building bld){
		//System.out.print("The simulation will run for "+ bld.elevator1.numOfCustomers+ " customers, ");
		if (bld.getNumOfFloors()>12){
			int topFloor = bld.getNumOfFloors()+1;
			System.out.print("in an American building with "+ bld.getNumOfFloors() + " floors, from 1 to "+ topFloor +" (floor 13 is skipped)." );
		} else {
			System.out.print("in a building with "+ bld.getNumOfFloors() + " floors, starting from 1 to "+ bld.getNumOfFloors());
		}
		System.out.println();
		Elevator.getCurrentFloor();
		Elevator.getDirection();
	}
}

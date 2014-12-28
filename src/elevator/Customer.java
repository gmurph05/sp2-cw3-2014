package elevator;

/**
 * @author Radu Asavei + Gary Murphy
 *
 */

public class Customer {
	
	//public static final int numOfFloors = null;

	// customer constructor
	public Customer(int ID, Building bld){
		int startFloor = Elevator.setRandomFloor(bld.getNumOfFloors());
		int destinationFloor = Elevator.setRandomFloor(bld.getNumOfFloors());
		@SuppressWarnings("unused")
		boolean inElevator = false;
		//System.out.println("Random customer "+ID+"starts on floor "+startFloor+" and goes to floor "+destinationFloor);
	}

}

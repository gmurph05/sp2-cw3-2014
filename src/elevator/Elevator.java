package elevator;

//import java.util.ArrayList;

public class Elevator {

	
	private int NUM_OF_FLOORS; //The number of floors the elevator can access.
	
	//private ArrayList<Integer> registerList = new ArrayList<Integer>(); //The list of customers in the elevator
	private static int currentFloor = 1;
	
	//start of constructor
	public Elevator(int NUM_OF_FLOORS) {
		// TODO Auto-generated constructor stub
		this.NUM_OF_FLOORS = NUM_OF_FLOORS;
	} // end of constructor

	/**
	 * @return the currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	} // end of current floor getter method

	/**
	 * @param currentFloor - the currentFloor to set
	 * @return 
	 */
	public int setCurrentFloor(int currentFloor) {
		Elevator.currentFloor = currentFloor;
		return Elevator.currentFloor;
	} // end of current floor setter method
	
	/**
	 * @return the nUM_OF_FLOORS
	 */
	public int getNUM_OF_FLOORS() {
		return NUM_OF_FLOORS;
	}

	/**
	 * @param nUM_OF_FLOORS the nUM_OF_FLOORS to set
	 */
	public void setNUM_OF_FLOORS(int nUM_OF_FLOORS) {
		NUM_OF_FLOORS = nUM_OF_FLOORS;
	}


}

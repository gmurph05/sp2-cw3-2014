package elevator;

//import java.util.ArrayList;

public class Elevator {

	
	private int NUM_OF_FLOORS; //The number of floors the elevator can access.
	private ArrayList<Integer> customerJoins = new ArrayList<Integer>(); //A customer goes into the elevator
	private ArrayList<Integer> customerLeaves = new ArrayList<Integer>(); //A customer goes out of the elevator
	private static int currentFloor = 1;
	
	//start of constructor
	public Elevator(int NUM_OF_FLOORS) {
		// set number of floors in instance of elevator
		this.NUM_OF_FLOORS = NUM_OF_FLOORS;
		this.setCustomerJoins(getCustomerJoins());
		this.setCustomerLeaves(getCustomerLeaves());
	} // end of constructor
	
	public int move(int start, int finish) {	
		if(currentFloor == 1){
			currentFloor++;
		}
		for(int i = 0; i < ){
			if(currentFloor > start){
		}
			currentFloor--;
		}
		if(currentFloor < start){
			currentFloor++;
		}
		return currentFloor;
	}

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

	/**
	 * @return the customerJoins
	 */
	public ArrayList<Integer> getCustomerJoins() {
		return customerJoins;
	}

	/**
	 * @param customerJoins the customerJoins to set
	 */
	public void setCustomerJoins(ArrayList<Integer> customerJoins) {
		this.customerJoins = customerJoins;
	}

	/**
	 * @return the customerLeaves
	 */
	public ArrayList<Integer> getCustomerLeaves() {
		return customerLeaves;
	}

	/**
	 * @param customerLeaves the customerLeaves to set
	 */
	public void setCustomerLeaves(ArrayList<Integer> customerLeaves) {
		this.customerLeaves = customerLeaves;
	}




}

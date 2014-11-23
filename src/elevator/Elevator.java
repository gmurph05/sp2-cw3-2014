package elevator;

import java.util.ArrayList;

public class Elevator {

	
	private int NUM_OF_FLOORS = 2; //The number of floors the elevator can access.
	private ArrayList registerList; //The list of customers in the elevator
	private static int currentFloor = 1;
	
	public Elevator() {
		// TODO Auto-generated constructor stub
		this.NUM_OF_FLOORS = NUM_OF_FLOORS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the currentFloor
	 */
	public static int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * @param currentFloor the currentFloor to set
	 */
	public static void setCurrentFloor(int currentFloor) {
		Elevator.currentFloor = currentFloor;
	}

}

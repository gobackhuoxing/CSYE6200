/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
package edu.neu.csye6200.registry;

public class VehicleTest {
	//create two object v1 and v2
	
	//use print method
	public void run(){
		Vehicle.v1.printData();
		Vehicle.v2.printData();
		TruckVehicle.t1.printData();
		TruckVehicle.t2.printData();
		TruckVehicle.t3.printData();
	}
	
	
	//call the run() in main
	public static void main(String[] args) {
		VehicleTest vehicleExample = new VehicleTest();
		vehicleExample.run();
		
	}
}

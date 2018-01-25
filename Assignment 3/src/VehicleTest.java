/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
public class VehicleTest {
	//create two object v1 and v2
	
	//use print method
	public void run(){
		VehicleRegistry.v1.printData();
		VehicleRegistry.v2.printData();
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

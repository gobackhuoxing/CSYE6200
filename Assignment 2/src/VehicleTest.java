/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
public class VehicleTest {
	//create two object v1 and v2
	static Vehicle v1 = new Vehicle("BMW", "XIAOCASE", "M5", 2016, 5, 80 , 8.5);
	static Vehicle v2 = new Vehicle("Dodge", "DanDan", "Viper", 2016, 2, 60 , 9);
	
	//use print method
	public void run(){
		v1.printData();
		v2.printData();
	}
	
	
	//call the run() in main
	public static void main(String[] args) {
		VehicleTest vehicleExample = new VehicleTest();
		vehicleExample.run();
	}
}

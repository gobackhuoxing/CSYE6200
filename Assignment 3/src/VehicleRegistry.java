
/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

	private static ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
	private static HashMap<String, Vehicle> vMap = new HashMap<String, Vehicle>();
	
	static Vehicle v1 = new Vehicle("BMW", "XIAOCASE", "M5", 2016, 5, 80 , 8.5);
	static Vehicle v2 = new Vehicle("Dodge", "DanDan", "Viper", 2016, 2, 60 , 9);
	
	// method to save vehicle data in ArrayList vList and HashMap vMap
	public void run1() {
		vList.add(v1);// ArrayList
		vList.add(v2);

		displayVehicle();// HashMap
		vMap.put(v1.getLicenseKey(),v1);
		vMap.put(v2.getLicenseKey(),v2);

	}

	
	
	// method to retrieve data from vMap by license plate
	public static void retrieveData(String licensePlate) {
		System.out.println("Hashmap output: " + licensePlate);
		vMap.get("DanDan").printData();
	}

	// method to print all object in vList
	public static void displayVehicle() {
		for (Object vObject : vList) {
			Vehicle ve = (Vehicle) vObject;
			ve.printData();
		}
	}

	// method to add vehicle data in ArrayList vList
	public static void addList(Vehicle v) {
		vList.add(v);
		displayVehicle();
	}

	// method to remove vehicle data from ArrayList vList
	public static void removeList(Vehicle v) {
		vList.remove(v);
		displayVehicle();
	}

	// method to get vehicle data in ArrayList vList
	public static void getList(int vNumber) {
		System.out.println("The NO. " + (vNumber + 1) + " vehicle in the ArrayList is:");
		vList.get(vNumber).printData();
	}

	public static void main(String[] args) {
		VehicleRegistry RegistryExample = new VehicleRegistry();
		RegistryExample.run1();
		
		
		/*
		// call the method to save vehicle data in ArrayList vList and HashMap
		// vMap
		System.out.println("The initial content in ArrayList");
		System.out.println("");

		// create a new object v3
		Vehicle v3 = new Vehicle("Buick", "goback", "Verano", 2015, 5, 60, 13.6);

		// use addList() to add v3 into vList
		System.out.println("ArrayList output after add v3");
		addList(v3);
		System.out.println("");

		// use removeList() to remove v3 from vList
		System.out.println("ArrayList output after remove v3");
		removeList(v3);
		System.out.println("");

		// use getList() to get the first object in ArrayList
		System.out.println("The output of getting method");
		getList(1);
		System.out.println("");

		// use displayVehicle() to loop through all vehicle
		System.out.println("The output of loop through mehtod");
		displayVehicle();
		System.out.println("");

		// use retrieveData() to retrieve data from vMap by license plate
		retrieveData("DanDan");

		*/
		
	}

}

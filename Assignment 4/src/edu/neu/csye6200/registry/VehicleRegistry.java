/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
package edu.neu.csye6200.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;




public class VehicleRegistry {

	//singleton pattern
	private static VehicleRegistry instance = null;
	public static VehicleRegistry getInstance(){
		if (instance == null) instance = new VehicleRegistry();
		return(instance);
		
	}
	
	private VehicleRegistry(){
		
	}
	
	
	//logging
	private static Logger log = Logger.getLogger("Class info");
	private static void logClassInfo(){
		log.info("This is class information");
	}
	
	
	
	//ArrayList and HashMap
	private static ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
	private static HashMap<String, Vehicle> vMap = new HashMap<String, Vehicle>();
	
	
	
	// method to save vehicle data in ArrayList vList and HashMap vMap
	public static void run1() {
		vList.add(Vehicle.v1);// ArrayList
		vList.add(Vehicle.v2);

		// HashMap
		vMap.put(Vehicle.v1.getLicenseKey(),Vehicle.v1);
		vMap.put(Vehicle.v2.getLicenseKey(),Vehicle.v2);
		vMap.put(Vehicle.v3.getLicenseKey(),Vehicle.v3);
		vMap.put(Vehicle.v4.getLicenseKey(),Vehicle.v4);
		vMap.put(Vehicle.v5.getLicenseKey(),Vehicle.v5);
		vMap.put(Vehicle.v6.getLicenseKey(),Vehicle.v6);
		vMap.put(Vehicle.v7.getLicenseKey(),Vehicle.v7);
		vMap.put(Vehicle.v8.getLicenseKey(),Vehicle.v8);
		vMap.put(Vehicle.v9.getLicenseKey(),Vehicle.v9);
		vMap.put(Vehicle.v10.getLicenseKey(),Vehicle.v10);

	}

	
	
	//Method to sortVehicle by license
	public static void sortVehicle(){
		
		//build a new String Array and put the license into the Array
		String [] License = new String[10]; 
		License[0] = Vehicle.v1.getLicenseKey();
		License[1] = Vehicle.v2.getLicenseKey(); 
		License[2] = Vehicle.v3.getLicenseKey(); 
		License[3] = Vehicle.v4.getLicenseKey(); 
		License[4] = Vehicle.v5.getLicenseKey(); 
		License[5] = Vehicle.v6.getLicenseKey(); 
		License[6] = Vehicle.v7.getLicenseKey(); 
		License[7] = Vehicle.v8.getLicenseKey(); 
		License[8] = Vehicle.v9.getLicenseKey(); 
		License[9] = Vehicle.v10.getLicenseKey(); 
	
		//use bubble sort to sort the license in Array
		for(int i = 0; i < License.length-1; i++){
			for(int j = 0; j< License.length-i-1; j++){
				if( License[j].compareTo(License[j+1]) > 0 ){
					String temp = License[j+1];
					License[j+1] = License[j];
					License[j] = temp;
				}
			 }
		 }
		
		
		// use retrieve method to print vehicle data from vMap by the sequence in License[]
		System.out.println("Sort vehicle result (A to Z): ");
		System.out.println(" ");
		for(int l =0; l < License.length; l++){
			System.out.println(License[l]);
			retrieveData(License[l]);
		}
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
		VehicleRegistry.run1();
		
		//run the sort method
		VehicleRegistry.sortVehicle();
		
		//run the log method
		VehicleRegistry.logClassInfo();
	}

}

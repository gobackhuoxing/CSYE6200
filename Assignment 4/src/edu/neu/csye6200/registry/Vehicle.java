/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
package edu.neu.csye6200.registry;

public class Vehicle {
	String make;
	String licensePlate;
	String mode;
	int modeYear;
	int passengers;
	int fuelCap;
	double kpl;
	double vRange;
	
	
	// use constructor to create object
	public Vehicle (String make, String licensePlate, String mode, int modeYear, int passengers, int fuelCap, double kpl) {
		this.make = make;
		this.licensePlate = licensePlate;
		this.mode = mode;
		this.modeYear = modeYear;
		this.passengers = passengers;
		this.fuelCap = fuelCap;
		this.kpl = kpl;
	}
	
	static Vehicle v1 = new Vehicle ("BMW", "XIAOCASE", "M5", 2016, 5, 80 , 8.5);
	static Vehicle v2 = new Vehicle ("Dodge", "DanDan", "Viper", 2016, 2, 60 , 9);
	static Vehicle v3 = new Vehicle ("Acura", "Mercury", "M6", 2016, 5, 90 , 8.5);
	static Vehicle v4 = new Vehicle ("Audi", "Venus", "M7", 2016, 5, 80 , 8.6);
	static Vehicle v5 = new Vehicle ("Bentley", "Saturn", "M35", 2016, 5, 75 , 8.7);
	static Vehicle v6 = new Vehicle ("Buick", "Uranus", "SM5", 2016, 5, 85 , 8.8);
	static Vehicle v7 = new Vehicle ("Ford", "Neptune", "B5", 2016, 5, 85 , 0);
	static Vehicle v8 = new Vehicle ("Chevrolet","Earth", "Colorado ", 2016, 2, 80 , 9.4);
	static Vehicle v9 = new Vehicle ("Toyota","Jupiter", "Tacoma", 2016, 2, 80 , 9.8);
	static Vehicle v10 = new Vehicle ("GMC","Mars", "Canyon", 2016, 2, 80 , 9.8);
	
	
	// return the licensePlate in String type
	public String getLicenseKey(){
		return(String.valueOf(licensePlate));
	}
	
	public String getMake(){
		return(String.valueOf(make));
	}
	
	public String getMode(){
		return(String.valueOf(mode));
	}
	
	public String getModeYear(){
		return(String.valueOf(modeYear));
	}
	
	public String getPassengers(){
		return(String.valueOf(passengers));
	}
	
	public String getFuelCap(){
		return(String.valueOf(fuelCap));
	}
	
	public String getKpl(){
		return(String.valueOf(kpl));
	}
	
	public String getRange(){
		getvRange();
		vRange = getvRange();
		return(String.valueOf(vRange));
	}
	
	//method to calculate the vehicle range
	public double getvRange (){
		double vRange = fuelCap*kpl; 
		return vRange;
	}
	
	
	//method to print vehicle data
	public void printData (){
		System.out.println("Make: "+ make);
		System.out.println("Mode: "+ modeYear + " " + mode);
		System.out.println("Passengers: "+ passengers);
		System.out.println("License Plate: "+ licensePlate);
		System.out.println("fuelCap: "+ fuelCap);
		System.out.println("KPL: "+ kpl);
		
		getvRange();
		vRange = getvRange();
		System.out.println("Vehicle Range: "+ vRange);
		System.out.println(" ");
	}
	
}

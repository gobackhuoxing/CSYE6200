/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
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
	
	
	// return the licensePlate in String type
	public String getLicenseKey(){
		return(String.valueOf(licensePlate));
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

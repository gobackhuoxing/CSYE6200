/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
public class TruckVehicle extends Vehicle{

	public TruckVehicle(String make, String licensePlate, String mode, int modeYear, int passengers, int fuelCap,
			double kpl, double height, double width, double length) {
		super(make, licensePlate, mode, modeYear, passengers, fuelCap, kpl);
		this.height = height;
		this.width = width;   //the unit of height, width, and length is inch
		this.length = length;
		
		// TODO Auto-generated constructor stub
	}

	double height;
	double width;
	double length;
	double area;
	
	static TruckVehicle t1 = new TruckVehicle ("Chevrolet","huoxing", "Colorado ", 2016, 2, 80 , 9.4, 20.9, 55.5, 74);
	static TruckVehicle t2 = new TruckVehicle ("Toyota","Jupiter", "Tacoma", 2016, 2, 80 , 9.8, 18, 50, 70);
	static TruckVehicle t3 = new TruckVehicle ("GMC","mars", "Canyon", 2016, 2, 80 , 9.8, 22, 60, 80);
	
	public double getArea(){
		double area = height*width*length;
		return area;
	}
	
	public String getHeight(){
		return(String.valueOf(height));
	}
	
	public String getWidth(){
		return(String.valueOf(width));
	}
	
	public String getLength(){
		return(String.valueOf(length));
	}
	
	public String getSarea(){
		getArea();
		area = getArea();
		return(String.valueOf(area));
	}
	
	public void printData(){
		
		super.printData();
		
		getArea();
		area = getArea();
		System.out.println("Height: "+ height);
		System.out.println("Width: "+ width);
		System.out.println("Length: "+ length);
		System.out.println("Area: "+ area);
		System.out.println(" ");
	}
	
}

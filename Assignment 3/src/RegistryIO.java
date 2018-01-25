import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




/**
 * CSYE 6200
 * @author Wenbo Sun
 * NUID:001994516
 *
 */
public class RegistryIO {
	

	// method to save one vehicle data into a text file
	public void save(Vehicle v, String filename) throws IOException{
		 
		FileWriter fw;
		try {
			fw = new FileWriter(filename);
			fw.write( v.getMake() );
			fw.write(",");
			fw.write( v.getLicenseKey() );
			fw.write(",");
			fw.write( v.getMode() );
			fw.write(",");
			fw.write (v.getModeYear() );
			fw.write(",");
			fw.write (v.getPassengers() );
			fw.write(",");
			fw.write (v.getFuelCap() );
			fw.write(",");
			fw.write (v.getKpl() );
			fw.write("\r\n");
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	// method to load a vehicle
	public void load(Vehicle v, String filename) throws IOException{
		try {
			System.out.println("Output of load method:");
			System.out.println("  ");
			FileReader fr = new FileReader(filename);
		    char [] a = new char[500];
		    fr.read(a); 
		    for(char c : a)
		    System.out.print(c); 
		    fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		//bonus
		FileReader fr=new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        while(br.readLine()!=null){
        	String str =br.readLine();
        	NewVehicle n1 = new NewVehicle(str);
        	System.out.println("  ");
        	System.out.println("Out put from the NewVehicle class:  ");
        	System.out.println("  ");
        	System.out.println(String.valueOf(str));
        }
        br.close(); 
	}


	// method to save a single vehicle data into a open text file
	private void singleSave(Vehicle v) throws IOException{
		
		FileWriter fw = new FileWriter("vehicle.txt", true);
		try {
			fw.write( v.getMake() );
			fw.write(",");
			fw.write( v.getLicenseKey() );
			fw.write(",");
			fw.write( v.getMode() );
			fw.write(",");
			fw.write (v.getModeYear() );
			fw.write(",");
			fw.write (v.getPassengers() );
			fw.write(",");
			fw.write (v.getFuelCap() );
			fw.write(",");
			fw.write (v.getKpl() );
			fw.write("\r\n");
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		RegistryIO run = new RegistryIO();
		
		//save method
		run.save(VehicleRegistry.v1, "vehicle.txt");
		//private save method
		run.singleSave(VehicleRegistry.v2);
		//load method
		run.load(VehicleRegistry.v1, "vehicle.txt");
		
	}
	
	
}

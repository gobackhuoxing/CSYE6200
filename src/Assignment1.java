import java.util.Scanner; 
public class Assignment1 {

	public static void main(String[] args) throws java.io.IOException {
		
		System.out.println("Enter a choice (1,2,3) or q to quit");
		
		char inChar = ' '; 
		int con = 0; // con is a control array to declare the value of his1 his2 his3
		String his1="*"; // set up three variables for input history
		String his2="*";
		String his3="*";
		
		do {  
			inChar = (char) System.in.read();
			if (inChar == '\n' | inChar == '\r') {
				continue;
			}
			
			con++; // line 20 to line 37 are used to record the input history
			switch(con){
			
			case 1 :
				his1 = String.valueOf(inChar); // declare the value of first inChar input to his1
				break;
			
			case 2 :
				his2 = his1; // declare the value of his1 to his2
				his1 = String.valueOf(inChar); // declare the value of second inChar input to his2
				break;
				
			default :
				his3 = his2; // declare the value of his2 to his3
				his2 = his1; // declare the value of his1 to his2
				his1 = String.valueOf(inChar); // declare the value of third inChar input to his2
				break;
			}
			
			switch (inChar) {
			
			
			case '1': // input '2' : output 1 to 9 and cube and sum of cube
				int sum =0;
				for(int i=1; i<10; i++) {
					int j = i*i*i;
					System.out.println("The cube of "+ i +" is "+ j);
					sum += j;
				}
				System.out.println("Value of sum : "+ sum);
				System.out.println(); //blank line
				System.out.println("Enter a choice (1,2,3) or q to quit");
				break;
			
			
			case '2': // input '2' : convert the input to integer form
				char firStr;
				System.out.println("Enter a number between 0 and 9 or b to go back");
				do{
					Scanner scan = new Scanner(System.in); // input a String in case 2 to get a integer form
					String str=scan.next();
					firStr = str.charAt(0);  //only take the first character of str
					double suiNum = (double) (firStr-48); // convert char to double
					int a =(int) Math.floor(suiNum);
					
			
					con++;      // line 66 to line 83 are used to record the input history in case 2
					switch(con){
					
					case 1 :
						his1 = str; // declare the value of first inChar input to his1
						break;
					
					case 2 :
						his2 = his1; // declare the value of his1 to his2
						his1 = str; // declare the value of second inChar input to his2
						break;
						
					default:
						his3 = his2; // declare the value of his2 to his3
						his2 = his1; // declare the value of his1 to his2
						his1 = str; // declare the value of third inChar input to his2
						break;
					}
		
					if (a>=0 & a<10){
						System.out.println("The integer form of "+str+" is "+a);
						continue;
					}	
					
					
					else if(firStr=='\n' | firStr=='\r'){      //do nothing
						continue;
					}
					
					else if(firStr !='b'){
						System.out.println("Please enter a number between 0 and 9 or b to go back!");
					}
					
					else  {
						break;
					}
				}
				while (firStr !='b');
				System.out.println("Going back...");
				System.out.println("Enter a choice (1,2,3) or q to quit");
				break;
				
			
			case '3': // input '3' : print history of last three input, "*" for empty
				System.out.println("Last three inputs history: "+his1+" "+his2+" "+his3);
				System.out.println("Enter a choice (1,2,3) or q to quit");
				break;
				
			
			case 's': // password section, the password is "s w b"
				System.out.println("It seems that you find some secret here! What would you say?");
				char inCode;
				
				do {	
					inCode =  ' ' ;
					inCode = (char) System.in.read();
					if (inCode == '\r' | inCode =='\n') {
						continue;
					}
					
					con++;
					switch(con){
					
					case 1 :
						his1 = String.valueOf(inCode); // declare the value of first inCode input to his1
						break;
					
					case 2 :
						his2 = his1; // declare the value of his1 to his2
						his1 = String.valueOf(inCode); // declare the value of second inCode input to his2
						break;
						
					default :
						his3 = his2; // declare the value of his2 to his3
						his2 = his1; // declare the value of his1 to his2
						his1 = String.valueOf(inCode); // declare the value of third inCode input to his2
						break;
					}
					
					switch (inCode) {
					
					case 'w' :
						System.out.println("Keep trying! You are almost there!");
						
						do {
							inCode = ' ';
							inCode = (char) System.in.read();
							if (inCode == '\r' | inCode =='\n') {
								continue;
							}
							
							con++;
							switch(con){
							
							case 1 :
								his1 = String.valueOf(inCode); // declare the value of first inCode input to his1
								break;
							
							case 2 :
								his2 = his1; // declare the value of his1 to his2
								his1 = String.valueOf(inCode); // declare the value of second inCode input to his2
								break;
								
							default :
								his3 = his2; // declare the value of his2 to his3
								his2 = his1; // declare the value of his1 to his2
								his1 = String.valueOf(inCode); // declare the value of third inCode input to his2
								break;
							}
							
							switch (inCode) {
							
							case 'b':
								System.out.println("Password accepted");
								break;
								
							case '\n':
							case '\r':
								break;   //(do nothing)
							
							default :
								System.out.println("Unauthorized access, system shut dowm!");
								break;	
							}
						}
						while ( inCode == '\r' | inCode == '\n' );
						break;
						
					case '\n':
					case '\r':
						break;   //(do nothing)	
					
					default :
						System.out.println("Unauthorized access, system shut dowm!");
						break;
					}
				}
				while(inCode == 'w' | inCode == '\r' | inCode == '\n');
				break;
					
				
				
			case '\n':
			case '\r':
			case 'q':
				break;   //(do nothing)
			
			default:
				System.out.println("Invalid selection");
				System.out.println("Enter a choice (1,2,3) or q to quit");
				break;
			}
		}
		
		while (inChar !='q');  // input 'q' to quit and print Byebye
		System.out.println("Byebye!");
		
	}

}

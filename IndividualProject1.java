package individualproject1;

import java.util.Scanner;

public class IndividualProject1 {
	
public static void main (String[] args) {

	//Using Scanner class to accept keyboard input 
		Scanner Scanner = new Scanner (System.in); 
		
		
				//Declare and use variables 
		        double startingSalary; 
		        double increaseRate;
		        double firstYear;
		        double secondYear;
		        
		       //Prompt the user to type in their starting salary and increase rate 
		       System.out.print("Enter your starting salary: ");
		       startingSalary = Scanner.nextDouble(); 
		       
		       System.out.print ("Enter annual increase rate: ");
		       increaseRate = Scanner.nextDouble(); 
		       
		       //Perform calculation for first and second year salaries
		       firstYear = (startingSalary + (startingSalary * (increaseRate)));
		       secondYear = (firstYear + (firstYear * (increaseRate))); 
		       
		       //Print the calculated salaries 
		       System.out.println("After the first year your salary will be $" + String.format("%.2f", firstYear));
		       System.out.println("After the second year your salary will be $" + String.format("%.2f", secondYear));
		          
		    }
		}

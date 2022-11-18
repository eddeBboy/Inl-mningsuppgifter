package löneSystem;

import java.util.Scanner;
public class incomeTax{

	public static void main(String[] args)  {
	
				
		Employee slip = new Employee();
		
		String name;
		
		int age;
	
		//Insert scanner
	Scanner myScanner = new Scanner(System.in);
	
		//details
	System.out.println("What is your name?");
	
	name = myScanner.nextLine();
	
	slip.setName(name);
	
	 System.out.println("what is your hourly rate? (only type integers)");
    
    int hourlyRate = myScanner.nextInt();
    
    slip.setHourlyRate(hourlyRate);
	
	System.out.println("How many hours per month do you work (only type integers)");
	
	int hours = myScanner.nextInt();	
	
	slip.setHours(hours);
	
	int calulateSalary =  slip.calulateSalary();
	
	double calculateNetSalary = slip.calculateNetSalary();
	//New lines
	String newline = System.lineSeparator();
        
	//input from employee
	String output = "-----------------------------" + newline +
			"## Payment information ##" + newline + newline +
    "Name:                       " + slip.getName() + newline + 
	"Hourly rate:                " +  slip.getHourlyRate() + " kr/h" + newline +
	"Hours worked:               " + slip.getHours() + " h" + newline +
	"income before tax:          " + slip.calulateSalary() + " kr" + newline +
	"income after tax:           " + slip.calculateNetSalary() + " kr" + newline + newline +
	"please contact Bob if you have any further questions!" + newline +
	"-----------------------------";
   
	
	System.out.println(output);
	
		
	}
	
	
	
	
	
	
	
	

}

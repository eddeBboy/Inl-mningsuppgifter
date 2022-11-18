package löneSystem;

//import java scanner

//create public class
public class Employee {
	
	final double tax = 0.3;

	
//create the attributes of the class
	private String name;
	
	private int hourlyRate;
	
	private int hours;
	
	public Employee (String name, int hourlyRate, int hours) {
		this.hourlyRate = hourlyRate;
		this.hours = hours;
		this.name = name;
	}
	public Employee() {
		
	}
	
	public int calulateSalary()  {
		return hours*hourlyRate;
	
	}
		 
	public double calculateNetSalary()  {
		return calulateSalary()*(1-tax);
	}
	//getters
		public String getName()  {
			return name;
		}
		
		public int getHourlyRate() {
			return hourlyRate;
		
		}
			
		public int getHours() {
		    return hours;
		
		}
		
		
		//setters
		public void setName (String name) {
			this.name = name;
		}
		public void setHourlyRate (int hourlyRate) {
			this.hourlyRate = hourlyRate;
		}
		public void setHours (int hours)  {
			this.hours = hours;
		}
		

	
	
		
		
		
		
		

	}



package homework2;

public class Employee {
	
	private String name;
	private int rate;
	private int hours;

	private static int totalSum;
	private static int totalEmp = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public Employee() {
		totalEmp++;
		totalSum = rate * hours;
	}
	
	public Employee(String name, int rate) {
	this.name = name;
	this.rate = rate;
	totalSum = rate * hours;
	totalEmp++;
	}
	
	public Employee(String name, int rate, int hours) {
	this.name = name;
	this.rate = rate;
	this.hours = hours;
	totalSum = rate * hours;
	totalEmp++;
	}
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", rate = " + rate + ", hours = " + hours + ", salary = " + getSalary() + "]";
	}
	
	public int getSalary() {
		int salary = rate * hours;
		return salary;
	}
	

	public static int getTotalEmp() {
		return totalEmp;
	}
	
	public static int getTotalSum() {
		return totalSum++;
	}
	}
/*-
 Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consist of
	three private fields: name, rate and hours; 
	static field totalSum
	properties for access to these fields;
	default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	methods:
getSalary() - to calculate the salary of person (rate * hours)
toString() - to output information about employee
changeRate(int rate) - to change the rate of some employee and recalculate his salary
getBonuses() – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them. 
Display the total salary of all workers to screen

 
 */

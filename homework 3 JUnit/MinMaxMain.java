package homework3;

import java.util.Scanner;

public class MinMaxMain {
	
	public static void main (String [] args) {
	
	Scanner scanner = new Scanner(System.in); 
	System.out.println("enter first number :"); 
	int first = scanner.nextInt();   
	System.out.println("enter second number :"); 
	int second = scanner.nextInt();   
	System.out.println("enter third number :"); 
	int third = scanner.nextInt(); 
	
	MinMax minmax = new MinMax();
	int largest = minmax.largest(first, second, third); 
	int smallest = minmax.smallest(first, second, third); 
	
	
	//System.out.println("largest of three numbers "+ first + ", " + second + ", " + third + ", " + " is: " + largest); 
	System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);
	System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest); 
	
	scanner.close();

	}	
}
//Solve the next tasks:
//read 3 integer numbers and write max and min of them


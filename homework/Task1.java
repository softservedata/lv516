package homework;


import java.util.Scanner;

public class Task1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Input radius of your flower bed, please.");
		Double radius = sc.nextDouble();
		Double pr = 2 * Math.PI * radius;
		Double ar = Math.PI * Math.pow(radius, 2);
		
		
		System.out.println("Perimeter is " + pr);
		System.out.println("Area is " + ar);

	}

}

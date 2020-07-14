package homework3;
//Enter three numbers. Find out how many of them are odd.

import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		System.out.println("Enter third number:");
		int c = sc.nextInt();
		sc.close();
				
		String numbera = (a % 2 == 0) ? "even" : "odd";
		String numberb = (b % 2 == 0) ? "even" : "odd";
		String numberc = (c % 2 == 0) ? "even" : "odd";

        System.out.println(a + " is " + numbera);
		System.out.println(b + " is " + numberb);
		System.out.println(c + " is " + numberc);
		
	}

}

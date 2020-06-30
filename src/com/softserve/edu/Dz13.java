package com.softserve.edu;

import java.util.Scanner;

public class Dz13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("C1 = ");
		float c1 = sc.nextFloat();
		System.out.print(" C2 = ");
		float c2 = sc.nextFloat();
		System.out.print(" C3 = ");
		float c3 = sc.nextFloat();
		System.out.print(" T1 = ");
		float t1 = sc.nextFloat();
		System.out.print(" T2 = ");
		float t2 = sc.nextFloat();
		System.out.print(" T3 = ");
		float t3 = sc.nextFloat();
		System.out.println("First country talk costs - " + (c1 * t1));
		System.out.println("Second country talk costs - " + (c2 * t2));
		System.out.println("Third country talk costs - " + (c3 * t3));
		System.out.println("All countries talks cost - " + (c1 * t1 + c2 * t2 + c3 * t3));
				
		/* 
		float c1 = args[0], c2 = args[1], c3 = args[2], t1 = args[3], t2 = args[4], t3 = args[5]; 
		System.out.println("First country talk costs - " + (c1 * t1));
		System.out.println("Second country talk costs - " + (c2 * t2));
		System.out.println("Third country talk costs - " + (c3 * t3));
		System.out.println("All countries talks cost - " + (c1 * t1 + c2 * t2 + c3 * t3));
		*/
	}
}

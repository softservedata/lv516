package com.softserve.edu;

import java.util.Scanner;

public class Dz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius = ");
		int r = sc.nextInt();
		System.out.println("Perimeter = " + (2 * 3.14 * r));
		System.out.println("Area = " + (3.14 * r * r));
		}
}

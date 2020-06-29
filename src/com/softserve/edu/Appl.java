package com.softserve.edu;

import java.util.Scanner;

import com.softserve.training.Calc;

/**
 * 
 * @author Lv516
 *
 */
public class Appl {
	private int k;
	private String name;

	/**
	 * 
	 * @param args Command <font color="red"><b>line</b></font> parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Hello");
		Appl app1 = new Appl(); // default
		// This example demonstrates the use of single line comments
		app1.k = 1;
		app1.name = "qwerty";
		System.out.println("app1.k = " + app1.k + "  name = " + app1.name);
		Appl app2 = new Appl(); // default
		app2.k = 2;
		System.out.println("app2.k = " + app2.k);
		/*
		 * This is a sample class which is used to demonstrate the use of multi-line
		 * comments.
		 * 
		 * This comment does not appear in the java documentation
		 */
		if (args.length > 0) {
			System.out.println("Command line Arguments:");
			for (int i = 0; i < args.length; i++) {
				System.out.println("Arg " + i + " is " + args[i]);
			}
		}
		byte b = 48;
		b = (byte) (b + 1);
		System.out.println("as byte b = " + b + "  as char b= " + (char) b);
		String s = "abc";
		System.out.println("s = " + s);
		//
		Calc calc = new Calc();
		System.out.println("1 + 2 = " + calc.add(1, 2));
		//
		/*-
		int age = 0;
		double t = 0.0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("text = ");
			String text = br.readLine();
			t = Double.parseDouble(text);
			age = Integer.parseInt(text);
		} catch (Exception e) {
			System.out.println("***Error");
		}
		System.out.println("age = " + age);
		System.out.println("t = " + t);
		*/
		Scanner sc = new Scanner(System.in);
		//System.out.print("text = ");
		//String text = sc.nextLine();
		//System.out.println("text = " + text);
		//
//		System.out.print("age = ");
//		int age = sc.nextInt();
//		System.out.print("age = " + age);
		//
		System.out.print("age = ");
		double t = sc.nextDouble();
		System.out.print("t = " + t);
		//
		sc.close();
	}
}

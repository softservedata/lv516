package com.softserve.edu3;

import com.softserve.edu31.Employee;

class Person {
	private String name;

	public String getName() {
		// Check right
		return name;
	}

	public void setName(String name) {
		// Check name
		this.name = name;
	}

	// overload
	public void print() {
		System.out.println(name);
	}

	// overload
	public void print(String s) {
		System.out.println(s + " " + name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

class Student extends Employee {
	private String firstName;
	private String lastName;
	private static int count = 0;

	public Student() {
		firstName = "";
		lastName = "";
		count++;
	}

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		count++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void m1() {
		Employee emp = new Employee();
		// People pl = new People();
		// emp.name = "Ivan";
		name = "Ivan";
	}
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName
				+ ", lastName=" + lastName
				+ ", name=" + name + "]";
	}

	public static int getCount() {
		return count;
	}
}

public class Appl {
	private int i = 123;
	private static int j = 456;
	private static int k;

//	public Appl(int i) {
//	}

	// public static void main(String[] args, int k) {
	public static void main(String[] args) {
		/*-
		// int k;
		int i = 4;
		String s = "2334a";
		// i = Integer.parseInt(s);
		//
		// Allocate memory;
		// create object(instance);
		// init field;
		// init table of virtual methods.
		Appl app = new Appl();
		//
		System.out.println("app.i = " + app.i);
		Appl app2 = new Appl();
		app2.i = 321;
		System.out.println("app.i = " + app.i);
		System.out.println("app2.i = " + app2.i);
		System.out.println("i = " + i);
		System.out.println("j = " + j + "   s = " + s + "   k = " + k);
		//
		Employee emp = new Employee();
		System.out.println("emp.name = " + emp.name);
		//
		i = 100;
		long l = i; // implicit
		float f = l;
		System.out.println("l = " + l + "   f = " + f + "  (char)l = " + (char) l);
		//
		double d = -100.04;
		l = (long) d; // explicit type casting required
		i = (int) l;
		System.out.println("d = " + d + "   l = " + l + "  i = " + i);
		//
		Person person = new Person();
		//person.name = "Petro";
		person.setName("Petro");
		person.print();
		person.print("hello");
		//
		Util util = new Util();
		//util.print("Hello");
		util.print("Hello", 1, "hahaha", 123.456, person);
		//
		// Helper.setMessage("abc");
		// Helper.print();
		//
		// Helper h = new Helper(); // Compile Error
		// h.setMessage("abc");
		// h.print();
		*/
		//Student s1 = new Student();
		Student s2 = new Student("ivan", "ivanov");
		//Student s3 = new Student();
		System.out.println("Count = " + Student.getCount());
		System.out.println(s2);
	}
}

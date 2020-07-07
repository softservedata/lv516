package homework2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private int birthdYear;
	private int year;

	public Person() {
		firstName = "";
		lastName = "";
		birthdYear = 1900;
		year = LocalDate.now().getYear();
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		birthdYear = 1900;
		year = LocalDate.now().getYear();
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

	public int getBirthdYear() {
		return birthdYear;
	}

	public void setBirthdYear(int birthdYear) {
		this.birthdYear = birthdYear;
	}

	public int getAge() {
		return year - birthdYear;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", was born " + getBirthdYear() + " - " + getAge() + " years.";
	}
	
	public void changeName(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	public void output () {
		System.out.println(toString());
	}

	public static Person input() { //статична фабрика Static Factory Pattern
		Scanner sc = new Scanner(System.in);
		System.out.println("Firstname = ");
		String fn = sc.nextLine();
		System.out.println("Lastname = ");
		String ln = sc.nextLine();
		System.out.println("birthdYear = ");
		int by = sc.nextInt();
		Person person = new Person (fn, ln);
		person.setBirthdYear(by);
		return person;
	}


}

/*-
! Create Console Application project in Java.
! Add class Person to the project.
! Class Person should consist of

! three private fields: firstName, lastName and birthYear (the birthday year) 
! properties for access to these fields - гетери і сетери
! default constructor and constructor with 2 parameters (first and last names)

methods:
! getAge() - to calculate the age of person
! input() - to input information about person
! output() - to output information about person
! changeName(String fn, String fn) - to change the first name or/and last name of person

In the method main() create 5 objects of Person type and input information about them.

 */

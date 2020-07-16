package HW2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fName, lName; //create 5 new persons with first and last names

        System.out.println("Person 1");
        System.out.println("Enter first name: ");
        fName = sc.nextLine();
        System.out.println("Enter last name: ");
        lName = sc.nextLine();
        Person p1 = new Person(fName, lName);


        System.out.println("Person 2");
        System.out.println("Enter first name: ");
        fName = sc.nextLine();
        System.out.println("Enter last name: ");
        lName = sc.nextLine();
        Person p2 = new Person(fName, lName);


        System.out.println("Person 3");
        System.out.println("Enter first name: ");
        fName = sc.nextLine();
        System.out.println("Enter last name: ");
        lName = sc.nextLine();
        Person p3 = new Person(fName, lName);

        System.out.println("Person 4");
        System.out.println("Enter first name: ");
        fName = sc.nextLine();
        System.out.println("Enter last name: ");
        lName = sc.nextLine();
        Person p4 = new Person(fName, lName);

        System.out.println("Person 5");
        System.out.println("Enter first name: ");
        fName = sc.nextLine();
        System.out.println("Enter last name: ");
        lName = sc.nextLine();
        Person p5 = new Person(fName, lName);

        p1.getAge();
        System.out.println("-----");

        p2.input();
        System.out.println("-----");

        System.out.println("Change name of person 3");
        System.out.println("Enter new first name: ");
        String newF = sc.nextLine();
        System.out.println("Enter new last name: ");
        String newL = sc.nextLine();
        p3.changeName(newF, newL);

        p4.output();
        System.out.println("-----");

        sc.close();

    }


}

package HW2;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int birth = sc.nextInt();
        int age = 2020 - birth;
        System.out.println("Your age is "+ age);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = sc.nextLine();
        System.out.println("Enter your last name: ");
        String last = sc.nextLine();
        System.out.println("Enter your year of birth: ");
        int age = sc.nextInt();
    }

    public void output() {
        System.out.print(firstName + " ");
        System.out.print(lastName + ", ");
        System.out.print(birthYear + " year of birth.");
    }
    public void changeName(String fn, String ln) {
        System.out.println("Old name:" + this.firstName + " " + this.lastName);
        this.firstName = fn;
        this.lastName = ln;
        System.out.println("New name: " + fn + " " + ln);
    }
}

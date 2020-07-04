import java.awt.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName)//constructor
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getAge()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the birth year of "+firstName+": ");
        int birth  = sc.nextInt();
        int age = 2020 - birth;
        System.out.println("Age of this person = "+age);
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String first = sc.nextLine();
        System.out.println("Enter last name: ");
        String last = sc.nextLine();
        System.out.println("Enter year of birth: ");
        int birth = sc.nextInt();
    }

    public void output()
    {
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Birth year: "+birthYear);
    }

    public void changeName(String fn, String ln)//new first and last names
    {
        System.out.println("Old name: "+this.firstName+" "+this.lastName);
        this.firstName = fn;
        this.lastName = ln;
        System.out.println("New first name: "+this.firstName);
        System.out.println("New last name: "+this.lastName);
    }
}

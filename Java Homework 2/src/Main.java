import java.util.Scanner;
public class Main {
    public static  void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fName, lName;

        System.out.println("Enter first name of the person 1:");
        fName = sc.nextLine();
        System.out.println("Enter last name of the person 1:");
        lName = sc.nextLine();
        Person p1 = new Person(fName, lName);
        System.out.println("----------------------");

        System.out.println("Enter first name of the person 2:");
        fName = sc.nextLine();
        System.out.println("Enter last name of the person 2:");
        lName = sc.nextLine();
        Person p2 = new Person(fName, lName);
        System.out.println("----------------------");

        System.out.println("Enter first name of the person 3:");
        fName = sc.nextLine();
        System.out.println("Enter last name of the person 3:");
        lName = sc.nextLine();
        Person p3 = new Person(fName, lName);
        System.out.println("----------------------");

        System.out.println("Enter first name of the person 4:");
        fName = sc.nextLine();
        System.out.println("Enter last name of the person 4:");
        lName = sc.nextLine();
        Person p4 = new Person(fName, lName);
        System.out.println("----------------------");

        System.out.println("Enter first name of the person 5:");
        fName = sc.nextLine();
        System.out.println("Enter last name of the person 5:");
        lName = sc.nextLine();
        Person p5 = new Person(fName, lName);
        System.out.println("----------------------");

        //Testing methods
        p1.getAge();
        System.out.println("----------------------");

        p2.input();
        System.out.println("----------------------");

        p3.output();
        System.out.println("----------------------");

        System.out.println("Enter new first name of person: ");
        String newF = sc.nextLine();
        System.out.println("Enter new last name of person: ");
        String newL = sc.nextLine();
        p4.changeName(newF, newL);

       sc.close();
    }
}

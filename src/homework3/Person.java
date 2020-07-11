package homework3;
import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthdYear;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        birthdYear =1956;
        year=LocalDate.now().getYear();
    }
    public Person(){
        firstName = "";
        lastName = "";
        birthdYear = 1943;
        year=LocalDate.now().getYear();


    }
    public int getAge(){
        return year - birthdYear;
    }



    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", birthdYear=" + birthdYear + ", year=" + getAge() + '}';
    }

    public void output(){
        System.out.println(toString());
    }

    public void changeName(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;

    }
    public static Person input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("firstName = ");
        String firstname = sc.nextLine();
        System.out.println("lastName  = ");
        String lastname = sc.nextLine();
        System.out.println("birthdYear = ");
        int birthdyear = sc.nextInt();
        Person person =new Person(firstname,lastname);
        person.setBirthdYear(birthdyear);
        return person;
    }
}


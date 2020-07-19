package Homework5.Task5_4;
import java.time.LocalDate;
import java.util.Scanner;
public class Car {
    private int year;
    private double engineCapacity;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year of production");
        year = sc.nextInt();
    }
    public void outputYear(){
        System.out.println("This car was made " + year + " It have " +(LocalDate.now().getYear()-year) + " year" );
    }

    public void sort(){

    }
}

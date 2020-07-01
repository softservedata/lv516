import java.awt.*;
import java.util.Scanner;
public class Main {

    public static  void  main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("TASK 2");
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Where do you leave, "+name+"?");
        String address = sc.nextLine();
        System.out.println("Information: "+name+", "+address);
        System.out.println("_____________________");

        System.out.println("TASK 1");
        System.out.println("Radius = ");
        double radius = sc.nextDouble();
        double pr = 2 * Math.PI * radius;
        double s = Math.PI*Math.pow(radius,2);
        System.out.println("Perimetr = "+pr);
        System.out.println("Area = "+s);
        System.out.println("_____________________");

        System.out.println("TASK 3");
        System.out.println("Enter units per minute:");
        System.out.print("c1 = ");
        double c1 = sc.nextDouble();
        System.out.print("c2 = ");
        double c2 = sc.nextDouble();
        System.out.print("c3 = ");
        double c3 = sc.nextDouble();

        System.out.println("How long did talks continue?");
        System.out.print("1 talk: ");
        double t1 = sc.nextDouble();
        System.out.print("2 talk: ");
        double t2 = sc.nextDouble();
        System.out.print("3 talk: ");
        double t3 = sc.nextDouble();

        System.out.println("Count for each call:");
        System.out.println("Call 1: "+(c1*t1));
        System.out.println("Call 2: "+(c2*t2));
        System.out.println("Call 3: "+(c3*t3));
        System.out.print("Summary: "+((c1*t1)+(c2*t2)+(c3*t3)));
    }


}

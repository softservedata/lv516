package HW1;

import java.util.Scanner;

public class Task2 {
    static Scanner scn= new Scanner(System.in);
    public static void main (String arg[])
    {
        System.out.println("What is your name?");
        String name = scn.next();
        System.out.println("Where are you from, " + name +"?");
        String address = scn.next();
        System.out.println("Hello, " + name + " from " + address + "!");
    }
}

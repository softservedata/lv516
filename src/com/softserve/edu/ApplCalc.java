package com.softserve.edu;

import java.util.Scanner;

public class ApplCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("arg0 = ");
        int arg0 = sc.nextInt();
        System.out.print("arg1 = ");
        int arg1 = sc.nextInt();
        sc.close();
        /*-
        System.out.println("arg0 + arg1 = " + (arg0 + arg1));
        System.out.println("arg0 / arg1 = " + (arg0 / arg1));
        */
        Calc calc = new Calc();
        System.out.println("arg0 + arg1 = " + calc.add(arg0, arg1));
        System.out.println("arg0 / arg1 = " + calc.div(arg0, arg1));
    }
}

package com.softserve.edu7;

public class Appl {
    public static void main(String[] args) {
        /*-
        B b = new B(23,45);
        //b.setI(123);
        System.out.println("b.getI() = " + b.getI());
        */
        int num = 123;
        double data = 1.12;
        System.out.println("origin: data = " + data + "  num = " + num);
        //data = num;
        //System.out.println("data = " + data);
        num = (int) data; // Code Smell
        System.out.println("num = " + num);
        //
    }
}

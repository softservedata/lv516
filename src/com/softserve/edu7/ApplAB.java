package com.softserve.edu7;

public class ApplAB {
    public static void main(String[] args) {
        System.out.println("The Start.");
        //
//        ClassA a = new ClassA();
//        System.out.println("Test ClassA.");
//        a.m1();
//        a.m2();
//        a.m3();
//        a.m4();
        //
        ClassA b = new ClassB();
        System.out.println("Test ClassB.");
        System.out.println("b.i = " + b.i);  // Architecture Error
        b.m1();
        b.m2();
        b.m3();
        b.m4();
        b.m5();
        b.m6();
        b.m7(); // Warning, Architecture Error
        ClassA.m7();
        ClassB.m7();
        //
//        ClassB b0 = new ClassB();
//        System.out.println("Test_0 ClassB.");
//        b0.m1();
//        b0.m2();
//        b0.m3();
//        b0.m4();
//        b0.m7();
    }
}

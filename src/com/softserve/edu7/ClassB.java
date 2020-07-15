package com.softserve.edu7;

public class ClassB extends ClassA {
    public double i = 1.1;

    @Override
    public void m1() {
        System.out.println("ClassB, metod m1, i= " + i);
    }

    @Override
    public void m4() {
        System.out.println("ClassB, metod m4");
    }
    
    public void m5() {
        System.out.println("ClassB, metod m5");
        System.out.print("\t");
        super.m5();
    }
    
//    protected void m6() {
//        System.out.println("ClassB, metod m6");
//    }
    
    public static void m7() {
        System.out.println("ClassB, metod m7");
    }
}

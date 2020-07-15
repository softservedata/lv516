package com.softserve.edu7;

public class ClassA {
    public int i = 1;

    public void m1() {
        System.out.println("ClassA, metod m1, i = " + i);
    }

    public void m2() {
        System.out.println("ClassA, metod m2, i = " + i);
    }

    public void m3() {
        System.out.print("ClassA, metod m3, runnind m4():");
        m4();
    }

    public void m4() {
        System.out.println("ClassA, metod m4");
    }
    
    //protected final void m5() {
    protected void m5() {
        System.out.println("ClassA, metod m5");
    }
    
    public void m6() {
        System.out.println("ClassA, metod m6");
    }
    
    public static void m7() {
        System.out.println("ClassA, metod m7");
    }
}

package com.softserve.homework3;

import java.util.Scanner;

public class Abc {
    private int a;
    private int b;
    private int c;

    public Abc(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        result = prime * result + c;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) 
                || (getClass() != obj.getClass())){
            return false;
        }
        Abc other = (Abc) obj;
        //
        return (a == other.a) 
                  && (b == other.b) 
                  && (c == other.c);
    }

    @Override
    public String toString() {
        return "Abc [a=" + a + ", b=" + b + ", c=" + c + "]";
    }

    public static Abc get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();
        sc.close();
        return new Abc(a, b, c);
    }
}

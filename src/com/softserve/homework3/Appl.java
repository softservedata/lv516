package com.softserve.homework3;

public class Appl {
    public static void main(String[] args) {
        AbcService abcService = new AbcService();
        Abc abc = Abc.get();
        //
        /*-
        int temp = 0;
        if (abc.getA() > abc.getB()) {
            temp = abc.getA();
            abc.setA(abc.getB());
            abc.setB(temp);
        }
        if (abc.getB() > abc.getC()) {
            temp = abc.getB();
            abc.setB(abc.getC());
            abc.setC(temp);
        }
        if (abc.getA() > abc.getB()) {
            temp = abc.getA();
            abc.setA(abc.getB());
            abc.setB(temp);
        }
        */
        //
        System.out.println("Sorted: " + abcService.sort(abc));
    }
}

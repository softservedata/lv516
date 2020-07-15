package com.softserve.edu7a;

public class AppParent {
    public static void main(String[] args) {
        //Parent parent = new Child();
        Child parent = new Child();
        System.out.println("parent.f() = " + parent.f());
        System.out.println("parent.useF() = " + parent.useF());
    }
}

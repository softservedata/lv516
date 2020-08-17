package com.softserve.edu14;

interface Vehicle {
    default void print() {
        System.out.println("Vehicle: I am a vehicle!");
        blowHorn();
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
        // print(); //Error
    }

}

interface FourWheeler {
    default void print() {
        System.out.println("FourWheeler: I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {
//    public void print() {
//        System.out.println("Car: Four-wheeler car vehicle!");
//    }

    public void print() {
        Vehicle.super.print();
        //FourWheeler.super.print();
    }

}

public class ApplCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.print();
        //Vehicle.blowHorn();
    }
}

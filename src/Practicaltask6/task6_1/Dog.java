package Practicaltask6.task6_1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("HAV-HAV");
    }

    @Override
    public void feed() {
        System.out.println("The dog is eating");
    }
}

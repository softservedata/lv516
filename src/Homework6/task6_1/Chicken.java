package Homework6.task6_1;

public class Chicken extends NonFlyingBird{
    public Chicken() {
        setFeathers("white, gray, orange, red, brown, red, black");
        setLayEggs("lay 1 egg");
        output();
        fly();
    }


    @Override
    public void output() {
        System.out.println("Chicken`s  feathers is " + getFeathers() + "and they  " + getLayEggs());
    }

    @Override
    void fly() {
        System.out.println("The chicken cannot fly");
    }
}

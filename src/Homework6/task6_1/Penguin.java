package Homework6.task6_1;

public class Penguin extends NonFlyingBird{

    public Penguin() {

        setFeathers("black and white");
        setLayEggs("lay 1 egg");
        output();
        fly();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Penguin`s feathers is " + getFeathers() + " and they " + getLayEggs());
    }

    @Override
    void fly() {
        System.out.println("The penguin cannot fly");
    }
}

package Homework6.task6_1;

public class Swallow extends FlyingBird{
    public Swallow(){

        setFeathers("blue and white");
        setLayEggs("lay 4-5 eggs");
        output();
        fly();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Swallow`s feathers is " +getFeathers() + " and they " + getLayEggs());
    }

    @Override
    void fly() {
        System.out.println("The swallow  can fly");

    }
}

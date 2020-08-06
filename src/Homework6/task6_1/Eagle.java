package Homework6.task6_1;

public class Eagle extends FlyingBird {
    public Eagle(){

        setFeathers("dark storm");
        setLayEggs("lay 2 eggs");
        output();
        fly();
}

    @Override
    public void output() {
        super.output();
        System.out.println("Eagle`s feathers is " + getFeathers() + " and they   " +getLayEggs());
    }

    @Override
    void fly() {
        System.out.println("The eagle can fly");
    }
}

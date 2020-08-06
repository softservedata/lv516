package Practicaltask6.task6_2;

public  class Cleaner extends Staff{
    private final String TYPE_PERSON= "Cleaner";
    @Override
    void Salary() {
        System.out.println("Cleaner`s salary is 1400$");
    }

    @Override
    void print() {
        System.out.println("I`m a " + TYPE_PERSON);

    }
    public Cleaner(){
        print();
        Salary();
    }
}

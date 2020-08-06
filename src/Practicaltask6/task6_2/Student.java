package Practicaltask6.task6_2;

public  class Student extends Person {
    private final String TYPE_PERSON ="Student";
    @Override
    void print() {
        System.out.println("I`m a " + TYPE_PERSON);
    }
    public   Student(){
        print();
    }
}

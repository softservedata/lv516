package Practicaltask6.task6_2;

public class Teacher extends Staff{
    private final String TYPE_PERSON = "Teacher";
    @Override
    void Salary() {
        System.out.println("Teachers salary is 2000$");
    }
    public  Teacher(){
        print();
        Salary();
    }

    @Override
    void print() {
        System.out.println("I'm a " + TYPE_PERSON);
    }
}

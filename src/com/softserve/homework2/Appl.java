package com.softserve.homework2;

public class Appl {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Oleh");
        person1.setLastName("Man");
        person1.setBirthdYear(1990);
        person1.output();
        //
        Person person2 = new Person("Ira", "Mans");
        person2.setBirthdYear(1991);
        person2.output();
        //
        Person person3 = Person.input();
        person3.changeName("neOleh", "Mans");
        person3.output();
    }
}

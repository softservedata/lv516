package homework3;

public class MainPerson {

    public static void main(String[] args) {

        Person person1=new Person("Oleg","Koretz");
        person1.setBirthdYear(1985);

        Person person2=new Person();
        person2.setFirstName("Mischa");
        person2.setLastName("Master");

        Person person3=Person.input();

        Person person4=Person.input();

        person4.changeName("Albert","Nurberg");
        Person person5=Person.input();
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

    }
}

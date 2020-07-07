package homework2;

public class MainPerson {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setFirstName("Oleh");
		person1.setLastName("Man");
		person1.setBirthdYear(1990);
		person1.output();

		Person person2 = new Person("Olesya", "Mand");
		person2.setBirthdYear(1991);
		person2.output();

		Person person3 = Person.input();
		person3.changeName("Dan", "Mant");
		person3.output();


		

	}

}

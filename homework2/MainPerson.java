package homework2;

public class MainPerson {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setFirstName("Oleh");
		person1.setLastName("Man");
		person1.setBirthdYear(1990);
		System.out.println(person1.toString());

		Person person2 = new Person();
		person2.setFirstName("Olya");
		person2.setLastName("Mans");
		person2.setBirthdYear(1991);
		System.out.println(person2.toString());

		Person person3 = new Person();
		person3.setFirstName("Sasha");
		person3.setLastName("Mann");
		person3.setBirthdYear(1992);
		System.out.println(person3.toString());

		Person person4 = new Person();
		person4.setFirstName("Yura");
		person4.setLastName("Manc");
		person4.setBirthdYear(1993);
		System.out.println(person4.toString());

		Person person5 = new Person("Olesya", "Mand");
		person5.setBirthdYear(1994);
		System.out.println(person5.toString());

		System.out.println("\n" + "And now:" + "\n" + "Type some information about " + person1.getFirstName());
		System.out.println(person1.input() + " - about " + person1.getFirstName());
		System.out.println("Type some information about " + person2.getFirstName());
		System.out.println(person2.input() + " - about " + person2.getFirstName());
		System.out.println("Type some information about " + person3.getFirstName());
		System.out.println(person3.input() + " - about " + person3.getFirstName());

		System.out.println("\nLet's change names:");
		person1.changeName("neOleh");
		person2.changeName("neOlya");
		person3.changeName("neSasha");
		person4.changeName("neYura");
		person5.changeName("neOlesya");

	}

}

package practical_task_5;
/*
 * Create next structure. In abstract class Person with property name, declare abstract method print(). 
 * In other classes in body of method print() output text “I am a …”. 
 * In class Staff declare abstract method salary(). 
 * In each concrete class create constant TYPE_PERSON. 
 * Output type of person in each constructors. 
 * Create array of Person and add some Teachers, Cleaners and Students to it. 
 * Call method print() for all of it. 
 * Call method salary() for all Teachers and Cleaner

 */
public class MainPerson {
	public static void main(String[] args) {
		
		Person[] person = new Person [6];
		person[0] = new Student ("A");
		person[1] = new Student ("B");
		person[2] = new Teachers ("C");
		person[3] = new Teachers ("D");
		person[4] = new Cleaners ("E");
		person[5] = new Cleaners ("F");
		
		
		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}
		
	}

}

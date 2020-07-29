package practical_task_5;

public class Student extends Person{
	
	public static String TYPE_PERSON = "student";
	
	public Student(String name) {
		super(name);
		System.out.println(TYPE_PERSON);
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON + " " + name);
		
	}

}

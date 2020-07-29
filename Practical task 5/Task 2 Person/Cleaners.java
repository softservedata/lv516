package practical_task_5;

public class Cleaners extends Staff{
	
	public static String TYPE_PERSON = "cleaner";

	public Cleaners(String name) {
		super(name);
		System.out.println(TYPE_PERSON);
	}

	

	@Override
	void print() {
		System.out.println("I am a " + TYPE_PERSON + " " + name + "; salary - " + salary());
		
	}
	
	@Override
	int salary() {
		int s = 2000;
		return s;
		
	}

}

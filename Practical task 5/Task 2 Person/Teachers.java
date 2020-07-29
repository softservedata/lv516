package practical_task_5;

public class Teachers extends Staff{
	
	public static String TYPE_PERSON = "teacher";

	public Teachers(String name) {
		super(name);
		System.out.println(TYPE_PERSON);
	}

	@Override
	void print() {
		System.out.println("I am a " + TYPE_PERSON + " " + name + "; salary - " + salary());
		
	}
	
	@Override
	int salary() {
		int s = 1000;
		return s;
		
	}

}

package practical_task_5;

public class Cat implements Animal{

	private String i;

	
	public Cat(String i) {
		this.i = i;
	}

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Cat " + i;
	}
	
	@Override
	public void voice() {
		System.out.println(toString() + " myav-myav");
		
	}

	@Override
	public void feed() {
		System.out.println(toString() + " cat feeding puppies");
		
	}
	
	

}

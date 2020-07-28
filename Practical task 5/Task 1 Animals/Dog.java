package practical_task_5;

public class Dog implements Animal{

private String i;
	

	public String getI() {
	return i;
}

	public void setI(String i) {
	this.i = i;
}

	public Dog(String i) {
		this.i = i;
	}
	
	@Override
	public String toString() {
		return "Dog " + i;
	}
	
    @Override
	public void voice() {
	   System.out.println(toString() + " woof-woof");
    }
   
    @Override
    public void feed() {
    	System.out.println(toString() + " dog feeding puppies");  
    }
}

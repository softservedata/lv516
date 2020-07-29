package homework5;

public class Eagle extends FlyingBird{

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("Bird - Eagle\n" + "1.Feathers: " + getFeathers() + " 2.Lay Eggs: " + getLayEggs());		
	}
}

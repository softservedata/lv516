package homework5;

public class Swallow extends FlyingBird{

	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	void fly() {
		System.out.println("Bird - Swallow\n" + "1.Feathers: " + getFeathers() + " 2.Lay Eggs: " + getLayEggs());
	}
}

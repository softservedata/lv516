package homework5;

public class Penguin extends NonFlyingBird{

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("Bird - Penguin\n" + "1.Feathers: " + getFeathers() + " 2.Lay Eggs: " + getLayEggs());
	}
}

package homework5;

public class Chicken extends NonFlyingBird{

	public Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("Bird - Chicken\n" + "1.Feathers: " + getFeathers() + " 2.Lay Eggs: " + getLayEggs());		
	}
}

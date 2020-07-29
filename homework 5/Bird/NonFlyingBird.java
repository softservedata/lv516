package homework5;

public abstract class NonFlyingBird extends Bird{

	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);

	}
	@Override
	void fly() {
		//System.out.println("No Fly");
		
	}
}

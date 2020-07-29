package homework5;

public abstract class FlyingBird extends Bird{

	@Override
	public String toString() {
		return "FlyingBird";
	}

	public FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		//System.out.println("Fly");
		
	}

}

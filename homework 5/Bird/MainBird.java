package homework5;
/*
 * Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
Develop classes FlyingBird and NonFlyingBird. 
Create class Eagle, Swallow, Penguin and Chicken. 
Create array Bird and add different birds to it. 
Call fly() method for all of it. 
Output the information about each type of created bird.

 */
public class MainBird {
	public static void main(String[] args) {
		
		Bird[] bird = new Bird [4];
		bird[0] = new Eagle ("red", "1 in week"); 
		bird[1] = new Swallow ("white", "2 in week");
		bird[2] = new Penguin ("black", "3 in week");
		bird[3] = new Chicken ("yellow", "4 in week");
		
		for (int i = 0; i < bird.length; i++) {
			bird[i].fly();
		}	
	}
}

package practical_task_5;
/*
 * Create interface Animal with methods voice() and feed(). 
 * Create two classes Cat and Dog, which implement this interface. 
 * Create array of Animal and add some Cats and Dogs to it. 
 * Call voice() and feed() method for all of it
 */
public class Main {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[4];
	    animals[0] = new Cat("Eve");
	    animals[1] = new Cat("Kit");
	    animals[2] = new Dog("Ave");
	    animals[3] = new Dog("Dot");

	    for (int i = 0; i < animals.length; i++) {
	        animals[i].voice();
	        animals[i].feed();
	    }
		
	}

}

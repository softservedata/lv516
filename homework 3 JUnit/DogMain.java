package homework3;



public class DogMain {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Aaa", Breed.HUSKY.name(), 1);
		Dog dog2 = new Dog("Bbb", Breed.LABRADOR.name(), 2);
		Dog dog3 = new Dog("Bbb", Breed.TERRIER.name(), 3);
		Dog dog4 = new Dog("Ccc", Breed.BULLDOG.name(), 4);
		
		System.out.println("Dogs:");
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());
		System.out.println(dog4.toString());
		
			
			if (dog1.getName().equalsIgnoreCase(dog2.getName())){
	            System.out.println("Two dogs with the same name: " + dog1.getName());
	        }
	        else if (dog1.getName().equalsIgnoreCase(dog3.getName())){
	            System.out.println("Two dogs with the same name: " + dog1.getName());
	        }
	        else if (dog1.getName().equalsIgnoreCase(dog4.getName())){
	            System.out.println("Two dogs with the same name: " + dog1.getName());
	        }
	        else if (dog2.getName().equalsIgnoreCase(dog3.getName())){
	            System.out.println("Two dogs with the same name: " + dog2.getName());
	        }
	        else if (dog2.getName().equalsIgnoreCase(dog4.getName())){
	            System.out.println("Two dogs with the same name: " + dog2.getName());
	        }
	        else if (dog3.getName().equalsIgnoreCase(dog4.getName())){
	            System.out.println("Two dogs with the same name: " + dog3.getName());
	        }
		}
	//how to add method to "Dog.java"
}

package homework4.Task2;

import homework4.Task2.Dog;

public class task2 {
    public static void main(String[] args) {
        for (Dog.Breed b : Dog.Breed.values()) {
            System.out.println(b);
        }
        int max = 0;
        Dog dog1 = new Dog("Sharik", "GermanShepherd", 6);
        Dog dog2 = new Dog("Bimbo", "Akita", 4);
        Dog dog3 = new Dog("Bars", "Boxer", 10);
        int[] arrDog = {dog1.age, dog2.age, dog3.age};
        for (int i : arrDog) {
            if (i > max) max = i;
        }
        if (max == dog1.age) {
            System.out.println("much oldest dog is " + dog1.name + " him breed is " + dog1.breed);
        } else if (max == dog2.age) {
            System.out.println("much oldest dog is " + dog2.name + " him breed is " + dog2.breed);
        } else if (max == dog3.age) {
            System.out.println("much oldest dog is " + dog3.name + " him breed is " + dog3.breed);

        }
        if (dog1.name.equalsIgnoreCase(dog2.name)){
            System.out.println( "dog1 and dog 2 have the same nickname");
        }
        else if (dog1.name.equalsIgnoreCase(dog3.name)){
            System.out.println("dog1 and dog 3 have the same nickname ");
        }
        else if (dog2.name.equalsIgnoreCase(dog3.name)){
            System.out.println("dog2 and dog 3 have the same nickname ");
        }
    }
    }





package com.softserve.homework3;

import java.util.ArrayList;
import java.util.List;

public class DogMain {
    public static void main(String[] args) {
        DogService dogService = new DogService();
        List<Dog> listDogs = new ArrayList<>();
        //
        listDogs.add(new Dog("Aaa", Breed.HUSKY.name(), 1));
        listDogs.add(new Dog("Bbb", Breed.LABRADOR.name(), 2));
        listDogs.add(new Dog("Bbb", Breed.TERRIER.name(), 3));
        listDogs.add(new Dog("Ccc", Breed.BULLDOG.name(), 4));
        listDogs.add(new Dog("BBb", Breed.BULLDOG.name(), 4));
        //
        System.out.println("All Dogs:");
        for (Dog dog : listDogs) {
            System.out.println(dog);
        }
        //
        /*-
        for (int i = 0; i < listDogs.size() - 1; i++) {
            for (int j = i + 1; j < listDogs.size(); j++) {
                if (listDogs.get(i).nameEquals(listDogs.get(j))) {
                    System.out.println("\nEquals name fouded:");
                    System.out.println(listDogs.get(i));
                    System.out.println(listDogs.get(j));
                }
            }
        }
        */
        System.out.println("SomeNameDog:" + dogService.getSomeNameDog(listDogs));
    }
}

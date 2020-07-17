package com.softserve.homework3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DogServiceTest {

    private List<Dog> getOnePairDogs() {
        List<Dog> listDogs = new ArrayList<>();
        //
        listDogs.add(new Dog("Aaa", Breed.HUSKY.name(), 1));
        listDogs.add(new Dog("Bbb", Breed.LABRADOR.name(), 2));
        listDogs.add(new Dog("Bbb", Breed.TERRIER.name(), 3));
        listDogs.add(new Dog("Ccc", Breed.BULLDOG.name(), 4));
        return listDogs;
    }

    @Test
    public void checkOnePair() {
        DogService dogService = new DogService();
        List<SomeNameDog> expected = new ArrayList<>();
        expected.add(new SomeNameDog(
                new Dog("Bbb", Breed.LABRADOR.name(), 2),
                new Dog("Bbb", Breed.TERRIER.name(), 3)));
        List<SomeNameDog> actual = dogService.getSomeNameDog(getOnePairDogs());
        Assert.assertEquals(expected, actual);
    }
}

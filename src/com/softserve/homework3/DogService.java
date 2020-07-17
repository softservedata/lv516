package com.softserve.homework3;

import java.util.ArrayList;
import java.util.List;

public class DogService {

    public List<SomeNameDog> getSomeNameDog(List<Dog> listDogs) {
        List<SomeNameDog> result = new ArrayList<>();
        //
        for (int i = 0; i < listDogs.size() - 1; i++) {
            for (int j = i + 1; j < listDogs.size(); j++) {
                if (listDogs.get(i).nameEquals(listDogs.get(j))) {
                    result.add(new SomeNameDog(listDogs.get(i), listDogs.get(j)));
                }
            }
        }
        return result;
    }
}

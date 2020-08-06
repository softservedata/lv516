package Homework7.task7_2;

import java.util.TreeMap;

public class Main7_2 {
    public static void main(String[] args) {
        MapTenPerson person = new MapTenPerson();
        person.personMap = new TreeMap<>();
        person.personMap.put("Orlik","Pasha");
        person.personMap.put("Bilogan","Oleg");
        person.personMap.put("Sukchiy","Dima");
        person.personMap.put("Koval","Vitalik");
        person.personMap.put("Moroz","Stepan");
        person.personMap.put("Meh","Andriy");
        person.personMap.put("Pudelko","Sviat");
        person.personMap.put("Nazumok","Igor");
        person.personMap.put("Bereza","Misha");
        person.personMap.put("Muzichka","Vova");
        System.out.println(person.personMap);
        person.delete();
        System.out.println(person.personMap);
    }
}

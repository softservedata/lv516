package Practicaltask7.Practicaltask7_2;

import java.util.TreeMap;

public class Main7_2 {
    public static void main(String[] args) {
        Audit aud = new Audit();
        aud.employeeMap = new TreeMap<>();

        aud.employeeMap.put(1,"Ivan");
        aud.employeeMap.put(2,"Mischa");
        aud.employeeMap.put(3,"Tanya");
        aud.employeeMap.put(4,"Ira");
        aud.employeeMap.put(5,"Igor");
        aud.employeeMap.put(6,"Anya");
        aud.employeeMap.put(7,"Masha");
        System.out.println(aud.employeeMap);
        aud.theSameName();
        aud.theSameKey();
    }
}

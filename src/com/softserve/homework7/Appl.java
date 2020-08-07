package com.softserve.homework7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Appl {

    Map<Integer, String> employeeMap;

    public Appl() {
        employeeMap = new HashMap<>();
        initEmployee();
    }

    private void initEmployee() {
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Petro");
        employeeMap.put(3, "Stepan");
        employeeMap.put(4, "Ihor");
        employeeMap.put(5, "Ira");
        employeeMap.put(6, "Oksana");
        employeeMap.put(7, "Natalya");
    }

    public boolean isContainsKey(int key) {
        return employeeMap.get(key) != null;
    }

    public boolean isContainsValue(String value) {
        boolean result = false;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value.trim())) {
                result= true;
                break;
            }
        }
        return result;
    }
    
    public int getIdByValue(String value) {
        if (!isContainsValue(value)) {
            throw new IllegalArgumentException("value: " + value + " not found");
        }
        int result = Integer.MIN_VALUE;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value.trim())) {
                result= entry.getKey();
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Appl appl = new Appl();
        Scanner sc = new Scanner(System.in);
        System.out.print("id = ");
        int id = sc.nextInt();
        if (appl.isContainsKey(id)) {
            System.out.println("id found");
            System.out.println("name = " + appl.employeeMap.get(id));
        } else {
            System.out.println("id not found");
        }
        //
        // Read Enter;
        sc.nextLine();
        System.out.print("Enter name = ");
        String name = sc.nextLine();
        if (appl.isContainsValue(name)) {
            System.out.println("name found");
            System.out.println("id = " + appl.getIdByValue(name));
        } else {
            System.out.println("name not found");
        }
        //appl.getIdByValue(name);
    }
}

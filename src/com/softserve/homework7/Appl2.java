package com.softserve.homework7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Appl2 {

    Map<String, String> employeeMap;

    public Appl2() {
        employeeMap = new HashMap<>();
        initEmployee();
    }

    private void initEmployee() {
        employeeMap.put("Ivanov", "Ivan");
        employeeMap.put("Petrov", "Petro");
        employeeMap.put("Stepanov", "Stepan");
        employeeMap.put("LastName2", "Ihor");
        employeeMap.put("LastName3", "Ira");
        employeeMap.put("LastName4", "Oksana");
        employeeMap.put("LastName5", "Natalya");
    }

    public boolean isContainsValue(String value) {
        boolean result = false;
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value.trim())) {
                result= true;
                break;
            }
        }
        return result;
    }
    
    public void deleteByValue(String value) {
        if (!isContainsValue(value)) {
            throw new IllegalArgumentException("value: " + value + " not found");
        }
        String result = null;
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value.trim())) {
                result= entry.getKey();
                break;
            }
        }
        employeeMap.remove(result);
    }
    
    public void printEmployee() {
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            System.out.println("LastName = " + entry.getKey() + "\t FirstName = " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        Appl2 appl = new Appl2();
        System.out.println("Original Map:");
        appl.printEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstname = ");
        String name = sc.nextLine();
        if (appl.isContainsValue(name)) {
            System.out.println("name found");
            appl.deleteByValue(name);
        } else {
            System.out.println("name not found");
        }
        System.out.println("Updated Map:");
        appl.printEmployee();
    }
}

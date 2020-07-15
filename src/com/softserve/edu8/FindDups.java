package com.softserve.edu8;

import java.util.HashSet;
import java.util.Set;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Emp(id=" + id + ", name=" + name + ")";
    }
}

public class FindDups {
    public static void main(String[] args) {
        /*-
        Set<String> s = new HashSet<>();
        //List<String> s = new LinkedList<>();
        for (int i = 0; i < args.length; i++) {
            if (!s.add(args[i])) {
                System.out.println("Duplicate detected: " + args[i]);
            }
        }
        System.out.println("Elements: " + s);
        */
        Set<Employee> s = new HashSet<>();
        s.add(new Employee(123, "Ivan"));
        s.add(new Employee(124, "Petro"));
        s.add(new Employee(123, "Ivan"));
        System.out.println("Employee: " + s);
    }
}

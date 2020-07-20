package com.softserve.edu8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {

    public static class ById implements Comparator<Employee> {
        @Override
        public int compare(Employee em1, Employee em2) {
            return em1.getId() - em2.getId();
        }
    }

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Employee employee) {
        return name.compareTo(employee.getName());
        // return id - employee.getId();
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
        // Set<Employee> s = new HashSet<>();
        Set<Employee> s = new TreeSet<>(new Employee.ById());
        boolean b;
        b = s.add(new Employee(123, "Ivan"));
        System.out.println("s.add(new Employee(123, \"Ivan\")) = " + b);
        b = s.add(new Employee(124, "Petro"));
        System.out.println("s.add(new Employee(124, \"Petro\")) = " + b);
        b = s.add(new Employee(123, "Ivan"));
        System.out.println("s.add(new Employee(123, \"Ivan\")) = " + b);
        // System.out.println("Employee: " + s);
        for (Employee current : s) {
            System.out.println("employee: " + current + "  hashCode():" + current.hashCode());
        }
    }
}

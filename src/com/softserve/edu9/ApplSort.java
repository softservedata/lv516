package com.softserve.edu9;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class MyComp implements Comparator<Object> {
    @Override
    public int compare(Object em1, Object em2) {
        return em1.hashCode() - em2.hashCode();
    }
}

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
        return "\nEmp(id=" + id + ", name=" + name + ")";
    }
}

public class ApplSort {
    public static void main(String[] args) {
        /*-
        int[] x = new int[10];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(10);
        }
        System.out.println("Original Array: " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
        //
        //
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(15, "Vasya"));
        list.add(new Employee(2, "Anna"));
        list.add(new Employee(40, "Alina"));
        System.out.println("Origin: " + list);
        //
        //list.sort(new Employee.ById());
        // Collections.sort(list);
        Collections.sort(list, new Employee.ById());
        //
        for (Employee employee : list) {
            System.out.print(employee);
        }
        //
        //
        //Set<Employee> set = new TreeSet<>(new Employee.ById());
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee(15, "Vasya"));
        set.add(new Employee(2, "Anna"));
        set.add(new Employee(40, "Alina"));
        System.out.println(set);
        */
        Map<Object, String> map = new HashMap<>();
        // Map<Object, String> map = new TreeMap<>(new MyComp());
        map.put("key1", "one");
        map.put(new Object(), "two");
        map.put(1, "3");
        map.put(new Object(), "three");
        System.out.println("map = " + map);
        //
        System.out.println("First");
        for (Map.Entry<Object, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
        map.remove(1);
        System.out.println("Second");
        for (Iterator<Map.Entry<Object, String>> i = map.entrySet().iterator(); i.hasNext();) {
            Map.Entry<Object, String> entry = i.next();
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }

    }
}

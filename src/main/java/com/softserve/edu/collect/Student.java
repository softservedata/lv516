package com.softserve.edu.collect;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    
    public static class ByNameId implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            int result = st1.getName().compareTo(st2.getName());
            if (result == 0) {
                result = st1.getId() - st2.getId();
            }
            return result;
        }
    }
    
    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return -st1.getName().compareTo(st2.getName());
        }
    }
    
    public static class ById implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getId() - st2.getId();
        }
    }
    
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        // add code
        return name;
    }

    public void setName(String name) {
        // add code
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return getName().compareTo(student.getName());
    }
    
    @Override
    public String toString() {
        return "\nStudent [id=" + id 
                + ", name=" + name
                + "]";
    }

}

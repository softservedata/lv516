package com.softserve.edu5;

class Student { // POJO, BEAN, DTO
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) 
                || (getClass() != obj.getClass())) {
            return false;
        }
        Student other = (Student) obj;
        if ((age != other.age)
                || ( (name == null) && (other.name != null) )
                || ( (name != null) && (other.name == null) ) ) {
            return false;
        } else if ( (name == null) && (other.name == null) ) {
            return true;
        }
        return name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}


public class AppComp {
    public static void main(String[] args) {
        //
        Student student1 = new Student("Ira", 25);
        Student student2 = new Student("Ira", 25);
        System.out.println("student1 == student2 : " + (student1 == student2) );
        System.out.println("student1.equals(student2) : " + student1.equals(student2));
        System.out.println("student1.hashCode() = " + student1.hashCode());
        System.out.println("student2.hashCode() = " + student2.hashCode());
        //
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}

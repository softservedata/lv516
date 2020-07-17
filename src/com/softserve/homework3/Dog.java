package com.softserve.homework3;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = true;
        if (this == obj) {
            return true;
        }
        if ((obj == null) 
                || (getClass() != obj.getClass())) {
            return false;
        }
        Dog other = (Dog) obj;
        //
        if ((age != other.age) 
               || ((breed == null) && (other.breed != null))
               || ((breed != null) && (other.breed == null))
               || ((name == null) && (other.name != null))
               || ((name != null) && (other.breed == null))) {
            return false;
        }
        if (breed != null) {
            result = result && breed.equals(other.breed);
        }
        if (name != null) {
            result = result && name.equals(other.name);
        }
        return result;
    }

    public boolean nameEquals(Object obj) {
        System.out.println("class Dog: nameEquals(...)");
        boolean result = true;
        if (this == obj) {
            return true;
        }
        if ((obj == null) 
                || (getClass() != obj.getClass())) {
            return false;
        }
        Dog other = (Dog) obj;
        //
        if (((name == null) && (other.name != null))
               || ((name != null) && (other.breed == null))) {
            return false;
        }
        if (name != null) {
            result = result && name.equalsIgnoreCase(other.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name 
                + ", breed=" + breed 
                + ", age=" + age + "]";
    }    
    
    
}

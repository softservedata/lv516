package com.softserve.homework3;

public class SomeNameDog {
    private Dog dog1;
    private Dog dog2;
    
    public SomeNameDog(Dog dog1, Dog dog2) {
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public Dog getDog1() {
        return dog1;
    }

    public Dog getDog2() {
        return dog2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dog1 == null) ? 0 : dog1.hashCode());
        result = prime * result + ((dog2 == null) ? 0 : dog2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("class SomeNameDog: equals(...)");
        boolean result = true;
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        SomeNameDog other = (SomeNameDog) obj;
        //
        if ((dog1 == null) && (other.dog1 != null)
               || (dog1 != null) && (other.dog1 == null)
               || (dog2 == null) && (other.dog2 != null)
               || (dog2 != null) && (other.dog2 == null)) {
                return false;
        }
        if (dog1 != null) {
            result = result && dog1.nameEquals(other.dog1);
        }
        if (dog2 != null) {
            result = result && dog2.nameEquals(other.dog2);
        }
        return result;
    }
    
    @Override
    public String toString() {
        return "\nSomeNameDog [dog1=" + dog1.toString()
                + ", dog2=" + dog2.toString()
                + "\n]";
    }
    
}

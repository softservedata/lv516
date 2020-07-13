public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String checkName(String n1, String n2, String n3)
    {
        if(n1.equals(n2)||n1.equals(n3)||n2.equals(n3)) return ("There are dogs with the same name.");
        else return ("There are no dogs with the same name.");
    }

    public String oldestDog(Dog d1, Dog d2, Dog d3)
    {
        int max = -2147483648;
        String kind="", nameD="";
        if(d1.age>max)
        {
            max = d1.age;
            kind = d1.breed;
            nameD = d1.name;
        }
        if(d2.age>max)
        {
            max = d2.age;
            kind = d2.breed;
            nameD = d2.name;
        }
        if(d3.age>max)
        {
            max = d3.age;
            kind = d3.breed;
            nameD = d3.name;
        }
        return ("Oldest dog is "+nameD+", "+kind);
    }
}
    enum breeds
    {
        Afador, Akita, Auggie, Barbet, Beagle, Bocker, Bolognese, Borzoi, Bulldog, Chug, Gollie, Horgi, Labradane,
        Maltese, Mutt, Poodle, Pug, Puli, Whoodle;
    }


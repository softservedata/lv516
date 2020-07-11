package homework4.Task2;

public class Dog {
    public enum Breed{
        GermanShepherd,Akita,LabradorRetriever,Boxer
    }
    protected String name;
    protected String breed;
    protected int age;

    public Dog(String name,String breed,int age){
        this.name=name;
        this.breed= breed;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", breed='" + breed + '\'' + ", age=" + age + '}';
    }

    public void output(){
        System.out.println(toString());
    }

}

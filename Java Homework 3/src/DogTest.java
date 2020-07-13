import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog d1 = new Dog("Boo", breeds.Bulldog.name(), 12);
    Dog d2 = new Dog("Steven", breeds.Akita.name(), 7);
    Dog d3 = new Dog("Clark", breeds.Horgi.name(), 9);

    @Test
    public void oldestDog() { assertTrue(d1.oldestDog(d1,d2,d3).equals("Oldest dog is Boo, Bulldog"));}

    @Test
    public void checkName(){ assertTrue(d1.checkName(d1.name, d2.name, d3.name).equals("There are no dogs with the same name."));}
}
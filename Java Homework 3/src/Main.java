import org.junit.runner.JUnitCore;

public class Main {
        public static void main(String[] args) {

            //Task 1
            System.out.println("Task 1");
            Read test = new Read();
            test.inputFloat();
            test.checkFloat();
            test.inputInt();
            test.maxMin();
            test.httpName();

            //Task 2
            System.out.println("Task 2");
            Dog d1 = new Dog("Boo", breeds.Bulldog.name(), 12);
            Dog d2 = new Dog("Steven", breeds.Akita.name(), 7);
            Dog d3 = new Dog("Clark", breeds.Horgi.name(), 9);
            System.out.println("Dogs:");
            System.out.println(d1.name+", "+d1.breed+", "+d1.age+" years old.");
            System.out.println(d2.name+", "+d2.breed+", "+d2.age+" years old.");
            System.out.println(d3.name+", "+d3.breed+", "+d3.age+" years old.");
            System.out.println(d1.checkName(d1.name, d2.name, d3.name));
            System.out.println(d1.oldestDog(d1,d2,d3));

            //Test Dog
            DogTest testD = new DogTest();
            testD.oldestDog();
            testD.checkName();

        }
    }

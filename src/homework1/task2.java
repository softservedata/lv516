package homework1;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Як тебе звати?");
        String name = in.nextLine();
        System.out.println("В якому місті ти живеш, " + name + "?");
        String city = in.nextLine();
        System.out.println(name + " живе у місті " + city );
    }
}
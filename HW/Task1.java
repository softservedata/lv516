/* Программа для вычисления периметра
и площади клубы с цветами

 */
import java.util.Scanner;

public class Task1 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String arg[])
    {
            System.out.println("Input radius: ");
            double radius = sc.nextDouble();
            double ar = Math.PI * (radius * radius);
            double per = Math.PI * 2 * radius;
            System.out.println("Area is: " + ar);
            System.out.println("Perimeter is: " + per);
    }
}

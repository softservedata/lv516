import java.util.Scanner;
public class Task3 {
    public static void main (String arg[])
    {
        Scanner scn = new Scanner(System.in);
        double c1,c2,c3;
        double t1,t2,t3;
        double count, count1, count2, count3;
        System.out.println("Input call cost ($/minute):");
        c1 = scn.nextDouble();
        c2 = scn.nextDouble();
        c3 = scn.nextDouble();
        System.out.println("Input time call (minute):");
        t1 = scn.nextDouble();
        t2 = scn.nextDouble();
        t3 = scn.nextDouble();
        count1 = c1 * t1;
        count2 = c2 * t2;
        count3 = c3 * t3;
        System.out.println("First call cost: " + count1);
        System.out.println("Second call cost: " + count2);
        System.out.println("third call cost: " + count3);
        count = count1 + count2 + count3;
        System.out.println("Total: " + count + "$");


    }
}

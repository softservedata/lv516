package homework1;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ціна за хвилину з Польщі");
        double unitsForPoland =in.nextDouble();
        System.out.println("Ціна за хвилину з Німеччини");
        double unitsForGerman = in.nextDouble();
        System.out.println("Ціна за хвилину з Англії");
        double unitsForEngland = in.nextDouble();
        System.out.println("Тривалість першого дзвінка");
        int duration1=in.nextInt();
        System.out.println("Тривалість другого дзвінка");
        int duration2= in.nextInt();
        System.out.println("Тривалість третього дзвінка");
        int duration3 = in.nextInt();
        double priseForPoland = unitsForPoland*(double)duration1;
        double  priseForGerman = unitsForGerman*(double)duration2;
        double  priseForEngland = unitsForEngland * (double) duration3;
        double priseAllCalls = priseForEngland+priseForGerman+priseForPoland;
        System.out.println("вартість  дзвінка з Польщі = " + priseForPoland);
        System.out.println("вартість  дзвінка з Німеччини = " + priseForGerman);
        System.out.println("вартість  дзвінка з Англії = " + priseForEngland);
        System.out.println("вартість всіх  дзвінків = " + priseAllCalls);
    }
}
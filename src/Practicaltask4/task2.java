package Practicaltask4;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of the day of the week  -");
        int nubmer = sc.nextInt();
        switch (nubmer){
            case 1:
                System.out.println("Monday");
                System.out.println("Понеділок");
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("Вівторок");
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("Середа ");
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("Четвер");
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("П'ятниця");
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Субота ");
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("Неділя");
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("there are no such days of the week0");
        }
    }
}

package Homework5.Task5_1;
import java.util.Scanner;
public class Function {
    private int numberOfMonth;

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    public void setNumberOfMonth(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    int [] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
public void input(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of month from 1 to 12");
    numberOfMonth = sc.nextInt();
}
public void MonthSelection(){
    switch (numberOfMonth){
        case 1:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
    break;
        case 2:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 3:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 4:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 5:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 6:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 7:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 8:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
            case 9:
                System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 10:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 11:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;
        case 12:
            System.out.println("This month have " + arr[--numberOfMonth] + " days");
            break;

    }
}
}

import java.util.Scanner;

public class Month {
    int monthNum;
    Scanner sc = new Scanner(System.in);
    private int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};


    public void enterNum()
    {
        System.out.println("Enter the number of month: ");
        monthNum =sc.nextInt();
    }

    public void daysAmount(int number)
    {
        for(int i=0;i<month.length;i++)
        {
            if(number == i+1) System.out.println("Amount of days in this month: "+month[i]);
        }
    }
}

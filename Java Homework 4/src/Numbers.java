import java.util.Scanner;

public class Numbers {
    private int ten[]= new int[10];
    private int five[] = new int[5];
    Scanner sc = new Scanner(System.in);

    public void enterTen()
    {
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<ten.length;i++)
        {
            System.out.print((i+1)+") "); //Entering 10 numbers
            ten[i] = sc.nextInt();
        }
    }

    public void sumOrProduct()
    {
        int kolPos=0, sum=0, prod=1;
        for(int i=0; i<ten.length/2; i++)
        {
            if(ten[i]>0)
            {
                kolPos++;
                sum+=ten[i];
            }
        }
        if(kolPos==5) {
            System.out.println("First 5 elements are positive.");
            System.out.println("Their sum = " + sum);
        }
        else
        {
            if(kolPos==0) System.out.println("First 5 elements are negative.");
            else System.out.println("First 5 elements are not all positive.");
            for(int i=ten.length/2;i<ten.length;i++)
            {
                prod = prod *ten[i];
            }
            System.out.println("Product of last 5 elements = "+prod);
        }
    }

    public void enterFive()
    {
        System.out.println("Enter 5 numbers: ");
        int  evenProd =1, posSecPos=0, amountEven=0;
        int kolPos=0, min = 2147483647, minPos=0;
        for(int i=0;i<five.length;i++)
        {
            System.out.print((i+1)+") ");//Entering 5 numbers
            five[i] = sc.nextInt();
            if(five[i]%2==0)
            {
                amountEven++; // Counting even numbers
                evenProd *=five[i];
            }
            if(five[i]<min) //min number
            {
                min = five[i];
                minPos = i+1;
            }
            if(five[i]<0) break; //Organizing entering integers until the first negative number.
            if(five[i]>0) kolPos++; //counting positive numbers
            if(kolPos==2) posSecPos=i+1; //position of second positive number.
        }
        if(posSecPos==0) System.out.println("There is no second positive number.");
        else System.out.println("Position of second positive number is "+posSecPos);
        if(amountEven==0)  System.out.println("There are no even numbers.");
        else System.out.println("Product of all entered even numbers = "+evenProd);
        System.out.println("Minimum number is "+min+", its position is "+minPos);
    }


}

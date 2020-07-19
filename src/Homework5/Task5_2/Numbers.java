package Homework5.Task5_2;
import java.util.Scanner;
public class Numbers {
    int [] arr = new int [10];
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        arr[0] =sc.nextInt();
        System.out.println("Enter the second number");
        arr[1] =sc.nextInt();
        System.out.println("Enter the third number");
        arr[2] =sc.nextInt();
        System.out.println("Enter the fourth number");
        arr[3] =sc.nextInt();
        System.out.println("Enter the fifth number");
        arr[4] =sc.nextInt();
        System.out.println("Enter the sixth number");
        arr[5] =sc.nextInt();
        System.out.println("Enter the seventh number");
        arr[6] =sc.nextInt();
        System.out.println("Enter the eighth number");
        arr[7] =sc.nextInt();
        System.out.println("Enter the ninth number");
        arr[8] =sc.nextInt();
        System.out.println("Enter the tenth number");
        arr[9] =sc.nextInt();
    }
    public void Calculate(){
        int sum = 0;
        if (arr[0]>0 && arr[1]>0 && arr[2]>0 && arr[3]>0 && arr[4]>0){
            sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
            System.out.println(sum);
        }
        if (arr[5]<0 && arr[6]<0 && arr[7]<0 && arr[8]<0 && arr[9]<0){
            sum = arr[5] + arr[6] + arr[7] + arr[8] + arr[9];
            System.out.println(sum);
        }
        else {
            System.out.println("none of the conditions to be executed");
        }

    }
}

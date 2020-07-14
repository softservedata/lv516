package Practicaltask5.Task5_1;
import java.util.Scanner;
public class Arrays {

    int [] arr = new int[10] ;
    int big = arr[0];
    public void bigest (){
        for (int i = 0;i<arr.length;i++){
        if (big<arr[i]){
            big = arr[i];
                    }
        }
        System.out.println("The biggest number of array(arr) is  " + big);
    }


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
    public void positiveNumberSum(){
        int sum = 0;
        for (int i = 0 ;i<arr.length;i++){
            if (arr[i]>0){
                sum=sum+arr[i];
            }
        }
        System.out.println("The sum positive number = " + sum);
    }
    public void amountNegativeNumber(){
        int neg = 0;
        for (int i = 0 ;i<arr.length;i++){
            if (arr[i]<0){
                neg++;

            }
        }
        System.out.println("the amount of negative numbers = " + neg);
    }
}
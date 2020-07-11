package Practicaltask4;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        int odd =0;
        int [] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firs number");
        arr[0] =sc.nextInt();
        System.out.println("Enter second number");
        arr[1] =sc.nextInt();
        System.out.println("Enter third number");
        arr[2] =sc.nextInt();
        for (int i : arr){
            if ((i%2)==0){
                odd++;
            }
        }
        if (odd==1){
            System.out.println("You enterd " + odd+ " odd number");
        }
        else if (odd == 0){
            System.out.println("You didn`t enterd odd nubmer");
        }
        else {
            System.out.println("You enterd " + odd+ " odd numbers");
        }
}
}

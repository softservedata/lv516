package Homework5.Task5_3;
import javafx.scene.control.IndexRange;

import java.awt.im.spi.InputMethodDescriptor;
import java.util.Scanner;
public class Position {
    int[] arr = new int[5];

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        arr[0] = sc.nextInt();
        System.out.println("Enter the second number");
        arr[1] = sc.nextInt();
        System.out.println("Enter the third number");
        arr[2] = sc.nextInt();
        System.out.println("Enter the fourth number");
        arr[3] = sc.nextInt();
        System.out.println("Enter the fifth number");
        arr[4] = sc.nextInt();
    }

    public void checkSecond() {
        int fitsPositive = 0;
        int secondPositive = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                fitsPositive = arr[i];
                break;
            }
        }
           for (int j = 1; j < arr.length; j++) {
                if ( arr[j] != fitsPositive && arr[j]>0) {
                    secondPositive = arr[j];
                    pos = j;
                    break;
                }
            }

        System.out.println("The second positive number of the arr = " + secondPositive + " its position is " + pos);
    }

public void checkMin(){
        int pos = 0;
        int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
            pos = i;
        }
    }
    System.out.println("Minimum of the arr is = " + min + " Its position is " + pos);
}
public void OddAndSum(){
        int odd = 0;
        for(int i = 0;i<arr.length;i++){
            if ((arr[i] % 2)== 0) {
                odd++;
            }
        }
    System.out.println("In array is " + odd + " odd number");
}
}

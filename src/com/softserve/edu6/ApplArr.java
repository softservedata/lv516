package com.softserve.edu6;

import java.util.Arrays;

public class ApplArr {
    public static void main(String[] args) {
        /*-
        // int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // int monthDays[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        // };
        int[] monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        //
        //for (int i = 0; i < monthDays.length; i++) {
        //    System.out.println("monthDays[" + i + "]=" + monthDays[i]);
        //}
        //
        System.out.print("[ ");
        for (int current : monthDays) {
            //System.out.println("monthDays =" + current);
            System.out.print(current + " ");
        }
        System.out.println("]");
        //
        //System.out.println(monthDays);
        System.out.println(Arrays.toString(monthDays));
        //
        int number = 10;
        //        while (number <= 5) {
        //            System.out.println(number);
        //            number++;
        //        }
        do {
            System.out.println(++number);
        } while (number <= 5);
        //
        System.out.println("done number = " + number);
        //
        int[] numbers = {5, 6, 8, 3, 5, 7, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
            System.out.println(i);
        }
        //System.out.println(i); // error
        //
        //
        int[] workHours = { 8, 6, 8, 7, 7 };
        //
        for (int i = 0; i < workHours.length; i++) {
            System.out.print(workHours[i] + "  ");
        }
        System.out.println();
        //
        for (int h : workHours) {
            System.out.print(h+ "  ");
        }
        //
        //
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean isRunning = true;
        for (int i = 0; isRunning && (i < 5); i++) {
            System.out.print("Input number = ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                // break;
                isRunning = false;
            }
            if (isRunning) {
                System.out.println("n = " + n);
            }
        }
        System.out.println("done");
        sc.close();
        //
        //
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean isRunning = true;
        for (int i = 0; i < 5; i++) {
            isRunning = true;
            System.out.print("Input number = ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                //continue;
                isRunning = false;
            }
            if (isRunning) {
                System.out.println("n = " + n);
            }
        }
        System.out.println("done");
        sc.close();
        //
        //
        int[] arr = { 2, -5, 7, -4, 8, 0 };
        //
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        //
        int product = 1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                product = product * arr[i];
            }
        }
        System.out.println("Product = " + product);
        //
        int amount = 0;
        for (int a : arr) {
            if ((a > 0) && (a <= 7)) {
                amount++;
            }
        }
        System.out.println("Amount = " + amount);
        //
        //int max = Integer.MIN_VALUE;
        int max = arr[0];
        int imax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");
        */
        boolean isBreake = false;
        int temp;
        int[] arr = { 2, -5, 7, -4, 8, 0, -1, 6 };
        System.out.println("Original array = " + Arrays.toString(arr));
        //
        for (int i = 0; (!isBreake) && (i < arr.length - 1); i++) {
            isBreake = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isBreake = false;
                }
            }
            //if (isBreake) {
            //    break;
            //}
        }
        System.out.println("Sorted array = " + Arrays.toString(arr));
    }
}

package com.softserve.edu9;

public class ApplContent {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 1, 2, 2, 3, 3, 4, 4, 1, 1, 1, 2, 3 };
        int[] arr2 = { 2, 1, 4, 1, 2, 3 };
        //
        boolean isEqual = false;
        for (int i = 0; i < arr1.length; i++) {
            isEqual = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isEqual = true;
                    break;
                }
            }
            if (!isEqual) {
                break;
            }
        }
        //
        if (isEqual) {
            for (int i = 0; i < arr2.length; i++) {
                isEqual = false;
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        isEqual = true;
                        break;
                    }
                }
                if (!isEqual) {
                    break;
                }
            }
        }
        //
        /*-
        boolean isEqual = true;
        for (int i = 0; isEqual && (i < arr1.length); i++) {
        isEqual = false;
        for (int j = 0; !isEqual && (j < arr2.length); j++) {
            isEqual = arr1[i] == arr2[j];
        }
        }
        //
        if (isEqual) {
        for (int i = 0; isEqual && (i < arr2.length); i++) {
            isEqual = false;
            for (int j = 0; !isEqual && (j < arr1.length); j++) {
                isEqual = arr2[i] == arr1[j];
            }
        }
        }
        */
        System.out.println("isEqual = " + isEqual);
    }
}

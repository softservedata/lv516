package com.softserve.edu10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplRead {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        try {
            System.out.print("n = ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("k = ");
            int k = Integer.parseInt(br.readLine());
            res = n / k;
//        } catch (IOException e) {
        } catch (NumberFormatException | IOException e) {
            System.out.println("NumberFormatException | IOException");
//            System.out.println("IOException");
            System.out.println("Message =  " + e.getMessage());
//            // Loggin, print user friendly message ...
        }
//        catch (NumberFormatException e) {
//          System.out.println("NumberFormatException");
//          System.out.println("Message =  " + e.getMessage());
//        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            //System.exit(0); // Stop
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
            }
        }
        System.out.println("res = " + res);
    }
}
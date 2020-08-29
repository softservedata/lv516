import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Thread1 t1 = new Thread1();
        t1.run();
        Thread2 t2 = new Thread2();
        t2.run();
        Thread3 t3 = new Thread3();
        t3.run();

        //Task 2
           /* DeadThread1 dt1 = new DeadThread1();
            DeadThread2 dt2 = new DeadThread2();*/

        //Task 3
        threadOne th1 = new threadOne();
        th1.run();

        //Task 4
        String fileName = "D:/Programming/Java SoftSetve/Java Homework 9/file1.txt"; //114 words
        FileWriter outFile;
        try {
            outFile = new FileWriter("D:/Programming/Java SoftSetve/Java Homework 9/file2.txt");

            Scanner sc = new Scanner(new File(fileName));
            List<String> lines = new ArrayList<String>();
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
            String[] arr = lines.toArray(new String[0]);
            int len=0;
            String longestLine = "";
            for(int i=0;i<arr.length;i++) {
                if(arr[i].length()>len) {
                    len=arr[i].length();
                    longestLine = arr[i];
                }
            }
            outFile.write("Number of lines in file1.txt. = "+ arr.length+"\n");
            outFile.write("The longest line in file1.txt.: " + longestLine+"\n");
            outFile.write("Liza, 26.01.2002");
            outFile.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("File Write Error: " + fileName);
        }

    }
}

    class threadOne extends Thread {
        public void run() {
            threadTwo t2 = new threadTwo();
            t2.run();
        }
    }

    class threadTwo extends Thread {
        public void run() {
            for (int i = 0; i < 3; i++) System.out.println("Thread number two");
            threadThree t3 = new threadThree();
            t3.run();
        }
    }


    class threadThree extends Thread{
        public void run(){
            for(int i=0;i<5;i++) System.out.println("Thread number three");
        }
    }
        /*
        public synchronized String expectation()
        {
            return "Expectation completed";
        }
    }


    class DeadThread1 extends Thread{
        Main m1;
        @Override
        public void run(){
            System.out.println(m1.expectation());
        }
    }

    class DeadThread2 extends Thread{
        Main m1;
        @Override
        public void run(){
            System.out.println(m1.expectation());

    }*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Task 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sen = sc.nextLine();
        String senWords[] = sen.split("\\W");
        int numLetters = 0;
        String secondW = "";

        String longest = "";
        for(int i=0;i<senWords.length;i++)
        {
            if(senWords[i].length()>longest.length()) {
                longest = senWords[i];
                numLetters = senWords[i].length();
            }
            if(i==1) secondW = senWords[i];
        }
        System.out.println("The longest word is "+longest);
        System.out.println("The number of its letters = " + numLetters);
        StringBuilder st = new StringBuilder(secondW);
        System.out.println("The second word in reverse order is "+st.reverse());

        //Task 2
        System.out.println("Enter a sentence that contains the words between more than one space:");
        String line = sc.nextLine();
        System.out.println("Result: "+ new String(line).trim().replaceAll("\\s{2,}", " "));

        //Task 3
        UScurrency us = new UScurrency();
        us.patternMatch();
    }

}

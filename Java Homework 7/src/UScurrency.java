import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UScurrency {

    public void patternMatch()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter US currency:");
        String currency = sc.nextLine();
        Pattern p = Pattern.compile("\\$\\d*\\.\\d{2}");
        Matcher m = p.matcher(currency);

        if(m.matches()) System.out.println("Matches the entire text string");
        m.reset();
        System.out.println();
        while (m.find()) {
            System.out.print(currency.substring(m.start(), m.end()) + "*");
        }


    }
}

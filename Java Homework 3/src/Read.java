import java.util.Scanner;

public class Read {
    float fNum1, fNum2, fNum3;
    int iNum1, iNum2, iNum3;
    Scanner sc = new Scanner(System.in);
    int httpError;

    public void inputFloat()
    {
        System.out.println("Enter first float number:");
        fNum1 = sc.nextFloat();
        System.out.println("Enter second float number:");
        fNum2 = sc.nextFloat();
        System.out.println("Enter third float number:");
        fNum3 = sc.nextFloat();
    }

    public void checkFloat()
    {
        if(fNum1>=-5&&fNum1<=5) System.out.println("First number belongs to the range [-5,5]");
        else System.out.println("First number doesn't belong to the range [-5,5]");
        if(fNum2>=-5&&fNum2<=5) System.out.println("Second number belongs to the range [-5,5]");
        else System.out.println("Second number doesn't belong to the range [-5,5]");
        if(fNum3>=-5&&fNum3<=5) System.out.println("Third number belongs to the range [-5,5]");
        else System.out.println("Third number doesn't belong to the range [-5,5]");
    }

    public void inputInt()
    {
        System.out.println("Enter first int number:");
        iNum1 = sc.nextInt();
        System.out.println("Enter second int number:");
        iNum2 = sc.nextInt();
        System.out.println("Enter third int number:");
        iNum3 = sc.nextInt();
    }

    public void maxMin()
    {
        int min = 2147483647;
        int max = -2147483648;
        if(iNum1<min) min=iNum1;
        if(iNum2<min) min=iNum2;
        if(iNum3<min) min=iNum3;

        if(iNum1>max) max=iNum1;
        if(iNum2>max) max=iNum2;
        if(iNum3>max) max=iNum3;
        System.out.println("Max int number is "+max+"; Min int number is "+min+";");
    }

    public void httpName()
    {
        System.out.println("Enter tne number of HTTP Error:");
        httpError = sc.nextInt();
        if(httpError==400) System.out.println("Bad Request");
        else if(httpError==401) System.out.println("Unauthorized");
        else if(httpError==402) System.out.println("Payment Required");
        else if(httpError==403) System.out.println("Forbidden");
        else if(httpError==404) System.out.println("Not Found");
        else if(httpError==405) System.out.println("Method Not Allowed");
        else if(httpError==406) System.out.println("Not Acceptable");
        else if(httpError==407) System.out.println("Proxy Authentication Required");
        else if(httpError==408) System.out.println("Request Timeout");
        else if(httpError==409) System.out.println("Conflict");
        else if(httpError==410) System.out.println("Gone");
        else if(httpError==411) System.out.println("Length Required");
        else if(httpError==412) System.out.println("Precondition Failed");
        else if(httpError==413) System.out.println("Payload Too Large");
        else if(httpError==414) System.out.println("URI Too Long");
        else if(httpError==415) System.out.println("Unsupported Media Type");
        else if(httpError==416) System.out.println("Range Not Satisfiable");
        else if(httpError==417) System.out.println("Expectation Failed");
        else if(httpError==418) System.out.println("I'm a teapot");
        else if(httpError==421) System.out.println("Misdirected Request");
        else if(httpError==422) System.out.println("Unprocessable Entity");
        else if(httpError==423) System.out.println("Locked");
        else if(httpError==424) System.out.println("Failed Dependency");
        else if(httpError==425) System.out.println("Too Early");
        else if(httpError==426) System.out.println("Upgrade Required");
        else if(httpError==428) System.out.println("Precondition Required");
        else if(httpError==429) System.out.println("Too Many Requests");
        else if(httpError==431) System.out.println("Request Header Fields Too Large");
        else if(httpError==451) System.out.println("Unavailable For Legal Reasons");
        else System.out.println("There is no such error!");
    }


}

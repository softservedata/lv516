import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);
     String type;
     int yearOfProd;
     int certainYear;
     int engineCap;
    //private int years[] = new int [4];

    public Car(String type, int engineCap, int yearOfProd)
    {
        this.type = type;
        this.engineCap = engineCap;
        this.yearOfProd = yearOfProd;
    }

    public int enterYear()
    {
        System.out.println("Enter certain model year of "+type+" with engine capacity ="+engineCap+": ");
        certainYear = sc.nextInt();
        return certainYear;
    }

    public void sort(int []arr, String []info)
    {
        int tmp;
        String tmpInfo;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    tmpInfo = info[i];
                    arr[i] = arr[j];
                    info[i]= info[j];
                    arr[j] = tmp;
                    info[j] = tmpInfo;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+") "+ arr[i]+", "+info[i]);
        }
    }

}

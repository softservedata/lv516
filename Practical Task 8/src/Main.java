import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args)
    {
        //Task 1
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        try{
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();
            System.out.println("The area of rectangle = "+rec.squareRectangle(a,b));
        }
        catch (MyException e)
        {
            System.out.println("MyException. Message: "+e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println("InputMismatchException. Message = "+e.getMessage());
        }

        //Task 2
        try {
            System.out.println("Enter amount of plants you want to add to array:");
            int kol = sc.nextInt();
            Plant[] plants = new Plant[kol];
            for(int i=0;i<kol;i++)
            {
                System.out.println("Enter the plant type "+(i+1)+" :");
                String type = sc.next();
                System.out.print("");

                System.out.println("Enter the color of plant "+(i+1)+" :");
                String color = sc.next();
                System.out.println("Enter the size of plant "+(i+1)+" :");
                int size = sc.nextInt();
                Plant pl = new Plant(type, color, size);
                plants[i] = pl;
            }
           for(int i=0;i<plants.length;i++)
           {
               System.out.println(plants[i]);
           }
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }

        sc.close();
    }
}

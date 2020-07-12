import java.util.Scanner;
import java.lang.Enum;

public class Main {
    public static  void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1");
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        System.out.println(Odd(a,b,c) +" of them are odd");

        System.out.println("Task 2");
        System.out.println("Enter the number of the day of the week:");
        int day = sc.nextInt();
        Lang(day);

        System.out.println("Task 3");
        System.out.println("Enter the name of the country:");
        String con = sc.next();
        WhichContinent(con);

        System.out.println("Task 4");
        Product pr1 = new Product();
        System.out.println("Product 1");
        pr1.Enter();
        Product pr2 = new Product();
        System.out.println("Product 2");
        pr2.Enter();
        Product pr3 = new Product();
        System.out.println("Product 3");
        pr3.Enter();
        Product pr4 = new Product();
        System.out.println("Product 4");
        pr4.Enter();

        int []prices={pr1.price, pr2.price, pr3.price, pr4.price};
        String []names = {pr1.name, pr2.name, pr3.name, pr4.name};
        int []quantity = {pr1.quantity, pr2.quantity, pr3.quantity, pr4.quantity};
        System.out.println(pr1.MaxPrice(prices, names));
        System.out.println(pr1.BiggestQuan(quantity, names));

        sc.close();
    }

    public static int Odd(int a, int b, int c)
    {
        int kol=0;
        if(a%2!=0) kol++;
        if(b%2!=0) kol++;
        if(c%2!=0) kol++;
        return kol;
    }

    public static void Lang(int day)
    {
        if(day==1) System.out.println("Monday, Понеділок, Lunedi");
        else if(day==2) System.out.println("Tuesday, Вівторок, Martedì");
        else if(day==3) System.out.println("Wednesday, Середа, Mercoledì");
        else if(day==4) System.out.println("Thursday, Четвер, Giovedi");
        else if(day==5) System.out.println("Friday, П'ятниця, Venerdì");
        else if(day==6) System.out.println("Saturday, Субота, Sabato");
        else if(day==7) System.out.println("Sunday, Неділя, Domenica");
        else System.out.println("Incorrect number was entered!");
    }

    public static void WhichContinent(String name)
    {
        if(name.equals("Nigeria")|| name.equals("Ethiopia")||name.equals("Egypt")||name.equals("Tanzania")||name.equals("South Africa")||name.equals("Kenya")||name.equals("Sudan"))
        {
            Continent continent = Continent.Africa;
            System.out.println(continent.ContName());
        }
        else if(name.equals("Russia")||name.equals("Ukraine")||name.equals("France")||name.equals("Spain")||name.equals("Sweden")||name.equals("Norway")||name.equals("Germany")||name.equals("Finland")||name.equals("Poland")||name.equals("Italy"))
        {
            Continent continent = Continent.Europe;
            System.out.println(continent.ContName());
        }
        else if(name.equals("China")||name.equals("India")||name.equals("Indonesia")||name.equals("Pakistan")||name.equals("Bangladesh")||name.equals("Japan")||name.equals("Philippines"))
        {
            Continent continent = Continent.Asia;
            System.out.println(continent.ContName());
        }
        else if(name.equals("Australia")||name.equals("New Zeland"))
        {
            Continent continent = Continent.Australia;
            System.out.println(continent.ContName());
        }
        else if(name.equals("USA")||name.equals("America"))
        {
            Continent continent = Continent.America;
            System.out.println(continent.ContName());
        }
    }
}
    enum Continent{
        Europe{ public String ContName(){return "Continent: Europe";}
        },
        Asia{ public String ContName(){return "Continent: Asia";}
        },
        Africa{ public String ContName(){return "Continent: Africa";}
        },
        Australia{ public String ContName(){return "Continent: Australia";}
        },
        America{ public String ContName(){return "Continent: America";}
        };
        public abstract String ContName();
    }


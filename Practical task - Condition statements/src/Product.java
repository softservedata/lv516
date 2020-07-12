import java.util.Scanner;

    public class Product {
        String name;
        int price;
        int quantity;

        public void Enter()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name: ");
            name = sc.nextLine();
            System.out.println("Enter price:");
            price = sc.nextInt();
            System.out.println("Enter quantity:");
            quantity = sc.nextInt();
        }

        public String MaxPrice(int[] price, String[] name)
        {
            int max =0;
            String maxName="";
            for(int i=0;i<price.length;i++) {
                    if (price[i] > max) {
                        max = price[i];
                        maxName = name[i];
                }
            }
            return ("Max price is "+max+" of "+maxName);
        }

        public String BiggestQuan(int[] quan, String[] name)
        {
            int max =0;
            String maxName="";
            for(int i=0;i<quan.length;i++) {
                if (quan[i] > max) {
                    max = quan[i];
                    maxName = name[i];
                }
            }
            return ("Max quantity is "+max+" of "+maxName);
        }
    }

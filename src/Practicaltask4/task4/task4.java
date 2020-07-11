package Practicaltask4.task4;

public class task4 {
    public static void main(String[] args) {
      int max=0;
      int max2=0;
       Product product1=new Product("apple",10,51);
        Product product2=new Product("pear",14,74);
        Product product3=new Product("porridge",25,37);
        Product product4=new Product("chips",78,46);
       int [] arr = {product1.price,product2.price,product3.price,product4.price};
        for (int i : arr) {
            if (i > max) max = i;
        }
        if (max==product1.price){
            System.out.println("more expensive items is " +product1.name+ " It`s  " + product1.quantity + "  pieces");
        }
        else if(max == product2.price){
            System.out.println("more expensive items is " +product2.name+ " It`s  " + product2.quantity + "  pieces");
        }
        else if (max == product3.price){
            System.out.println("more expensive items is " +product3.name+ " It`s  " + product3.quantity + "  pieces");
        }
        else if (max==product4.price){
            System.out.println("more expensive items is " +product4.name+ " It`s  " + product4.quantity + "  pieces");
        }
        int [] arr2 = {product1.quantity,product2.quantity,product3.quantity,product4.quantity};
        for (int i : arr2) {
            if (i > max2) max2 = i;
        }
            if (max2==product1.quantity){
                System.out.println(product1.name  +  " has the biggest quantity = "+ product1.quantity);
            }
            else if(max2 == product2.quantity){
                System.out.println(product1.name  +  " has the biggest quantity = "+ product2.quantity);
            }
            else if (max2 == product3.quantity){
                System.out.println(product1.name  +  " has the biggest quantity = " + product3.quantity);
            }
            else if (max2==product4.quantity){
                System.out.println(product1.name  +  " has the biggest quantity = " + product4.quantity);
            }

    }
    }



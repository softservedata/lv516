package Practicaltask7.Practicaltask7_1;

import java.util.*;

public class Main7_1 {


    public static void main(String[] args) {
        List<Integer> MyCollection= new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter second number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter third number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter fourth number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter fifth number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter sixth number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter seventh number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter eighth number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter ninth number");
        MyCollection.add(sc.nextInt());
        System.out.println("Enter tenth number");
        MyCollection.add(sc.nextInt());
        System.out.println("MyCollection" + MyCollection);
        List <Integer> newCollection = new ArrayList<>();
        for (Integer current : MyCollection){
            if (current>5){
                newCollection.add(MyCollection.indexOf(current));
            }
        }
        System.out.println("newCollection" + newCollection);
      Iterator <Integer> iterator = MyCollection.iterator();
      while (iterator.hasNext()){
          int current = iterator.next();
          if (current>20){
              iterator.remove();
          }
      }
        System.out.println("MyCollection number littlest than 20" + MyCollection);
      MyCollection.add(2,1);
      MyCollection.add(5,-4);
      MyCollection.add(8,-3);
        Iterator <Integer> iterator1= MyCollection.iterator();
        while (iterator1.hasNext()){
            int current = iterator1.next();
            System.out.println("position - " + MyCollection.indexOf(current) + " value of element - " + current);;
        }
        Collections.sort(MyCollection);
        System.out.println("Sorted collection" + MyCollection);
    }

    }


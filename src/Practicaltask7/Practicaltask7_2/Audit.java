package Practicaltask7.Practicaltask7_2;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Audit {
    Scanner sc = new Scanner(System.in);
    Map<Integer,String> employeeMap = new TreeMap<>();
    public void theSameKey(){
        System.out.println("Enter Id please ");
        int id = sc.nextInt();
        for (Map.Entry<Integer,String> entry : employeeMap.entrySet()){
            if (entry.getKey() == id){
                System.out.println("The name under this Id is - " + entry.getValue());
                }
            }
        }
        public void theSameName(){
            System.out.println("Enter a name ");
            String name = sc.nextLine();
            if(employeeMap.containsValue(name) != true){
                System.out.println("This name is not");
            }
            else{
                System.out.println("this name is");
            }


         //   for (Map.Entry<Integer,String> entry : employeeMap.entrySet()){
           //     if (entry.getValue().equalsIgnoreCase(name)){
                    //System.out.println("The id`s this name is :"+ entry.getKey());

        }
                }
       // }
       // }





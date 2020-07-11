package homework4.Task1;
import java.util.Scanner;
public class readclass {
    private int number1;
    private int number2;
    private int number3;

    public int getNumber1() {
        if (number1<-5 || number1>5){
            System.out.println("your number1 is too large or too small,the number must be between -5 and 5,enter another number");

    }
        return number1;
    }

    public void setNumber1(int number1) {
           this.number1=number1;
    }


    public int getNumber2() {
        if (number2<-5 || number2>5){
            System.out.println("your number2 is too large or too small,the number must be between -5 and 5,enter another number");

        }
        return number2;
    }


    public void setNumber2(int number2) {
            this.number2 =number2;
    }

    public int getNumber3() {
        if (number3<-5 || number3>5){
            System.out.println("your number3 is too large or too small,the number must be between -5 and 5,enter another number");

        }
        return number3;
    }
    public void setNumber3(int number3) {
        this.number3=number3;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first nubmer");
        number1 = sc.nextInt();
        System.out.println("Enter second nubmer");
        number2 = sc.nextInt();
        System.out.println("Enter third nubmer");
        number3 = sc.nextInt();
    }
    public void output(){
        System.out.println("number3 =  " + getNumber1());
        System.out.println("number3 =  " + getNumber2());
        System.out.println("number3 =  " + getNumber3());
    }

    public void max() {
        int max = number1;
            if (number2 > max){
                max = number2;
}
            else if (number3>max){
                max=number3;
}
        System.out.println(max + "  is the largest number");
    }
public void min(){
    int min = number1;
    if (min > number2){
        min = number2;
    if (min > number3){
        min = number3;
    }
    }
    System.out.println(min + "  is the smallest number");
}

}

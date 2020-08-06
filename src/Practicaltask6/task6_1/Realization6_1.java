package Practicaltask6.task6_1;

public class Realization6_1 {
    public static void main(String[] args) {
        Animal [] arr = new Animal[6];
        arr[0] = new Dog();
        arr[1] = new Dog();
        arr[2] = new Cat();
        arr[3] = new Dog();
        arr[4] = new Cat();
        arr[5] = new Cat();
        for (int i = 0;i<arr.length;i++){
            arr[i].voice();
            arr[i].feed();
        }

    }
}

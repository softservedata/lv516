package Practicaltask5.Task5_2;
import java.util.Scanner;
public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;
    int [] arr = new  int [5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;

    }
public void inputDepartment(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter  department number");
        departmentNumber = sc.nextInt();
}
public void arrange(){
        int tmp;
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

}

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", departmentNumber=" + departmentNumber + ", salary=" + salary + '}';
    }
}

package Practicaltask5.Task5_2;

public class Method {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vasyl",1000);
        employee1.inputDepartment();
        System.out.println(employee1.toString());
        Employee employee2 = new Employee("Ivan",1800);
        employee2.inputDepartment();
        System.out.println(employee2.toString());
        Employee employee3 = new Employee("Taras",3000);
        employee3.inputDepartment();
        System.out.println(employee3.toString());
        Employee employee4 = new Employee("Misha",1500);
        employee4.inputDepartment();
        System.out.println(employee4.toString());
        Employee employee5 = new Employee("Igor",1250);
        employee5.inputDepartment();
        System.out.println(employee5.toString());
        employee1.arr = new int[5];
        employee1.arr[0] = employee1.getSalary();
        employee1.arr[1] = employee2.getSalary();
        employee1.arr[2] = employee3.getSalary();
        employee1.arr[3] = employee4.getSalary();
        employee1.arr[4] = employee5.getSalary();
        employee1.arrange();
    }
}

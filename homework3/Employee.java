package homework3;
import java.util.Scanner;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int  rate) {
        this.rate = rate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private String name;
    private int  rate;
    private int hour;


    public Employee(){

    }
    public Employee(String name,int  rate){
        this.name=name;
        this.rate=rate;
    }
    public Employee(String name,int rate,int hour){
        this.name=name;
        this.rate=rate;
        this.hour=hour;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee employee1 = new Employee();
        System.out.println("Введіть ім'я першого робітника - ");
        employee1.name = sc.nextLine();
        System.out.println("Введіть ставку першого робітника - ");
        employee1.rate = sc.nextInt();
        System.out.println("Введіть робочі години першого робітника - ");
        employee1.hour = sc.nextInt();
        Employee employee2 = new Employee("Vasya",200);
        System.out.println("Введіть робочі години другого робітника - ");
        employee2.hour=sc.nextInt();
        Employee employee3 = new Employee("Oleg",300,100);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Salary employee1 =" + employee1.getSalery());
        System.out.println("Salary employee2 =" + employee2.getSalery());
        System.out.println("Salery employee3 =" + employee3.getSalery());
        System.out.println("Bonuses emloyee1 =" + employee1.getBonuses());
        System.out.println("Bonuses emloyee2 =" + employee2.getBonuses());
        System.out.println("Bonuses emloyee3 =" + employee3.getBonuses());
        System.out.println("Зарплата всіх працівників без бонусів=" + (employee1.getSalery()+employee2.getSalery()+employee3.getSalery()));
        System.out.println("Зарплата всіх працівників з бонусами=" + (employee1.getSalery()+employee2.getSalery()+employee3.getSalery()+employee1.getBonuses()+employee2.getBonuses()+employee3.getBonuses()));
    }


    public double getSalery(){

        return rate*hour;
    }
    public double getBonuses() {
        return getSalery() * 0.1;
    }
    public double getAllSalary(){
        return getSalery();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hour=" + hour +
                '}';
    }
}


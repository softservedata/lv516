import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        SalariedEmployee employee1 = new SalariedEmployee(1297, "Steven", "123-196-1355");
        SalariedEmployee employee2 = new SalariedEmployee(8513, "Elisabeth", "972-377-1321");
        SalariedEmployee employee3 = new SalariedEmployee(4121, "John","862-712-6383");
        ContractEmployee employee4 = new ContractEmployee(9712, "Stefany", "972-131-562");
        ContractEmployee employee5 = new ContractEmployee(312, "Steve", "937-461-852");

        System.out.println("Employees: ");
        System.out.println("Id: "+employee1.employeeId+", Name: "+employee1.name+", Social Security Number: "+employee1.socialSecurityNumber);
        System.out.println("Id: "+employee2.employeeId+", Name: "+employee2.name+", Social Security Number: "+employee2.socialSecurityNumber);
        System.out.println("Id: "+employee3.employeeId+", Name: "+employee3.name+", Social Security Number: "+employee3.socialSecurityNumber);
        System.out.println("Id: "+employee4.employeeId+", Name: "+employee4.name+", Federal Tax Id: "+employee4.federalTaxIdmember);
        System.out.println("Id: "+employee5.employeeId+", Name: "+employee5.name+", Federal Tax Id: "+employee5.federalTaxIdmember);

        System.out.println("Enter number of worked hours of "+employee1.name+":");
        employee1.numberHoursWorked = sc.nextInt();
        System.out.println("Enter hourly rate of "+ employee1.name+": ");
        int sal1 = employee1.calculatePay(sc.nextInt());
        System.out.println("Salary of "+employee1.name+" = "+ sal1+"$");

        System.out.println("Enter number of worked hours of "+employee2.name+":");
        employee2.numberHoursWorked = sc.nextInt();
        System.out.println("Enter hourly rate of "+ employee2.name+": ");
        int sal2 = employee2.calculatePay(sc.nextInt());
        System.out.println("Salary of "+employee2.name+" = "+ sal2+"$");

        System.out.println("Enter number of worked hours of "+employee3.name+":");
        employee3.numberHoursWorked = sc.nextInt();
        System.out.println("Enter hourly rate of "+ employee3.name+": ");
        int sal3 = employee3.calculatePay(sc.nextInt());
        System.out.println("Salary of "+employee3.name+" = "+ sal3+"$");

        System.out.println("Enter fixed monthly payment of "+employee4.name+":");
        int sal4 = employee4.calculatePay(sc.nextInt());
        System.out.println("Salary of "+employee4.name+" = "+ sal4+"$");

        System.out.println("Enter fixed monthly payment of "+employee5.name+":");
        int sal5 = employee5.calculatePay(sc.nextInt());
        System.out.println("Salary of "+employee5.name+" = "+ sal5+"$");

        int salary[] = {sal1,sal2,sal3,sal4,sal5};
        String info[] = {"Id: "+employee1.employeeId+", Name: "+employee1.name, "Id: "+employee2.employeeId+", Name: "+employee2.name, "Id: "+employee3.employeeId+", Name: "+employee3.name, "Id: "+employee4.employeeId+", Name: "+employee4.name, "Id: "+employee5.employeeId+", Name: "+employee5.name};


        System.out.println("List of salaries: ");
        int tmp;
        String tmpInfo;
        for (int i = 0; i < salary.length - 1; i++) {
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i] < salary[j]) {
                    tmp = salary[i];
                    tmpInfo = info[i];
                    salary[i] = salary[j];
                     info[i]= info[j];
                    salary[j] = tmp;
                    info[j] = tmpInfo;
                }
            }
        }

        for (int i = 0; i < salary.length; i++) {
            System.out.println((i+1)+") "+info[i]+", Salary = "+ salary[i]+"$");
        }

    }
}

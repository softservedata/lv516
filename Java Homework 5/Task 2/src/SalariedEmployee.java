public class SalariedEmployee extends Employee implements Interface{
    public String socialSecurityNumber;
    int numberHoursWorked;

    public SalariedEmployee(int employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int calculatePay(int hourlyRate) {
       return (hourlyRate*numberHoursWorked);
    }
}

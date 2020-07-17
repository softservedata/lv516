public class ContractEmployee extends Employee implements Interface {
    public String federalTaxIdmember;

    public ContractEmployee(int employeeId, String name, String federalTaxIdmember) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int calculatePay(int fixedPay) {
        return fixedPay;
    }
}

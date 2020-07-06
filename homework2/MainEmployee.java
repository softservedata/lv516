package homework2;

public class MainEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Olya");
		emp1.setRate(4);
		emp1.setHours(100);
		emp1.getSalary();
		System.out.println(emp1.toString());

		Employee emp2 = new Employee("Oleh", 5);
		emp2.setHours(120);
		emp2.getSalary();
		System.out.println(emp2.toString());


		Employee emp3 = new Employee("Olesya", 6, 150);
		emp3.getSalary();
		System.out.println(emp3.toString());

		System.out.println("Total employees " + Employee.getTotalEmp() + "\nTotal salary " + Employee.getTotalSum());
	}
}

package Q3;

public class Test {
	public static void main(String[] args) {

        Employee contractor = new Contractor("contractor", 12, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
    }

}

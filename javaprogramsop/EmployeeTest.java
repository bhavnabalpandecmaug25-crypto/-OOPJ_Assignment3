
class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double getNetSalary() {
        return basicSalary;
    }
}


class RegularEmployee extends Employee {
    public RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getNetSalary() {
        return basicSalary + (0.10 * basicSalary); // HRA 10%
    }
}


class ContractEmployee extends Employee {
    public ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getNetSalary() {
        return basicSalary + (0.05 * basicSalary); // Allowance 5%
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        RegularEmployee emp1 = new RegularEmployee("Rahul", 20000);
        ContractEmployee emp2 = new ContractEmployee("Riya", 15000);

        System.out.println(emp1.name + " Net Salary = " + emp1.getNetSalary());
        System.out.println(emp2.name + " Net Salary = " + emp2.getNetSalary());
    }
}
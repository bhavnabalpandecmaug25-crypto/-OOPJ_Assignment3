abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) { this.name = name; this.id = id; }
    abstract double calculateSalary();
}
interface BonusEligible {
    double calculateBonus();
}
class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary, hra;
    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }
    double calculateSalary() { return basicSalary + hra; }
    public double calculateBonus() { return calculateSalary() * 0.10; }
}
class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary() { return hourlyRate * hoursWorked; }
}
public class EmployeeManagementTest {
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee("Amit", 1, 50000, 5000);
        ContractEmployee c1 = new ContractEmployee("Neha", 2, 300, 100);
        System.out.println(p1.name + " Salary = " + (int)p1.calculateSalary() + ", Bonus = " + (int)p1.calculateBonus());
        System.out.println(c1.name + " Salary = " + (int)c1.calculateSalary());
    }
}

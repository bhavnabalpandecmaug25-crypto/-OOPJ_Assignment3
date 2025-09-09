abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus() {
        return salary * 0.10;
    }
}

public class BonusTest {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);
        System.out.println(m.name + " Bonus = " + m.calculateBonus());
        System.out.println(d.name + " Bonus = " + d.calculateBonus());
    }
}

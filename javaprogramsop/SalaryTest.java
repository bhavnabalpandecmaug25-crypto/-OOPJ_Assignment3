class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println(name + " Total Salary = " + salary);
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void displaySalary() {
        double total = salary + (salary * 0.20);
        System.out.println(name + " Total Salary = " + total);
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void displaySalary() {
        double total = salary + (salary * 0.10);
        System.out.println(name + " Total Salary = " + total);
    }
}

public class SalaryTest {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);
        m.displaySalary();
        d.displaySalary();
    }
}
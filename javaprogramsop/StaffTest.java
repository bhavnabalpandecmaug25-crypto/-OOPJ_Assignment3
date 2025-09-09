class Staff {
    protected String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class TeachingStaff extends Staff {
    private String subject;

    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    public void display() {
        System.out.println(name + " → " + subject + ", " + salary);
    }
}

class NonTeachingStaff extends Staff {
    private String department;

    public NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void display() {
        System.out.println(name + " → " + department + ", " + salary);
    }
}

public class StaffTest {
    public static void main(String[] args) {
        TeachingStaff t = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff n = new NonTeachingStaff("Ramesh", 40000, "Admin");

        t.display();
        n.display();
    }
}
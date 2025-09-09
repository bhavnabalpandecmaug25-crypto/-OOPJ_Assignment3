class Employee {
    
    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setAge(17); 
        System.out.println("Age = " + e1.getAge());

        e1.setAge(25); 
        System.out.println("Age = " + e1.getAge());
    }
}

class Student {
    
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    
    public int getMarks() {
        return marks;
    }

   
    public static void main(String[] args) {
        Student s1 = new Student();

       
        s1.setMarks(85);
        System.out.println("Marks = " + s1.getMarks());

       
        s1.setMarks(120); // should give error
        System.out.println("Marks = " + s1.getMarks());
    }
}
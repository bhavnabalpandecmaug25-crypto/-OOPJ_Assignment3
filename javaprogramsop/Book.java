class Book {
  
    private int copiesAvailable;

    public void addCopies(int n) {
        if (n > 0) {
            copiesAvailable += n;
        } else {
            System.out.println("Invalid number of copies to add.");
        }
    }

    
    public void removeCopies(int n) {
        if (n > 0 && n <= copiesAvailable) {
            copiesAvailable -= n;
        } else {
            System.out.println("Not enough copies to remove!");
        }
    }

   
    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public static void main(String[] args) {
        Book b1 = new Book();

        b1.addCopies(3);   
        b1.removeCopies(1); 

        System.out.println("Copies available = " + b1.getCopiesAvailable());
    }
}
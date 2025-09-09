class Book {
    private int bookId;
    private String title;
    private String author;
    public Book(int bookId, String title, String author) {
        this.bookId = bookId; this.title = title; this.author = author;
    }
}
abstract class LibraryMember {
    int memberId;
    String name;
    LibraryMember(int memberId, String name) { this.memberId = memberId; this.name = name; }
    abstract void borrowBook(int count);
}
interface Notifyable {
    void sendNotification(String message);
}
class StudentMember extends LibraryMember implements Notifyable {
    StudentMember(int memberId, String name) { super(memberId, name); }
    void borrowBook(int count) { System.out.println("StudentMember " + name + " borrowed " + count + " books"); }
    public void sendNotification(String message) { System.out.println("Notification sent to " + name + ": " + message); }
}
class FacultyMember extends LibraryMember implements Notifyable {
    FacultyMember(int memberId, String name) { super(memberId, name); }
    void borrowBook(int count) { System.out.println("FacultyMember " + name + " borrowed " + count + " books"); }
    public void sendNotification(String message) { System.out.println("Notification sent to " + name + ": " + message); }
}
public class LibraryTest {
    public static void main(String[] args) {
        StudentMember s = new StudentMember(1, "Amit");
        FacultyMember f = new FacultyMember(2, "Prof. Singh");
        s.borrowBook(2);
        f.borrowBook(4);
        s.sendNotification("Return books within 7 days");
        f.sendNotification("Return books within 14 days");
    }
}

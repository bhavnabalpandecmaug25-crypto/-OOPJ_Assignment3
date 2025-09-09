interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}
class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}
public class PaymentGatewayTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        p1.pay(2500);
        p2.pay(1500);
    }
}
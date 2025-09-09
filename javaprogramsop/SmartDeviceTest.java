interface Callable {
    void makeCall(String number);
}
interface Messaging {
    void sendMessage(String number, String message);
}
interface Internet {
    void browse(String website);
}
class SmartPhone implements Callable, Messaging, Internet {
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }
    public void browse(String website) {
        System.out.println("Browsing website: " + website);
    }
}
public class SmartDeviceTest {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall("9876543210");
        sp.sendMessage("9876543210", "Hello!");
        sp.browse("www.google.com");
    }
}

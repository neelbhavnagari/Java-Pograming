interface sendNotification {
    void sendNotification(String message);
}

class EmailNotifier implements sendNotification {
    public void sendNotification(String message) {
        System.out.println("📧 Sending email: " + message);
    }
}

class SMSNotifier implements sendNotification {
    public void sendNotification(String message) {
        System.out.println("📱 Sending SMS: " + message);
    }
}

public class InterfaceExample4 {
    public static void main(String[] args) {
        sendNotification emailNotifier = new EmailNotifier();
        sendNotification smsNotifier = new SMSNotifier();

        emailNotifier.sendNotification("Hello from Email!");
        smsNotifier.sendNotification("Hello from SMS!");
    }
}

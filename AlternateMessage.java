class MessageThread extends Thread {
    String msg;
    int n;

    MessageThread(String msg, int n) {
        this.msg = msg;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class AlternateMessage {
    public static void main(String[] args) {
        MessageThread t1 = new MessageThread("Hello", 5);
        MessageThread t2 = new MessageThread("Welcome", 5);

        t1.start();
        t2.start();
    }
}

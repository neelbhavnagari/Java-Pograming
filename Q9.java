class First extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Second extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Wear Mask!");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Third extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Use Sanitizer!");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        First f1 = new First();
        Second s2 = new Second();
        Third t3 = new Third();

        f1.start();
        s2.start();
        t3.start();
    }
}

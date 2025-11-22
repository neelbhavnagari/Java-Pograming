public class Runneble {
    public static void main(String[] args) {

        Task1 t1 = new Task1();

        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        // t1.start();
        // t2.start();
        // t3.start();
        Thread th1 = new Thread(t1); // wrap Runnable inside Thread
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();

        try {
            th1.join();
        } catch (InterruptedException e) {
            System.out.print("Error" + e);

        }
        th2.start();
        try {
            th2.join();
        } catch (InterruptedException e) {
            System.out.print("Error" + e);

        }
        th3.start();

    }

}

class Task1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The code is print " + i);
        }
    }
}

class Task2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The code is print " + i + 1);
        }
    }
}

class Task3 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The code is print " + i + 2);
        }
    }
}

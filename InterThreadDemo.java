class SharedResource {
    private boolean available = false;

    synchronized void produce() {
        System.out.println("Producer started...");
        try {
            Thread.sleep(1000);
            available = true;
            System.out.println("Item produced.");
            notify();
        } catch (Exception e) {
        }
    }

    synchronized void consume() {
        System.out.println("Consumer waiting...");
        while (!available) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Item consumed!");
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        Thread producer = new Thread(() -> sr.produce());
        Thread consumer = new Thread(() -> sr.consume());

        consumer.start();
        producer.start();
    }
}

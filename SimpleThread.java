import java.util.Scanner;

class A extends Thread {
	int no;

	A(int no) {
		this.no = no;
	}

	public void run() {
		System.out.println("Starting thread: " + Thread.currentThread().getName());
		for (int i = 0; i < no; i++) {
			try {
				Thread.sleep(300); // delay for visibility
				System.out.println(Thread.currentThread().getName() + " number: " + i);
			} catch (Exception e) {
				System.out.println("Error occurred: " + e);
			}
		}
		System.out.println("End of thread: " + Thread.currentThread().getName());
	}
}

public class SimpleThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int no = sc.nextInt();

		A objA = new A(no);
		objA.start(); // ✅ start the thread properly

		// Optionally, join to wait until it completes
		try {
			objA.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

		System.out.println("Main thread finished.");
		sc.close();
	}
}

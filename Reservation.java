import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        gmail g = new gmail();
        showticket sw = new showticket();

        g.start();
        try {

            g.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        sw.start();

    }
     
}

class gmail extends Thread {
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Gmail ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Password: ");
            sc.nextLine();

            System.out.println("Login Successful for " + email);

        } catch (Exception e) {
            System.out.println("Error in Gmail thread: " + e);
        }
    }

}

class showticket extends Thread {
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Passenger Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Source Station: ");
            String source = sc.nextLine();

            System.out.print("Enter Destination Station: ");
            String dest = sc.nextLine();

            System.out.print("Enter Number of Tickets: ");
            int tickets = sc.nextInt();

            System.out.println("\nBooking Confirmed!");

            System.out.println("Passenger Name : " + name);
            System.out.println("From           : " + source);
            System.out.println("To             : " + dest);
            System.out.println("Tickets Booked : " + tickets);

        } catch (Exception e) {
            System.out.println("Error in Ticket thread: " + e);
        }
    }
}

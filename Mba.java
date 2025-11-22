class bookTicket {
    int total_seat = 10;

    synchronized void book_seat(int seat) {
        if (total_seat >= seat) {
            System.out.println(seat + "Seat book sucessfully ");
            total_seat = total_seat - seat;
            System.out.println(seat + "Seat left ");

        } else {
            System.out.println("Seat cannot be booked");
        }
    }
}

class Mba extends Thread {
    static bookTicket b;
    int seat;

    public void run() {
        b.book_seat(seat);
    }

    public static void main(String[] args) {
        b = new bookTicket();

        Mba deepak = new Mba();
        deepak.seat = 7;
        deepak.start();
        Mba Abhi = new Mba();
        Abhi.seat = 3;
        Abhi.start();
    }
}

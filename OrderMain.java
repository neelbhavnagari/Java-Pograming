import java.util.*;

abstract class Order {
    int id;
    String description;
    double billAmount;

    Order(int id, String description, double billAmount) {
        this.id = id;
        this.description = description;
        this.billAmount = billAmount;
    }

    abstract void accept();

    abstract void display();
}

class PurchaseOrder extends Order {
    String vendorName;

    PurchaseOrder(int id, String description, double billAmount, String vendorName) {
        super(id, description, billAmount);
        this.vendorName = vendorName;
    }

    @Override
    void accept() {
        // Already accepted in constructor
    }

    @Override
    void display() {
        System.out.println("Purchase Order ID: " + id +
                ", Desc: " + description +
                ", Vendor: " + vendorName +
                ", Bill: " + billAmount);
    }
}

// SalesOrder subclass
class SalesOrder extends Order {
    String customerName;

    SalesOrder(int id, String description, double billAmount, String customerName) {
        super(id, description, billAmount);
        this.customerName = customerName;
    }

    @Override
    void accept() {

    }

    @Override
    void display() {
        System.out.println("Sales Order ID: " + id +
                ", Desc: " + description +
                ", Customer: " + customerName +
                ", Bill: " + billAmount);
    }
}

// Main Class
public class OrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PurchaseOrder[] purchases = new PurchaseOrder[5];
        SalesOrder[] sales = new SalesOrder[5];

        // Input Purchase Orders
        System.out.println("Enter 5 Purchase Orders:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Description: ");
            String desc = sc.nextLine();
            System.out.print("Enter Vendor Name: ");
            String vendor = sc.nextLine();
            System.out.print("Enter Bill Amount: ");
            double bill = sc.nextDouble();
            purchases[i] = new PurchaseOrder(id, desc, bill, vendor);
        }

        // Input Sales Orders
        System.out.println("Enter 5 Sales Orders:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Description: ");
            String desc = sc.nextLine();
            System.out.print("Enter Customer Name: ");
            String customer = sc.nextLine();
            System.out.print("Enter Bill Amount: ");
            double bill = sc.nextDouble();
            sales[i] = new SalesOrder(id, desc, bill, customer);
        }

        Arrays.sort(purchases, (a, b) -> Double.compare(b.billAmount, a.billAmount));

        Arrays.sort(sales, (a, b) -> Double.compare(b.billAmount, a.billAmount));

        System.out.println("\nTop 2 Purchase Orders:");
        purchases[0].display();
        purchases[1].display();

        System.out.println("\nTop 2 Sales Orders:");
        sales[0].display();
        sales[1].display();

        sc.close();
    }
}

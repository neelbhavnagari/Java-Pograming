import java.util.Scanner;

class OrderException extends Exception {
    public OrderException(String s) {
        super(s);
    }
}

abstract class Order {
    int member_id;
    String desc;
    int billAmount = 0;

    Order(int member_id,
            String desc,
            int billAmount) {
        this.member_id = member_id;
        this.desc = desc;
        this.billAmount = billAmount;
    }

    // abstract void accept();

    abstract void display();
}

class PurchaseOrder extends Order {

    String V_name;

    PurchaseOrder(int member_id,
            String desc, int billAmount, String V_name) throws OrderException {
        super(member_id, desc, billAmount);
        if (billAmount > 100) {
            throw new OrderException("invalid");
        }
        this.V_name = V_name;
    }

    void display() {

        System.out.println("Id" + member_id);
        System.out.println("Vname" + V_name);
        System.out.println("desecription" + desc);
        System.out.println("BillAmount" + billAmount);
    }
}

class SalesOrder extends Order {
    String C_name;

    SalesOrder(int member_id,
            String desc,
            int billAmount, String C_name) throws OrderException {
        super(member_id, desc, billAmount);
        if (billAmount > 200) {
            throw new OrderException("invalid");
        }
        this.C_name = C_name;
    }

    public void display() {

        System.out.println("Id" + member_id);
        System.out.println("Vname" + C_name);
        System.out.println("desecription" + desc);
        System.out.println("BillAmount" + billAmount);
    }

}

public class FinalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PurchaseOrder[] purchase = new PurchaseOrder[5];
        SalesOrder[] Sales = new SalesOrder[5];
        System.out.print("Enter the Sales ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the id");
            int member_id = sc.nextInt();
            System.out.println("Enter the description");
            String desecription = sc.next();
            System.out.println("Enter the Bill");
            int billAmount = sc.nextInt();
            System.out.println("Enter the VG_name");
            String V_name = sc.next();
            try {
                purchase[i] = new PurchaseOrder(member_id, desecription, billAmount, V_name);

            } catch (OrderException e) {
                System.out.println(e.getMessage());
            }

        }
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the id");
            int member_id = sc.nextInt();
            System.out.println("Enter the description");
            String desecription = sc.next();
            System.out.println("Enter the Bill");
            int billAmount = sc.nextInt();
            System.out.println("Enter the C_name");
            String C_name = sc.next();
            try {
                Sales[i] = new SalesOrder(member_id, desecription, billAmount, C_name);
            } catch (OrderException e) {
                System.out.println(e.getMessage());

            }
        }

        for (int i = 0; i < 5; i++) {
            purchase[i].display();
            Sales[i].display();
        }
    }

}

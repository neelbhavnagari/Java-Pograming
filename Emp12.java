import java.util.Scanner;

abstract class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void accept(Scanner sc);

    abstract void display();
}


class Manager extends Employee {
    int m_no;

    Manager(int id, String name, int m_no) {
        super(id, name);
        this.m_no = m_no;
    }

   
    void accept(Scanner sc) {
        System.out.print("Enter Manager ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Manager Name: ");
        name = sc.nextLine();
        System.out.print("Enter Manager Phone No: ");
        m_no = sc.nextInt();
    }

   
    void display() {
        System.out.println("\n--- Manager Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone No: " + m_no);
    }
}

class Worker extends Employee {
    int w_hour;

    Worker(int id, String name, int w_hour) {
        super(id, name);
        this.w_hour = w_hour;
    }

    void accept(Scanner sc) {
        System.out.print("Enter Worker ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Worker Name: ");
        name = sc.nextLine();
        System.out.print("Enter Worker Hours: ");
        w_hour = sc.nextInt();
    }


    void display() {
        System.out.println("\n-Worker Details -");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Working Hours: " + w_hour);
    }
}

public class Emp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager(0, "", 0);
        m.accept(sc);
        m.display();

        Worker w = new Worker(0, "", 0);
        w.accept(sc);
        w.display();

      
    }
}

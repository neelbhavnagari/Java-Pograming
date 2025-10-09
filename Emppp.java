import java.util.Scanner;

class Member {
    int emp_id;
    String emp_name;
    String emp_class;
    String designation;

    Member(int emp_id, String emp_name, String emp_class, String designation) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_class = emp_class;
        this.designation = designation;
    }

    void display() {
        System.out.println("Emp ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Class: " + emp_class);
        System.out.println("Designation: " + designation);
    }
}

public class Emppp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Member[] Emp4 = new Member[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");

            System.out.print("Enter emp no: ");
            int emp_id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter emp name: ");
            String emp_name = sc.next();

            System.out.print("Enter class name (Class1/class2 /class3): ");
            String emp_class = sc.next();

            System.out.print("Enter designation: ");
            String designation = sc.next();

            Emp4[i] = new Member(emp_id, emp_name, emp_class, designation);
        }

        System.out.println("\n---- Employee Details ----");
        for (int i = 0; i < n; i++) {
            if (Emp4[i].emp_class.equalsIgnoreCase("Class1"))
                Emp4[i].display();
        }
    }
}


import java.util.Scanner;

class Staffm {
    String name;
    int b_date;
    String designation;
    double salary;
    double basic_salary;
    double hr;
    double da;
    double gross_salary;

    Staffm(

            String name,
            int b_date,
            String designation,
            double salary) {
        this.name = name;
        this.b_date = b_date;
        this.designation = designation;
        this.salary = salary;
        this.basic_salary = salary;

        this.hr = basic_salary * 0.10;
        this.da = basic_salary * 0.20;

        this.gross_salary = basic_salary + hr + da;

    }

    void display() {
        System.out.println("Name" + name);
        System.out.println("Birthdate" + b_date);
        System.out.println("designation" + designation);
        System.out.println("salary" + salary);
        System.out.println("basic_salary:" + basic_salary);
        System.out.println("Hr: " + hr);
        System.out.println("Da: " + da);
        System.out.println("Gross Salary : " + gross_salary);
    }

}

public class Stafff12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the staff");
        int n = sc.nextInt();
        Staffm[] staffList = new Staffm[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for staff" + (i + 1) + ":");

            System.out.print("Enter the Name :");
            String name = sc.next();
            System.out.print("Enter the b_date : ");
            int b_date = sc.nextInt();
            System.out.print("Enter designation : ");
            String designation = sc.next();
            System.out.print("Enter the salary :");
            double salary = sc.nextInt();

            staffList[i] = new Staffm(name, b_date, designation, salary);

        }

        System.out.println("\n --------staff Details___");
        for (int i = 0; i < n; i++) {
            staffList[i].display();
        }
        // staffList.sort();
    }
}
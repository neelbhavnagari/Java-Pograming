import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Emp {
    int emp_no;
    String emp_name;
    String designation;

    Emp(int emp_no, String emp_name, String designation) {
        this.emp_no = emp_no;
        this.emp_name = emp_name;
        this.designation = designation;
    }

    void display() {
        System.out.println("Emp No: " + emp_no);
        System.out.println("Name: " + emp_name);
        System.out.println("Designation: " + designation);
    }
}

class Salary extends Emp {
    int Basic_sal;

    Salary(int emp_no, String emp_name, String designation) {
        super(emp_no, emp_name, designation);
        calculateSalary();
    }

    void calculateSalary() {
        if (designation.equalsIgnoreCase("manager")) {
            Basic_sal = 8000;
        } else if (designation.equalsIgnoreCase("HR")) {
            Basic_sal = 7000;
        } else if (designation.equalsIgnoreCase("clark")) {
            Basic_sal = 84000;
        } else {
            Basic_sal = 2000;
        }
    }

    void displaySalary() {
        display();
        System.out.println("Basic Salary: " + Basic_sal);
    }
}

public class Emplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s[] = new Salary[5];

        // ✅ Take input
        for (int i = 0; i < s.length; i++) {
            System.out.print("Enter Emp No: ");
            int emp_no = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String emp_name = sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            s[i] = new Salary(emp_no, emp_name, designation);
        }

        // ✅ Sort after all input
        Arrays.sort(s, (a, b) -> b.Basic_sal - a.Basic_sal);

        // ✅ Display all employees sorted by salary
        System.out.println("\n====== Employees Sorted by Salary ======");
        for (Salary emp : s) {
            emp.displaySalary();
            System.out.println("-------------------------");
        }

        // ✅ Display employee with highest salary
        System.out.println("\n--- Employee with Highest Salary ---");
        s[0].displaySalary();
    }
}

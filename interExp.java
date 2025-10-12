import java.util.Scanner;

class ZeroMarksException extends Exception {
    public ZeroMarksException(String message) {
        super(message);
    }
}

interface CalculateResult {
    void CalTotal();

    void CalculatePer();

    void calgrade();
}

class Student implements CalculateResult {
    int rollno;
    String name;
    int[] marks;
    int calTotal;
    double percentage;
    String grade;

    Student(int rollno, String name, int[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public void CalTotal() {
        calTotal = 0;
        for (int m : marks) {
            calTotal += m;
        }
    }

    public void CalculatePer() {
        percentage = (double) calTotal / (marks.length * 100) * 100;
    }

    public void calgrade() {
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 75)
            grade = "A";
        else if (percentage >= 65)
            grade = "B";
        else if (percentage >= 55)
            grade = "C";
        else if (percentage >= 45)
            grade = "D";
        else if (percentage >= 35)
            grade = "E";
        else
            grade = "Fail";
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calTotal);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class interExp {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];

            System.out.println("Enter Marks for 5 subjects:");

            for (int i = 0; i < marks.length; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                if (marks[i] <= 0) {
                    throw new ZeroMarksException("Marks cannot be zero or negative for Subject " + (i + 1));
                }
            }

            Student s = new Student(rollno, name, marks);
            s.CalTotal();
            s.CalculatePer();
            s.calgrade();
            s.displayResult();
        } catch (ZeroMarksException e) {
            System.out.println(" Exception: " + e.getMessage());

        }
    }
}
                
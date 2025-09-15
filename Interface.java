
interface CalculateResult {
    void CalculateTotal();

    void CalculatePercentage();

    void CalculateGrade();
}

class Student implements CalculateResult {
    String name;
    int[] marks;
    int total;
    double percentage;
    String grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void CalculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    public void CalculatePercentage() {
        percentage = (double) total / marks.length;
    }

    public void CalculateGrade() {
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class Interface {
    public static void main(String[] args) {

        int[] marks = { 85, 78, 92, 88, 76 };
        Student student = new Student("John Doe", marks);

        student.CalculateTotal();
        student.CalculatePercentage();
        student.CalculateGrade();
        student.displayResult();
    }
}

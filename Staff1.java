import java.util.Arrays;
import java.util.Scanner;

abstract class Staff {

    int no;
    String name;

    Staff(int no, String name) {
        this.no = no;
        this.name = name;
    }

    abstract int calculateSalary();
}

class Typist extends Staff {
    int speed;

    Typist(int no, String name, int speed) {
        super(no, name);
        this.speed = speed;
    }

    int calculateSalary() {
        if (speed < 40)
            return 4000;
        else
            return 6000;
    }
}

public class Staff1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Typist[] typists = new Typist[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("enter the no");
            int no = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Speed (words/min): ");
            int speed = sc.nextInt();

            typists[i] = new Typist(no, name, speed);

        }
        int[] salaries = new int[10];
        for (int i = 0; i < 10; i++) {
            salaries[i] = typists[i].calculateSalary();
        }
        Arrays.sort(salaries);
        System.out.println("Highest Salary: " + salaries[9]);
        System.out.println("Second Highest Salary: " + salaries[8]);

    }

}

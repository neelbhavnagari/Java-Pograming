import java.util.Scanner;
import neel.MyClass;

public class program2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1 :- ");
        a = sc.nextInt();
        System.out.println("enter no 2 :- ");
        b = sc.nextInt();
        MyClass m = new MyClass();
        m.choice();
    }
}

public class Exception1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println("sub" + (a / b));

        }
         catch (ArithmeticException e1) {
            System.out.println("exception>>>>" + " " + e1);
        }
         catch (Exception e1) {
            System.out.println("exception" + " " + e1);
        }

    }

}

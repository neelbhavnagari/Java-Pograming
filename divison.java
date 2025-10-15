class divisonexception extends Exception {
    public divisonexception(String message) {
        super(message);
    }
}

public class divison {
    public static void main(String[] args) {

        try {
            if (args.length == 0) {
                System.out.println("Please provide a number as a command line argument.");
                return;
            }

            int number = Integer.parseInt(args[0]);

            if (number % 7 != 0) {
                throw new divisonexception("Number " + number + " is not divisible by 7");
            }

        } catch (divisonexception e) {
            System.out.println(e.getMessage());

        }
    }
}
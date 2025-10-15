
class UppercaseException extends Exception {
    public UppercaseException(String message) {
        super(message);
    }
}

public class UppercaseCheck {
    public static void main(String[] args) {
        try {

            if (args.length == 0) {
                System.out.println("Please provide a string as a command line argument.");
                return;
            }

            String input = args[0];

            if (input.equals(input.toUpperCase())) {
                throw new UppercaseException("String is in uppercase: " + input);
            }

            System.out.println("String is not in uppercase: " + input);

        } catch (UppercaseException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

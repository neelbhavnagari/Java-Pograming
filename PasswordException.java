import java.util.*;

class InvalidPassword extends Exception {
    public InvalidPassword(String s) {
        super(s);
    }
}

class PasswordException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter usernmae: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (!username.equals(password)) {
                throw new InvalidPassword("Invalid password!!!");
            }

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } 
        
        catch (InvalidPassword e) {
            System.out.println(e.getMessage());
        }
    }
}
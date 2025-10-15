import java.util.Scanner;

class invalidProduct extends Exception {
    public invalidProduct(String message) {
        super(message);

    }

}

public class Product {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product_no");
        int product_no = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the product name");
        String product_name = sc.next();
        System.out.println("Enter the product Weight");
        double Weight = sc.nextDouble();

        try {
            if (Weight > 100) {
                throw new invalidProduct("Invelid Weight");

            }
            System.out.println("========Product Details============");
            System.out.println("Product Code  : " + product_no);
            System.out.println("Product Name  : " + product_name);
            System.out.println("Product Weight: " + Weight);

        } catch (invalidProduct e) {
            System.out.print(e.getMessage());

        }
        // sc.close();
    }
}

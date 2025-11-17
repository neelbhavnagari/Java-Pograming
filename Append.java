import java.io.FileWriter;
import java.io.IOException;

public class Append{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt", true); // append mode
            fw.write("\nThis line is appended!");
            fw.close();
            System.out.println("Content appended successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

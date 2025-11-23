// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class Buffer {
//     public static void main(String[] args) {
//         try {

//             BufferedReader br = new BufferedReader(new FileReader("Data.txt"));

//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.print(line);

//             }
//             br.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//     }
// }

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Buffer {
//     public static void main(String[] args) {

//         try {
//             BufferedWriter bw = new BufferedWriter(new FileWriter("Data.txt"));

//             bw.write("Hello Java");
//             bw.newLine();
//             bw.write("This is BufferedWriter");

//             bw.close();

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

import java.io.*;
import java.net.*;

class Client {
	public static void main(String args[]) {
		try {
			// 1. Connect to Server (make sure port matches Server)
			Socket s = new Socket("localhost", 8080); // or 9090 if your server uses 9090

			// 2. Read message from server
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String s1 = dis.readUTF();

			System.out.println("✅ Received String from Server: " + s1);

			// 3. Close resources
			dis.close();
			s.close();

		} catch (Exception e) {
			System.out.println(" EXCEPTION: " + e);
		}
	}
}

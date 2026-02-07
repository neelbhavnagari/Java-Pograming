/* To implement a SERVER */

import java.io.*;
import java.net.*;

class Server {
	public static void main(String args[]) {
		try {
			// 1. Create ServerSocket
			ServerSocket ss = new ServerSocket(8080);
			System.out.println("✅ Server Started on port 8080...");

			// 2. Wait for client
			Socket s = ss.accept();
			System.out.println("✅ Client is connected");

			// 3. Take input from server console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the Message to send to Client: ");
			String msg = br.readLine();

			// 4. Send message to client
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(msg);

			System.out.println("✅ Message sent to client");

			// 5. Close all resources
			dos.close();
			s.close();
			ss.close();

		} catch (Exception e) {
			System.out.println(" EXCEPTION: " + e);
		}
	}
}

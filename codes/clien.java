import java.net.*;
import java.io.*;
import java.util.Scanner;

class clien {
	double radius, result;

	clien() {
		try {
			// create a socket to make connection to server
			Socket clientSoc = new Socket("127.0.0.1", 4000);

			// create a scanner
			Scanner ob = new Scanner(System.in);
			System.out.println("Enter the radius:");
			radius = ob.nextDouble();

			DataInputStream fromServ = new DataInputStream(clientSoc.getInputStream());
			DataOutputStream toServ = new DataOutputStream(clientSoc.getOutputStream());

			toServ.writeDouble(radius);
			toServ.flush();

			result = fromServ.readDouble();
			System.out.println("Area is " + result);
			fromServ.close();
			toServ.close();
			clientSoc.close();
			ob.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new clien();
	}
}

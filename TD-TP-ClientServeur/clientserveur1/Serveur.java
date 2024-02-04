package clientserveur1;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serveur {

	public static void main(String[] zero) {
		
		 
		try {
		
			ServerSocket socketserver = new ServerSocket(80);
			Socket socketclient = socketserver.accept(); 
			System.out.println("Un client s'est connecté !");
		        //socketserver.close();
		        //socketduserveur.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
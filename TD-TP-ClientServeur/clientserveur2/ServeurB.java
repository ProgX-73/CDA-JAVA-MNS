package clientserveur2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurB {
	public static void main(String[] args) throws Exception {
	    // création de la socket
	    int port = 1989;
	    ServerSocket serverSocket = new ServerSocket(port);
	    System.err.println("Serveur lancé sur le port : " + port);
	
	    // repeatedly wait for connections, and process
	    while (true) {
	        // on reste bloqué sur l'attente d'une demande client
	        Socket clientSocket = serverSocket.accept();
	        System.err.println("Nouveau client connecté");
	        Page p = new Page(clientSocket);
	        
//	        p.run();
//	        
//	        System.out.println("what?");
	        Thread th = new Thread(p);
	        th.start();
	        System.out.println("what?");
	    }
	}
}


package clientserveur2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *  THREAD OR NOT THREAD?
 */
public class ServeurA {
	public static void main(String[] args) throws Exception {
	    // création de la socket
	    int port = 1989;
	    ServerSocket serverSocket = new ServerSocket(port);
	    System.err.println("Serveur lancé sur le port : " + port);
	
	    // repeatedly wait for connections, and process
	    while (true) {
	        Socket clientSocket = serverSocket.accept();
	        System.err.println("Nouveau client connecté");
	
	        // on ouvre un flux de converation
	        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
	
	        Scanner clientInput = new Scanner(clientSocket.getInputStream());
	      
	        out.write("HTTP/1.0 200 OK\r\n");
	        out.write("Date: Fri, 31 Dec 1999 23:59:59 GMT\r\n");
	        out.write("Server: Apache/0.8.4\r\n");
	        out.write("Content-Type: text/html\r\n");
	        out.write("Content-Length: 59\r\n");
	        out.write("Expires: Sat, 01 Jan 2000 00:59:59 GMT\r\n");
	        out.write("Last-modified: Fri, 09 Aug 1996 14:21:40 GMT\r\n");
	        out.write("\r\n");
	        out.write("<TITLE>Exemple</TITLE>");
	        out.write("<P>Ceci est une page d'exemple.</P>");
	
	        // on ferme les flux.
	        System.err.println("Connexion avec le client terminée");
	        out.close();
	        in.close();
	        clientSocket.close();
	    }
	}
}


package clientserveur2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Page implements Runnable {

	private Socket socket;

	@Override
	public void run() {

		// on ouvre un flux de converation
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		//Lecture du flux entré et l'affiche dans la console du serveur
		System.out.println("Lecture des données envoyées par le client :");
		String s;
	
			while ((s = in.readLine()) != null) {
				System.out.println(s);
				if (s.length()<2) {
					break;
				}
			}

			//Ecriture d'une page web en retour au client
			System.out.println("envoie de la réponse");
			out.write("HTTP/1.0 200 OK\r\n");
			out.write("Date: Fri, 31 Dec 1999 23:59:59 GMT\r\n");
			out.write("Server: Apache/0.8.4\r\n");
			out.write("Content-Type: text/html\r\n");
			out.write("Content-Length: 59\r\n");
			out.write("Expires: Sat, 01 Jan 2000 00:59:59 GMT\r\n");
			out.write("Last-modified: Fri, 09 Aug 1996 14:21:40 GMT\r\n");
			out.write("\r\n");
			out.write("<TITLE>Exemple1</TITLE>");
			out.write("<P>Ceci est une page d'exemple.</P>");

	            
			// on ferme les flux.
			System.err.println("Connexion avec le client terminée");
			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public Page(Socket socket) {
		super();
		this.socket = socket;

	}
}


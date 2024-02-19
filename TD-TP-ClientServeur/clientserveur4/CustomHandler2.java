package clientserveur4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class CustomHandler2 implements HttpHandler {

	 private static final String calcul = "C:\\Users\\frena\\eclipse-workspace\\ClientServeurDemoJava\\src\\clientserveur4\\NewFile2.html";

	@Override
	 public void handle(HttpExchange exchange) throws IOException {
	  String requestMethod = exchange.getRequestMethod();
	  String query = exchange.getRequestURI().getQuery();
	  System.out.println("entering request..."+query);
	  
	   String[] paramvalues = query.split("&");
	   String[] nb1 = paramvalues[0].split("=");
	   String[] nb2 = paramvalues[1].split("=");
	  Integer somme = Integer.valueOf(nb1[1])+Integer.valueOf(nb2[1]);
	  
	  exchange.sendResponseHeaders(200, 0);
	  OutputStream os = exchange.getResponseBody();
	  
	//Création d'un fileReader pour lire le fichier
	  			File file = new File(calcul);
	  			System.out.println(file.getAbsolutePath());
				FileReader fileReader = new FileReader(file);
				
				// Création d'un bufferedReader qui utilise le fileReader
				BufferedReader reader = new BufferedReader(fileReader);
				
				// une fonction à essayer pouvant générer une erreur
				String line = reader.readLine();
				
				while (line != null) {
					// affichage de la ligne
					System.out.println(line);
					String line2 = "";
					if(line.contains("#SOMME"))
					{
						line2  = line.replace("#SOMME",somme.toString());
						os.write(line2.getBytes());
					}
					else
					 os.write(line.getBytes()); 
					// lecture de la prochaine ligne
					line = reader.readLine();
				}
				reader.close();
				os.close();
	 }
}

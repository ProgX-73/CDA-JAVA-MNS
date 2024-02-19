package clientserveur4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
class CustomHandler implements HttpHandler {

	private static final String accueil = "C:\\Users\\frena\\eclipse-workspace\\ClientServeurDemoJava\\src\\clientserveur4\\NewFile.html";;

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		String requestMethod = exchange.getRequestMethod();
		String query = exchange.getRequestURI().getQuery();
		System.out.println("entering request...");
		exchange.sendResponseHeaders(200, 0);
		OutputStream os = exchange.getResponseBody();

		// Création d'un fileReader pour lire le fichier
		File file = new File(accueil);
		System.out.println(file.getAbsolutePath());
		FileReader fileReader = new FileReader(file);

		// Création d'un bufferedReader qui utilise le fileReader
		BufferedReader reader = new BufferedReader(fileReader);

		
		String line = reader.readLine();

		while (line != null) {
			// affichage de la ligne
			System.out.println(line);
			os.write(line.getBytes());
			// lecture de la prochaine ligne
			line = reader.readLine();
		}
		reader.close();
		os.close();

	}

}
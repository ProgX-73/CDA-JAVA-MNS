package clientserveur42;

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
		System.out.println("entering request...");
		OutputStream os = exchange.getResponseBody();
		exchange.sendResponseHeaders(200, 0);
		FileTemplate.createResponseFromTemplate(accueil, null, os);
		
		os.close();

	}

}
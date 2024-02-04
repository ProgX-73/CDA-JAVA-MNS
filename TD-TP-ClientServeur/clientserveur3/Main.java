package clientserveur3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Main {

	public static void main(String[] args) throws IOException {
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
		server.createContext("/test", new CustomHandler());
		server.start();
		/*
		 * 127.0.0.1:8000/test
		 */
	}
}

class CustomHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		String requestMethod = exchange.getRequestMethod();

		String query = exchange.getRequestURI().getQuery();
		System.out.println("entering request...");
		String response = "<b>Bonjour !</b></br>Methode : " + requestMethod + "</br>" + "Requete : " + query;
		exchange.sendResponseHeaders(200, 0);
		OutputStream os = exchange.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}

}
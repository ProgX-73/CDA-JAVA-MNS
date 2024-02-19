package clientserveur42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Main {

	public static void main(String[] args) throws IOException {
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
		server.createContext("/accueil", new CustomHandler());
		server.createContext("/calc", new CustomHandler2());
		server.createContext("/img", new CustomHandler3());
		server.start();
		/*
		 * 127.0.0.1:8000/calc
		 */
	}
}


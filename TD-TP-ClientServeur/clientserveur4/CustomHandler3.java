package clientserveur4;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

import javax.imageio.ImageIO;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class CustomHandler3 implements HttpHandler {

	 private static final String image = "C:\\Users\\frena\\eclipse-workspace\\ClientServeurDemoJava\\src\\clientserveur4\\img.jpg";
	@Override
	 public void handle(HttpExchange exchange) throws IOException {
	  String requestMethod = exchange.getRequestMethod();
	  String query = exchange.getRequestURI().getQuery();
	  System.out.println("entering request..."+query);
	  
	
	  exchange.sendResponseHeaders(200, 0);
	  OutputStream os = exchange.getResponseBody();
	  
	//Création d'un fileReader pour lire le fichier
	  			File file = new File(image);
	  			System.out.println(file.getAbsolutePath());
				FileReader fileReader = new FileReader(file);
				
				// Création d'un bufferedReader qui utilise le fileReader
				BufferedImage img = load(file);
				
				ImageIO.write(img, "jpg", os);
				os.close();

	 }
	 static BufferedImage load(File f) throws IOException
	 {
	     byte[] bytes = Files.readAllBytes(f.toPath());
	     try (InputStream is = new ByteArrayInputStream(bytes))
	     {
	         return ImageIO.read(is);
	     }
	 }
}

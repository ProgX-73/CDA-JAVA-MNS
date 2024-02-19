package clientserveur42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class CustomHandler2 implements HttpHandler {

	 private static final String calcul = "C:\\Users\\frena\\eclipse-workspace\\ClientServeurDemoJava\\src\\clientserveur4\\NewFile2.html";

	@Override
	 public void handle(HttpExchange exchange) throws IOException {
	   String query = exchange.getRequestURI().getQuery();
	   String[] paramvalues = query.split("&");
	   String[] nb1 = paramvalues[0].split("=");
	   String[] nb2 = paramvalues[1].split("=");
	  Integer somme = Integer.valueOf(nb1[1])+Integer.valueOf(nb2[1]);
	  
	  exchange.sendResponseHeaders(200, 0);
	  OutputStream os = exchange.getResponseBody();
	  
	//Création d'un fileReader pour lire le fichier
	  			File file = new File(calcul);
	  			HashMap<String,String> templateDatas = new HashMap<String, String>();
	  			templateDatas.put("#SOMME",""+somme);
	  			FileTemplate.createResponseFromTemplate(calcul, templateDatas, os);
				os.close();
	 }
}

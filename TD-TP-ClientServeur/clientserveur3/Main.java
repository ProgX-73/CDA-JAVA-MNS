package clientserveur3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/**
 * REFERENCE : JAVADOC OFFICIELLE
 */

public class Main {

	public static void main(String[] args) throws IOException {
		/**
		 * L'Objet HttpServer encapulse la partie technique de ServerSocket et de la gestion des connexions clientes 
		 * pour donner au développeur un petit serveur HTTP paramétrable et plus facile à gérer.
		 * 
		 * InetSocketAddress(String hostname, int port)
		 * représente l'adresse du socket d'écoute hostname(par défaut localhost 127.0.0.1) et port.
		 * Le constructeur permet en dernier paramètre de préciser le nb de client qu'on garde en suspens
		 * en attendant que la méthode accept() puis les traiter.
		 */
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
		server.createContext("/test", new CustomHandler());
		/**
		 * Create Context 
		 * Crée un HttpContext. 
		 * Un HttpContext représente un mapping d'un chemin URI vers un gestionnaire d'échange sur ce HttpServer.
		 * Une fois créé, toutes les demandes reçues par le serveur pour le chemin /test seront traitées en appelant 
		 * l'objet gestionnaire donné, ici CustomHandler. 
		 * Le contexte est identifié par le chemin et peut ensuite être supprimé du serveur à l'aide de la méthode 
		 * removeContext(String).
		 */
		server.start();
		/*
		 * 127.0.0.1:8000/test
		 */
		/**
		 * Ce petit Objet-serveur utile permet de paraméter bien d'autres fonction de votre serveur.
		 * A découvrir plus tard.
		 */
	}
}


/***
 * ATTENTION CECI EST UNE NOUVELLE Classe vous pouvez la mettre dans un fichier séparée, elle est ici pour simplifier la lecture.
 */
class CustomHandler implements HttpHandler {
	/**
	 * Gérez la demande donnée et générez une réponse appropriée. 
	 */

	//Cette méthode provient de "implements HttpHandler", elle permet
	//de nous faire passer l'objet  exchange depuis le serveur qui l'aura fabriqué pour nous 
	//lorsque que le client l'a appelé.
	@Override
	public void handle(HttpExchange exchange) throws IOException {
		/**
		 * Cette classe encapsule une requête HTTP reçue et une réponse à générer en un seul échange. 
		 * Elle fournit des méthodes pour examiner la demande du client, ainsi que pour construire et envoyer la réponse.
			Le cycle de vie typique d’un HttpExchange est présenté dans la séquence ci-dessous.

			getRequestMethod() pour déterminer la commande
			getRequestHeaders() pour examiner les en-têtes de requête (si nécessaire)
			getRequestBody() renvoie un InputStream pour lire le corps de la requête. Après lecture du corps de la requête, le flux est fermé.
			getResponseHeaders() pour définir tous les en-têtes de réponse, à l'exception de la longueur du contenu
			sendResponseHeaders(int,long) pour envoyer les en-têtes de réponse. Doit être appelé avant la prochaine étape.
			getResponseBody() pour obtenir un OutputStream pour envoyer le corps de la réponse. Une fois le corps de la réponse écrit, le flux doit être fermé pour terminer l'échange.
			Terminer les échanges:
			Les échanges prennent fin lorsque la demande InputStream et la réponse OutputStream sont fermées. La fermeture du OutputStream ferme implicitement le InputStream (s'il n'est pas déjà fermé). Cependant, il est recommandé de consommer toutes les données du InputStream avant de le fermer. La méthode pratique close() effectue toutes ces tâches. Fermer un échange sans consommer tout le corps de la requête n'est pas une erreur mais peut rendre la connexion TCP sous-jacente inutilisable pour les échanges suivants. L'effet de l'échec de la terminaison d'un échange n'est pas défini, mais entraînera généralement l'échec de la libération/réutilisation des ressources.

		 */
		
		
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
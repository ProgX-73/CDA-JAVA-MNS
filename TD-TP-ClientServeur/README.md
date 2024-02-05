***Les Sockets
En Java, les sockets sont utilisées pour la communication entre deux programmes via un réseau. Les sockets fournissent une interface pour la programmation réseau bas niveau, permettant aux applications de s'envoyer des données à travers un réseau. Le modèle de socket utilisé dans Java est basé sur le modèle de sockets BSD (Berkeley Software Distribution).

Voici un aperçu du fonctionnement des sockets en Java :

Création de Sockets : Dans Java, on utilise les classes Socket et ServerSocket du package java.net pour créer des sockets.

Socket : Représente un socket côté client, utilisé pour se connecter à un serveur distant.

ServerSocket : Représente un socket côté serveur, écoutant les connexions entrantes.

Établissement de Connexion : Pour établir une connexion entre un client et un serveur, le serveur doit être à l'écoute sur un port spécifique. Le client se connecte ensuite à ce port. Voici comment cela peut être fait :

Côté Serveur :
javaCopy code
ServerSocket serverSocket = new ServerSocket(8080); // Création d'un ServerSocket écoutant sur le port 8080
Socket clientSocket = serverSocket.accept(); // Attente d'une connexion client
Côté Client :
javaCopy code
Socket clientSocket = new Socket("localhost", 8080); // Connexion à un serveur sur le port 8080
Flux de Données : Une fois la connexion établie, vous pouvez obtenir des flux d'entrée et de sortie associés aux sockets pour lire et écrire des données.

Côté Serveur :
javaCopy code
InputStream inputStream = clientSocket.getInputStream(); // Flux d'entrée pour lire depuis le client
OutputStream outputStream = clientSocket.getOutputStream(); // Flux de sortie pour écrire vers le client
Côté Client :
javaCopy code
InputStream inputStream = socket.getInputStream(); // Flux d'entrée pour lire depuis le serveur
OutputStream outputStream = socket.getOutputStream(); // Flux de sortie pour écrire vers le serveur
Communication : Vous pouvez utiliser les flux d'entrée et de sortie pour envoyer et recevoir des données entre le client et le serveur.

Côté Serveur :
javaCopy code
BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
String clientMessage = reader.readLine(); // Lire une ligne depuis le client
Côté Client :
javaCopy code
PrintWriter writer = new PrintWriter(outputStream, true);
writer.println("Hello, Server!"); // Envoyer une ligne vers le serveur
Fermeture des Sockets : Une fois la communication terminée, assurez-vous de fermer les sockets pour libérer les ressources.

javaCopy code
clientSocket.close(); // Côté serveur ou client
serverSocket.close(); // Côté serveur uniquement
C'est un aperçu général du fonctionnement des sockets en Java. Il est important de gérer correctement les exceptions et de suivre les meilleures pratiques pour garantir une communication fiable et sécurisée entre les applications.

# ***Les Sockets*** #
[ (TP dans le PDF)](https://github.com/ProgX-73/CDA-JAVA-MNS/blob/main/TD-TP-ClientServeur/Socket-ClientServeur%20en%20Java.pdf)
En Java, les sockets sont utilisées pour la communication entre deux programmes via un réseau. Les sockets fournissent une interface pour la programmation réseau bas niveau, permettant aux applications de s'envoyer des données à travers un réseau. Le modèle de socket utilisé dans Java est basé sur le modèle de sockets BSD (Berkeley Software Distribution).

Création de Sockets : Deux classe  du package java.net sont à disposition :

**Socket** : Représente un socket côté client, utilisé pour se connecter à un serveur distant.

**ServerSocket** : Représente un socket côté serveur, écoutant les connexions entrantes.

![image](https://github.com/ProgX-73/CDA-JAVA-MNS/assets/7236016/e1909efb-4485-4f20-b8d1-b35a194de3d8)


## Établir la  Connexion
Pour établir une connexion entre un client et un serveur, le serveur doit être à l'écoute sur un port spécifique. Le client se connecte ensuite à ce port. Voici comment cela peut être fait :

**Côté Serveur :**
ServerSocket serverSocket = new ServerSocket(8080); // Création d'un ServerSocket écoutant sur le port 8080 de la machine hôte
Socket clientSocket = serverSocket.accept(); // Attente d'une connexion client ...
**Côté Client :**
Socket clientSocket = new Socket("adresseMachineServeur", 8080); // Connexion à un serveur sur le port 8080

**Allô?**
Lorsque le client se connecte, un flux de données arrive sur le port de la machine serveur, par le biais de la méthode accept(), le ServerSocket va produire un objet clientSocket pour ce flux.
Deux sockets peuvent alors dialoguer via des flux d'entrée et de sorties.

![image](https://github.com/ProgX-73/CDA-JAVA-MNS/assets/7236016/22d8d7cf-46c5-424f-9f8a-420cdf49b8dc)

## Flux de Données 
 Une fois la connexion établie, vous pouvez obtenir des flux d'entrée et de sortie associés aux sockets pour lire et écrire. Cela s'apparente au fonctionnement du Scanner pour les flux d'entrées que vous avec déjà utilisés.
 Ces flux matérialise l'échange de données brutes telles que des bytes, ou des caractères. On les retrouve dans la lecture de fichiers textes,  images, sons, vidéos...

**Côté Serveur & Client : Obtenir le flux **

InputStream inputStream = clientSocket.getInputStream(); // Flux d'entrée pour lire depuis le client
OutputStream outputStream = clientSocket.getOutputStream(); // Flux de sortie pour écrire vers le client

Communication : Vous pouvez utiliser les flux d'entrée et de sortie pour envoyer et recevoir des données entre le client et le serveur.

**Lecture depuis flux :**
BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
String clientMessage = reader.readLine(); // Lire une ligne depuis le client

**Ecriture vers le flux :**
PrintWriter writer = new PrintWriter(outputStream, true);
writer.println("Hello, Server!"); 

**Fermeture des Sockets : **
Une fois la communication terminée, assurez-vous de fermer les sockets pour libérer les ressources.
clientSocket.close(); // Côté serveur ou client
serverSocket.close(); // Côté serveur uniquement

C'est un aperçu général du fonctionnement des sockets en Java.

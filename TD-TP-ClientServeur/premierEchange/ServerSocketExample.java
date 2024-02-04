package premierEchange;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketExample {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server waiting for client connection...");

            // Attendre la connexion d'un client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Flux de communication avec le client
            Scanner clientInput = new Scanner(clientSocket.getInputStream());
            PrintWriter serverOutput = new PrintWriter(clientSocket.getOutputStream(), true);

            // Lire les données du client et renvoyer une réponse
            while (clientInput.hasNextLine()) {
                String clientMessage = clientInput.nextLine();
                System.out.println("Client says: " + clientMessage);

                // Répondre au client
                serverOutput.println("Server received: " + clientMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

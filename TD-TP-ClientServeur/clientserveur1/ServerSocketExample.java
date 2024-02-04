package clientserveur1;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketExample {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(80)) {
            System.out.println("Server waiting for client connection...");

            // Attendre la connexion d'un client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Flux de communication avec le client
            //un scanner d'entrée doit exister pour renvoyer une réponse au client
             Scanner clientInput = new Scanner(clientSocket.getInputStream());
            PrintWriter serverOutput = new PrintWriter(clientSocket.getOutputStream(), true);
            serverOutput.println("Server received conn hello");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

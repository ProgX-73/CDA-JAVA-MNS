package premierEchange;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketExample {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            // Flux de communication avec le serveur
            Scanner serverInput = new Scanner(socket.getInputStream());
            PrintWriter clientOutput = new PrintWriter(socket.getOutputStream(), true);

            // Envoyer des données au serveur
            clientOutput.println("Hello Server!");

            // Lire la réponse du serveur
            String serverResponse = serverInput.nextLine();
            System.out.println("Server response: " + serverResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

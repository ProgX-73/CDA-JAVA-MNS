package clientserveur1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	
	public static void main(String[] zero) {
		//80
		//1989
		Socket socket;

		try {
		
		     socket = new Socket(InetAddress.getLocalHost(),1989);	
		     Scanner sc = new Scanner(socket.getInputStream());
		     while(sc.hasNextLine())
		     System.out.println(sc.nextLine());

		}catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

    public static void main(String[] args) throws UnknownHostException, IOException {
        SSLSocket sslSocket = null;
        try {
            // Obtain the default SSL socket factory
            SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            // Create a stream socket and connect it to localhost on port 8259
            sslSocket = (SSLSocket) sslSocketFactory.createSocket("localhost", 8259);
            System.out.println("Established connection with server.");
            System.out.println("**WELCOME TO ECHO TEST**");
            System.out.println("Just type in a text string and watch it come back!");
            System.out.println("--Type 'quit' to quit--");
            // Create PrintWriter object for printing to text-output stream
            PrintWriter out = new PrintWriter(sslSocket.getOutputStream(), true);
            // Create BufferedReader object for reading text msg from server
            BufferedReader in = new BufferedReader(new InputStreamReader(sslSocket.getInputStream()));
            // Create BufferedReader object for reading in user input
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            // Create string object to store user-provided text input
            String userInput;
            // Read in user input, send to server, and receive server responses
            while ((userInput = stdIn.readLine()) != null) {
                if(userInput.equals("quit")){
                    System.out.println("Terminating SSL client connection...");
                    break;
                } else {
                    // Send user input to server
                    out.println(userInput);
                    // Receive response from server
                    System.out.println("Response from SSL server: ");
                    System.out.println(in.readLine());
                }
            }
        } catch(IOException ioe){
            //report exception
            System.err.println("SSL client exception: " + ioe);
            // Terminate client
            Runtime.getRuntime().exit(1);
        } finally {
            // close the client socket
            if (sslSocket != null){
                try {
                    sslSocket.close();
                    System.out.println("SSL client connection terminated");
                } catch (IOException ioe) {
                    System.err.println(ioe);
                }
            }
        }
    }
}

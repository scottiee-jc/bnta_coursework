package echo_client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLServerSocket;

public class EchoServer {

    public static void main(String[] args) throws IOException {
        SSLServerSocket sslServerSocket = null;
        try {
            // When transferring sensitive data over comm channels, it's good to use ssl based versions of java net packages - added data protection
            // acheive this by first obtaining the default SSL socket factory
            SSLServerSocketFactory sslServerSocketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            // Create an SSL server socket on port 8259
            sslServerSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(8259);
            // Listen for a connection to be made to this socket and accept it
            System.out.println("Server socket created. Listening for incoming connections...");
            SSLSocket sslSocket = (SSLSocket) sslServerSocket.accept();
            // accept will accept an incoming client request for a connection
            System.out.println("New connection accepted. Waiting for data...");
            // create PrintWriter object for printing to text-output stream
            PrintWriter out = new PrintWriter(sslSocket.getOutputStream(), true);
            // create BufferedReader object for reading text from character input stream
            BufferedReader in = new BufferedReader(new InputStreamReader(sslSocket.getInputStream()));
            // create String object to store character based data read from client
            String inputLine;
            //read in messages from connected clients
            while ((inputLine = in.readLine()) != null){
                // Print message received from client
                System.out.println("Message from client: " + inputLine);
                // Print message back to client
                out.println(inputLine);
            }
        } catch(IOException ioe) {
            //Report exception
            System.err.println("Server exception: " + ioe);
            // Terminate server
            Runtime.getRuntime().exit(1);
        } finally {
            // Close the server socket
            if (sslServerSocket != null) {
                System.out.println("Closing server socket connection...");
                try {
                    sslServerSocket.close();
                    System.out.println("Server socket now closed.");
                } catch (IOException ioe) {
                    System.err.println(ioe);
                }
            }
        } // end to finally
    } // end to arg
}

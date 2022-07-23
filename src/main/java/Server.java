
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket server;
    private int port = 7777;
    private boolean isConnected;

    public Server(){

    }
    public void startServer(){
        try {
            server = new ServerSocket(port);
            isConnected = true;
            System.out.println("Server started.");
            System.out.println("Czekam na polaczenie...");
//            while (!server.isClosed()){
//                new ConnectionHandler().start();
//            }

        }catch (IOException e){
            System.out.println("Error in startServer method.");
        }
    }

    public boolean getIsConnected(){
        return isConnected;
    }
    public ServerSocket serverSocket(){
        return server;
    }
}

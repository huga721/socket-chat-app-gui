import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
//        ConnectionHandler ch = new ConnectionHandler();

        server.startServer();
        System.out.println("Waiting for connection...");
        System.out.println(server.serverSocket().isClosed());


    }
}

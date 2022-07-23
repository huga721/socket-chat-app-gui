
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ConnectionHandler extends Thread{

    // Przechowuje wszystkie watki
    private static ArrayList<ConnectionHandler> connectionHandlers = new ArrayList<>();

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String nick;
    String message;
    Server server;

    public ConnectionHandler() {
        super.start();
//        try {
//        } catch (IOException e) {
//            System.out.println("Error in ConnectionHandler constructor");
//        }
    }

    @Override
    public void run() {
//        connectionHandlers.add(this); // Kazdy nowy watek jest dodawany do listy
        try {
            System.out.println("dawdada");
            socket = new Socket("127.0.0.1", 7777);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.nick = in.readLine();
            System.out.println(nick);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sendMessageToEveryone(String messagee){
        for (ConnectionHandler connectionHandler : connectionHandlers){
            // Sending message to every thread except the thread that is sending message
//                connectionHandler.out.println(message);
            out.println(messagee);
        }
    }
}

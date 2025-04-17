import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerSocketDemo {

    public static  void run() throws IOException {
        StartServer();

    }

    public static void StartServer() throws IOException {

        InetAddress localIpAddress = InetAddress.getLocalHost();
        int port = 9900;

        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Server is waiting for connection on IP "+ localIpAddress.getHostAddress());
        Socket client = serverSocket.accept();

        System.out.println("Server Accepted Connection from IP:"+client.getInetAddress().getHostAddress());

    }
}

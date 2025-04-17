import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ServerSocketDemo {

    public static  void run() throws IOException {
        StartServer();

    }

    public static void StartServer() throws IOException {

        try{
            InetAddress localIpAddress = InetAddress.getLocalHost();
            int port = 9900;

            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Server is waiting for connection on IP "+ localIpAddress.getHostAddress());
            Socket client = serverSocket.accept();

            System.out.println("Server Accepted Connection from IP:"+client.getInetAddress().getHostAddress());

            PrintWriter output = new PrintWriter(client.getOutputStream(),true);

            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String clientInput ;

            while ((clientInput = input.readLine()) != null){

                System.out.println("Server Client Input "+clientInput);
                LocalDate date = LocalDate.now();
                LocalTime time = LocalTime.now();

                String formattedInput = String.format("SERVER RESPONSE: %s %S %S", clientInput,date,time);
                output.write(formattedInput.toUpperCase());

                if(clientInput.equalsIgnoreCase("bye")) break;
            }

            System.out.println("Sever exited ");

        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }

    }
}

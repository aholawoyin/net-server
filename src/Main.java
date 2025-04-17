import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*InetAddress ipAddress = InetAddress.getLocalHost();

        System.out.println("HostName :"+ipAddress.getHostName()+" Host Address: "+ipAddress.getHostAddress());

        InetAddress[] inetAddresses = InetAddress.getAllByName("www.x.com");
        for (InetAddress address : inetAddresses) {
            System.out.println("Host Name="+address.getHostName()+"  Host Address: "+address.getHostAddress());
        }*

         */

        ServerSocketDemo.StartServer();
    }
}
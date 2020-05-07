import java.net.InetAddress;
import java.net.UnknownHostException;

public class DemoInetAdddress {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress Address= InetAddress.getLocalHost();// not using constructor but a factory method
        System.out.println("LocalHost: "+Address);

        Address=InetAddress.getByName("www.gmail.com");
        System.out.println(Address);

        InetAddress []sw= InetAddress.getAllByName("www.facebook.com");
        for(int i=0;i<sw.length;i++){
            System.out.println(sw[i]);
        }
    }
}

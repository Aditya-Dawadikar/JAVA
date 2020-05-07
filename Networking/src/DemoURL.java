import java.net.MalformedURLException;
import java.net.URL;

public class DemoURL {
    public static void main(String []args) throws MalformedURLException {
        URL hp= new URL("http://pccoe.acm.org/aboutacm.html");
        System.out.println("protocol:"+ hp.getProtocol());
        System.out.println("Port:"+hp.getPort());
        System.out.println("Host:"+hp.getHost());
        System.out.println("File:"+hp.getFile());
        System.out.println("ext:"+hp.toExternalForm());
    }
}

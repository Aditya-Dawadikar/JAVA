import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoHttpURLConnection {
    public static void main(String args[]) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpcon= (HttpURLConnection)hp.openConnection(); //type casting to HttpURLConnection

        //displaying request method
        System.out.println("request method:"+hpcon.getRequestMethod());

        //display response code
        System.out.println("response code:"+hpcon.getResponseCode());

        //display response message associated with response code
        System.out.println("response message:"+hpcon.getResponseMessage());

        //Get a list of header fields and a set of header keys
        Map<String, List<String>> hdrMap=hpcon.getHeaderFields();
        Set<String> hdrField=hdrMap.keySet();

        System.out.println("here is header");

        //display all header keys and values
        for(String k:hdrField){
            System.out.println("key:"+k+" value:"+hdrMap.get(k));
        }
    }
}

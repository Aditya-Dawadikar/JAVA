import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class DemoURLConnection {
    public static void main(String args[]) throws IOException {
        int c;
        URL hp= new URL("http://www.internic.net");
        URLConnection hpcon=  hp.openConnection();

        //get date
        long d = hpcon.getDate();
        if(d==0){
            System.out.println("no date info");
        }else{
            System.out.println("date:"+new Date(d));
        }

        //get content type
        System.out.println("Content-type:"+hpcon.getContentType());

        //get expiration
        d=hpcon.getExpiration();
        if(d==0){
            System.out.println("no date info");
        }else{
            System.out.println("date:"+new Date(d));
        }

        //get last-modified date
        d=hpcon.getLastModified();
        if(d==0){
            System.out.println("no date info");
        }else{
            System.out.println("date:"+new Date(d));
        }

        //get content length
        long len=hpcon.getContentLengthLong();
        if(len==-1){
            System.out.println("content length unavailable");
        }else{
            System.out.println("Content-length:"+len);
        }

        if(len!=0){
            System.out.println("Content");
            InputStream in= hpcon.getInputStream();
            while((c=in.read())!=-1){
                System.out.println((char)c);
            }
            in.close();
        }else{
            System.out.println("No content available");
        }
    }
}

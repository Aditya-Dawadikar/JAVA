import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DemoSocket {
    public static void main(String args[]) throws Exception {

        //create a socket with host whois.internic.net and port 43
        Socket s= new Socket("whois.internic.net",43);
        int c;

        //create streams on the socket
        InputStream in= s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str= (args.length==0? "OraclePressBooks.com":args[0]+"\n");
        byte buf[] = str.getBytes();

        //send request
        out.write(buf);

        //read and display response
        while((c=in.read())!=-1){
            System.out.println((char) c);
        }
        s.close();
    }
}

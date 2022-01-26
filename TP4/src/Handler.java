import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Handler implements Runnable{
    Socket s;
    String data = " ";
    public Handler(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        try {
            InputStream is = s.getInputStream();
            String s = new String(String.valueOf(is));
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

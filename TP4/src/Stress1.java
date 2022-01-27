import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Stress1 {
    public static void main(String[] args) throws IOException {
        int n = 5000;
        int x = 0;
        String str = "ok le s";
        byte[] bytes = str.getBytes();
        while (x != n){
            Socket s = new Socket("localhost", 1234);
            OutputStream out = s.getOutputStream();
            out.write(bytes);
            x++;
        }
        float time2 = System.nanoTime();
        System.out.println("le temps est : " + time2);
    }
}

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serveur {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(1234);
        while(true) {
            Handler h = new Handler(s.accept());
            h.run();
            System.out.println(h.data);
        }
    }
    }


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(1234);
        Executor executor = Executors.newWorkStealingPool();
        while(true) {
            executor.execute(new Handler(s.accept()));
        }
    }
    }


import com.sun.jdi.LongValue;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Stress1 {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        String str = "ok le S";
        byte[] bytes = str.getBytes();
        float start = System.nanoTime();
        while (x != n){
            Socket s = new Socket("localhost", 1234);
            OutputStream out = s.getOutputStream();
            out.write(bytes);
            s.close();
            x++;
        }
        Long[] tab = new Long[2];
        float finish = System.nanoTime();
        float time = finish - start;
        //tab[0] = new Long(n);
        //tab[1] = time;
        //Data.valeur_sans_close.add(tab);
        //System.out.println("taille de la liste : " + Data.valeur_sans_close.size());
        System.out.println("le temps avec s.close et voleur est : " + time/1000000000 + " pour : " + n );
    }
}

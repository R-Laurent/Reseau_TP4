import com.sun.jdi.LongValue;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Stress1 {
    public static void main(String[] args) throws IOException {
        int n = 2;
        int x = 0;
        String str = "ok le s";
        byte[] bytes = str.getBytes();
        Long start = System.nanoTime();
        while (x != n){
            Socket s = new Socket("localhost", 1234);
            OutputStream out = s.getOutputStream();
            out.write(bytes);
            s.close();
            x++;
        }
        Long[] tab = new Long[2];
        Long finish = System.nanoTime();
        Long time = finish - start;
        tab[0] = new Long(n);
        tab[1] = time;
        Data.valeur_sans_close.add(tab);
        for (int i =0;i<Data.valeur_sans_close.size();i++){
            System.out.println(Data.valeur_sans_close.get(i)[0]);
        }
        System.out.println("taille de la liste : " + Data.valeur_sans_close.size());
        System.out.println("le temps est : " + time );
    }
}

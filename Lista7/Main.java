import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] argv) throws Exception {
int pojemnosc=4;
int pojemnosc_palety=4;
BlockingQueue<Integer> kolejka = new ArrayBlockingQueue<Integer>(pojemnosc);
BlockingQueue<Integer> kolejka2 = new ArrayBlockingQueue<Integer>(pojemnosc_palety);
int liczba_cukiernikow=3;
int liczba_pakowaczy=3;
Cukiernik[] cukierniwcy = new Cukiernik[liczba_cukiernikow];
for(int i=0;i<cukierniwcy.length;i++){
    cukierniwcy[i]=new Cukiernik("Cukiernik "+i,kolejka);
    cukierniwcy[i].start();
}
Pakowacz[] pakowacze = new Pakowacz[liczba_pakowaczy];
for(int i=0;i<pakowacze.length;i++){
    pakowacze[i]=new Pakowacz("Pakowacz"+i,kolejka,kolejka2);
    pakowacze[i].start();
}

        //   for (int i = 0; i<10; i++)
        //  {
        //         kolejka.put(i);
//        }
    }
}
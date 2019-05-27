import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Pakowacz extends Thread {

private BlockingQueue<Integer> kolejka;
private BlockingQueue<Integer> kolejka2;
Random rand = new Random();
public Pakowacz(String nazwa, BlockingQueue<Integer> _kolejka, BlockingQueue<Integer> _kolejka2){
    super(nazwa);
    kolejka=_kolejka;
    kolejka2=_kolejka2;

}
static int liczba_paczek=0;
int licznik=0;
public void run(){
    try {
        sleep(100);
        while (true){
            Integer x = kolejka.take();
            System.out.print(Thread.currentThread().getName()+"Pakowacz zdjal"+x+"wafelkow");
            System.out.print(Thread.currentThread().getName()+"Wlozyl do pudelka wafelek"+ ++licznik);
            sleep(200);
            if (licznik==0){
                liczba_paczek++;
                licznik=0;
                kolejka2.put(liczba_paczek);


            }


        }


        }


    }catch (InterruptedException e){
        e.printStackTrace();
    }


}


}





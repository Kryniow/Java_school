import java.util.Random;
        import java.util.concurrent.BlockingQueue;

public class Cukiernik extends Thread{
    private BlockingQueue<Integer> kolejka;
    Random rand = new Random();
    public Cukiernik(String nazwa, BlockingQueue<Integer>_kolejka){
        super(nazwa);
        kolejka=_kolejka;
    }

    public void run(){
        try {
            while (true){
                Integer x =rand.nextInt(10);
                kolejka.put(x);
                System.out.print(Thread.currentThread().getName()+"cukiernik dal"+x+"wafelkow");
                sleep(100);




            }




        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }



}



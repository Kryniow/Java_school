import java.util.Random;
import java.lang.InterruptedException;
public class Watek extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());


        }


    }


public static void main(String[] args){
    Watek t1 = new Watek();
    t1.setName("Watek 1 ");
    t1.start();
    Watek t2 = new Watek();
    t2.setName("Watek 2 ");
    t2.start();
    Watek t3 = new Watek();
    t3.setName("Watek 3 ");
    t3.start();

        try {

        t1.join();
        t2.join();
        t3.join();
        }
    catch (InterruptedException e){
        e.printStackTrace();

    }
    System.out.print("Koniec programu");



    }


}

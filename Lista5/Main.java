package Lista5;

import java.util.concurrent.Semaphore;

public class Main {
    public static Semaphore sem1 = new Semaphore(0);
    public static Semaphore sem2 = new Semaphore(0);
    public static void main(String[] args) {

        Dane watek1 = new Dane(sem1);
        watek1.start();


        Delta watek2 = new Delta(watek1,sem1,sem2);
        watek2.start();

        Pierwiastki watek3 = new Pierwiastki(watek2,sem2);
        watek3.start();



    }
}

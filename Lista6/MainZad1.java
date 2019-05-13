package Lista6;
import java.util.concurrent.Semaphore;

public class MainZad1 {

    public static Semaphore sem0  = new Semaphore(1);
    public static Semaphore sem1  = new Semaphore(1);
    public static Semaphore sem2  = new Semaphore(1);
    public static Semaphore sem3  = new Semaphore(1);
    public static Semaphore sem4  = new Semaphore(1);
    public static Semaphore lokaj = new Semaphore(4);

    public static void main (String[] args)
    {

        Zad1[] filozof = new Zad1[5];


        filozof[0] = new Zad1(sem0, sem1, lokaj );
        filozof[1] = new Zad1(sem1, sem2, lokaj );
        filozof[2] = new Zad1(sem2, sem3, lokaj );
        filozof[3] = new Zad1(sem3, sem4, lokaj );
        filozof[4] = new Zad1(sem4, sem0, lokaj );

        filozof[0].setName("Filozof 0");
        filozof[1].setName("Filozof 1");
        filozof[2].setName("Filozof 2");
        filozof[3].setName("Filozof 3");
        filozof[4].setName("Filozof 4");

        for(int i=0;i<=4;i++){
            filozof[i].start();

        }




        for(int i=0; i<=4; i++)
        {
            filozof[i].start();
        }
    }
}
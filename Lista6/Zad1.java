package Lista6;
import java.util.concurrent.Semaphore;

public class Zad1 extends Thread
{
    Semaphore lewy, prawy, lokaj;

    Zad1(Semaphore lewy, Semaphore prawy, Semaphore lokaj)
    {
        this.lewy = lewy;
        this.prawy = prawy;
        this.lokaj = lokaj;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                System.out.println(Thread.currentThread().getName() + " mysli");
                Thread.sleep((long) (Math.random() * 1000));

                System.out.println(Thread.currentThread().getName() + " jest glodny");
                lokaj.acquire();

                prawy.acquire();

                System.out.println(Thread.currentThread().getName() + " podniosl prawy widelec");

                lewy.acquire();
                System.out.println(Thread.currentThread().getName() + " podniosl lewy widelec");
                System.out.println(Thread.currentThread().getName() + " je");
                Thread.sleep((long) (Math.random() * 1000));

                System.out.println(Thread.currentThread().getName() + " zjadl");

                lewy.release();
                System.out.println(Thread.currentThread().getName() + " odlozyl lewy widelec");

                prawy.release();
                System.out.println(Thread.currentThread().getName() + " odlozyl prawy widelec");
                lokaj.release();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
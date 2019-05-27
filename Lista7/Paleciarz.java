import java.util.concurrent.BlockingQueue;

public class Paleciarz extends Thread {

    private BlockingQueue<Integer> kolejka2;

    public Paleciarz(String _nazwa, BlockingQueue<Integer> _kolejka2)
    {
        super(_nazwa);
        kolejka2= _kolejka2;
    }

    static int ilosc_na_palecie=0;

    @Override
    public void run() {
        try {
            while (true) {
                Integer x = kolejka2.take();
                System.out.println(Thread.currentThread().getName()
                        + " spakowal na palete " +x + " produktow " + ++ilosc_na_palecie + "/4");

                if (ilosc_na_palecie ==4)
                {
                    ilosc_na_palecie=0;
                    System.out.println("Paleciarz zawozi palete do magazynu");
                }
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Watek1 extends Thread {

    private BlockingQueue<Integer> kolejka1;
    Random rand = new Random();

    public Watek1(String _nazwa, BlockingQueue<Integer> _kolejka1) {
        super(_nazwa);
        kolejka1 = _kolejka1;
    }


    @Override
    public void run() {
        try {
            while (true) {
                Integer x = rand.nextInt(10);
                kolejka1.put(x);

                System.out.println(this.getName() + " wystartował.");

                System.out.println(this.getName() + " polozyl na tasme" + x);
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

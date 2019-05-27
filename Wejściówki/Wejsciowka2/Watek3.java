import java.util.concurrent.BlockingQueue;

public class Watek3 extends Thread {

    private BlockingQueue<Integer> kolejka2;

    public Watek3(String _nazwa, BlockingQueue<Integer> _kolejka2) {
        super(_nazwa);
        kolejka2 = _kolejka2;
    }

    @Override
    public void run() {
        try {

            while (true) {

                int y = kolejka2.take();

                System.out.println(this.getName() + " wystartował.");

                System.out.println(this.getName() + " wzial zmienna y " + y);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
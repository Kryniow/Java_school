import java.util.concurrent.BlockingQueue;

public class Watek2 extends Thread {

    private BlockingQueue<Integer> kolejka1;
    private BlockingQueue<Integer> kolejka2;

    public Watek2 (String _nazwa, BlockingQueue<Integer> _kolejka1, BlockingQueue<Integer> _kolejka2)
    {
        super (_nazwa);
        kolejka1 = _kolejka1;
        kolejka2 = _kolejka2;
    }

    @Override
    public void run() {

        try {
            while (true) {

                int x1 = kolejka1.take();
                int x2 = kolejka1.take();
                int y = (x1*x1)+(x2*x2);


                System.out.println(this.getName() + " wystartował.");

                System.out.println(this.getName() + " wzial z tasmy" + x1 +" , " +x2);


                kolejka2.put(y);

                System.out.println(this.getName() + " polozyl na tasmie " +y);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

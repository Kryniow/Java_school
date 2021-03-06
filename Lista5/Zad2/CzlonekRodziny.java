package Lista5.Zad2;

import java.util.concurrent.Semaphore;

class CzlonekRodziny implements Runnable {
    Semaphore sem;
    int liczbaUrzadzen;

    CzlonekRodziny(int liczbaUrzadzen, Semaphore sem) {

        this.sem = sem;
        this.liczbaUrzadzen = liczbaUrzadzen;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " Nie korzysta z aparatu");
                Thread.sleep((long) (Math.random() * 1000));

                System.out.println(Thread.currentThread().getName() + " Spi");
                Thread.sleep((long) (Math.random() * 1000));

                sem.acquire();

                Thread.sleep((long) (Math.random() * 1000));

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            finally {
                sem.release();
                System.out.println(Thread.currentThread().getName() + " Korzysta z aparatu");
            }
        }
    }
}
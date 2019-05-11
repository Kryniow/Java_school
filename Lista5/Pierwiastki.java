package Lista5;
import java.lang.Math;
import java.util.concurrent.Semaphore;

public class Pierwiastki extends Thread {
    double delta;
    double x1;
    double x2;
    double x0;
    Delta d;
    Semaphore sem2;

    public Pierwiastki(Delta Watek2,Semaphore sem2) {

        this.d = Watek2;
        this.sem2=sem2;
    }

    public void run() {
        try {
            sem2.acquire();
            //System.out.println("Pobrane dane z klasy Delta to: " + d.getA() + " " + d.getB() + " " + d.getC());
            if(d.getDelta()>0) {
                x1 = (((-1 * d.getB()) - (Math.sqrt(d.getDelta()))) / (2 * d.getA()));
                x2 = ((-1 * d.getB()) + (Math.sqrt(d.getDelta()))) / (2 * (d.getA()));

                System.out.println("Pierwiastki x1 i x2 to: " + x1 + " " + x2);

            }
            else if(d.getDelta()==0){
                x0=-d.getB()/2*d.getA();
                System.out.println("Rownanie ma 1 rozwiazania: ");
                System.out.println("X0= "+x0);
            }
            else {
                System.out.println("Brak rozwiazan rowniania w zbiorze liczb rzeczywistych");

            }
            sem2.release();
        } catch (InterruptedException e) {

        }
    }
}






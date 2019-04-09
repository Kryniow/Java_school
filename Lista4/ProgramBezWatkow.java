package Zad2;
import java.util.Random;

public class ProgramBezWatkow {
private  int[] N = new int[5];

    public void wypiszTab() {
        System.out.print("Tablica: ");
        Random rand = new Random();
        for (int i = 0; i < N.length; i++) {
            N[i] = rand.nextInt(N.length);
            System.out.print("" + N[i] + ",");
        }
    }
    public void wypiszMax() {
        int max = N[0];
        for (int i = 0; i < N.length; i++) {
            if (N[i] > max)
                max = N[i];
        }
        System.out.println("Największy element tablicy to :" + max);

    }

    public void wypiszMin() {
        int min = N[0];
        for (int i = 0; i < N.length; i++){
            if (N[i] < min)
                min = N[i];
        }
        System.out.println("\nNajmniejszy element tablicy to: "+min);
    }
    public void sumaTab() {
        double m = 0;
        for (int i=0; i<N.length; i++) {
            m=m+N[i];
        }
        System.out.println("Suma elementow z tablicy: "+m);

    }
public static void main(String[] args){
        ProgramBezWatkow obj1 = new ProgramBezWatkow();
        obj1.wypiszTab();
        obj1.wypiszMin();
        obj1.wypiszMax();
        obj1.sumaTab();
    }


}

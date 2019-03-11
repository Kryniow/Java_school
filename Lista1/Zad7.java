package Lista1;

import java.util.Random;

public class Zad7 {
    private int[] N = new int[100]; //ile ma elementow

    public void wypiszTab() {
        System.out.print("Tablica: ");
        Random rand = new Random();
        for (int i = 0; i < N.length; i++) {
            N[i] = rand.nextInt(N.length);    //dla ilu elementow
            System.out.print("" + N[i] + ",");
        }
    }

    public void wypiszMax() {
        int max = N[0];
        for (int i = 0; i < N.length; i++) {
            if (N[i] > max)
                max = N[i];
        }
        System.out.println("\nNajwiększy element tablicy to :" + max);
    }

    public void wypiszMin() {
        int min = N[0];
        for (int i = 0; i < N.length; i++){
            if (N[i] < min)
                min = N[i];
        }
        System.out.println("Najmniejszy element tablicy to: "+min);
    }
    public void trzyNajwieksze(){
        System.out.print("Trzy największe liczby z tablicy: ");
        int[] max = new int[3];
        for (int i=0; i<max.length; i++) {
            max[i]=0;
            for (int j=0; j<N.length; j++) {
                if ((N[j]>max[i]) && (N[j]!=max[0]) && (N[j]!=max[1]) && (N[j]!=max[2])) {
                    max[i]=N[j];
                }
            }


            System.out.print(max[i]+",");
        }
    }

    public void arymetrycznaTablicy() {
        double m = 0;
        for (int i=0; i<N.length; i++) {
            m=m+N[i];
        }
        m=m/N.length;
        System.out.println("Srednia arytmetyczna: "+m);

    }
    public void wyswietlOdwrocona() {
        System.out.print("\nTablica odwrócona: ");
        for (int i=N.length-1; i>=0; i--) {
            if (i!=0) {
                System.out.print(N[i]+",");
            } else {
                System.out.println(N[i]);
            }
        }
    }

    public static void main (String[] args){
        Zad7 obj = new Zad7();
        obj.wypiszTab();
        obj.wypiszMax();
        obj.wypiszMin();
        obj.arymetrycznaTablicy();
        obj.trzyNajwieksze();
        obj.wyswietlOdwrocona();
    }


}

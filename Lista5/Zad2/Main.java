package Lista5.Zad2;

import java.util.concurrent.Semaphore;

public class Main {

    public static Semaphore sem1 = new Semaphore(1);
    public static void main(String[] args){

        int liczbaurzadzen=1;
        int iloscosob=3;
        Thread[]  rodzina = new Thread[iloscosob];


        for(int i=0; i<iloscosob; i++)
            rodzina[i] = new Thread(new CzlonekRodziny(liczbaurzadzen,sem1), "Czlonek rodziny nr: " + (i+1));


        for(int i=0; i<iloscosob; i++){
            rodzina[i].start();
        }

    }

}

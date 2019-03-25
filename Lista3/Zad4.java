package Lista3;

import java.util.Random;

public class Zad4 extends Thread {

    public void run(){
    for(int i=1;i<=10;i++){
    System.out.println(Thread.currentThread().getName()+" Wartosc: "+i);

    }


}

public static void main(String[] args){

        Zad4 t1 = new Zad4();
        Zad4 t2 = new Zad4();
 Zad4 t3 = new Zad4();
 Zad4 t4 = new Zad4();
 Zad4 t5 = new Zad4();
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
    try {
        Random generator = new Random();
        sleep(1000); }
    catch (InterruptedException e){
        e.printStackTrace();

    }
    System.out.print("Koniec");
    }



}

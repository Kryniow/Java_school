package Zad2;
import java.lang.reflect.WildcardType;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int rozmiarTablicy = odczyt.nextInt();

        int N[] = new int[rozmiarTablicy];
        System.out.print("Wartosci:");
        for (int i = 0; i < N.length; i++) {
            N[i] =i;
            System.out.print(" "+N[i]+",");


        }

        double czas1 = System.nanoTime();

        int podzial=N.length/6;
        Watki watek1 = new Watki(N, 0,podzial);
        watek1.start();

        Watki watek2 = new Watki(N,podzial,podzial*2);
        watek2.start();

        Watki watek3 = new Watki(N, podzial*2,podzial*3);
        watek3.start();

        Watki watek4 = new Watki(N,podzial*3,podzial*4);
        watek4.start();

        Watki watek5 = new Watki(N,podzial*4,podzial*5);
        watek5.start();

        Watki watek6 = new Watki(N,podzial*5,N.length);
        watek6.start();
        try {
            watek1.join();
            watek2.join();
            watek3.join();
            watek4.join();
            watek5.join();
            watek6.join();
        } catch (InterruptedException e) {

        }
        System.out.println("\nNajmniejsza wartość w 1 wątku to: " + watek1.getMin());
        System.out.println("Najmniejsza wartość w 2 wątku to: " + watek2.getMin());
        System.out.println("Najmniejsza wartość w 3 wątku to: " + watek3.getMin());
        System.out.println("Najmniejsza wartość w 4 wątku to: " + watek4.getMin());
        System.out.println("Najmniejsza wartość w 5 wątku to: " + watek5.getMin());
        System.out.println("Najmniejsza wartość w 6 wątku to: " + watek6.getMin());

        System.out.println("Największa wartość w 1 wątku to: " + watek1.getMax());
        System.out.println("Największa wartość w 2 wątku to: " + watek2.getMax());
        System.out.println("Największa wartość w 3 wątku to: " + watek3.getMax());
        System.out.println("Największa wartość w 4 wątku to: " + watek4.getMax());
        System.out.println("Największa wartość w 5 wątku to: " + watek5.getMax());
        System.out.println("Największa wartość w 6 wątku to: " + watek6.getMax());

        double czas2 = System.nanoTime();
        System.out.println("W programie uplynela nastepujaca ilosc czasu: "+((czas2-czas1)/1000000.0));


    }



    }











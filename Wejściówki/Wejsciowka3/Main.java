package com.company;

import java.util.concurrent.Semaphore;

public class Main
{
    public static Semaphore sem1 = new Semaphore(1);
    public static Semaphore sem2 = new Semaphore(0);

    public static void main(String[] args)
    {
        Losowanko watek1 = new Losowanko();
        watek1.start();

        Kwadrat watek2 = new Kwadrat(watek1);
        watek2.start();

    }
}
//    jeden watek losuje liczbe a drugi wyznacza kwadrat tej wylosowanej
//    na semaforach
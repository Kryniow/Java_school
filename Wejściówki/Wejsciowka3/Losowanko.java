package com.company;
import java.util.Random;

public class Losowanko extends Thread
{
    Random obiekt = new Random();
    int wylosowana = 0;
    public void run()
    {
        try
        {

            for (int i = 0; i < 10 ; i++)
            {
                Main.sem1.acquire();
                wylosowana = obiekt.nextInt(10);
                System.out.println("Wylosowana liczba to: " + wylosowana);
                Main.sem2.release();
            }

        }catch(InterruptedException e){}
    }


}
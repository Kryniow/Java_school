package com.company;

public class Kwadrat extends Thread
{
    Losowanko watek1;
    int potega;
    public Kwadrat(Losowanko watek1)
    {
        this.watek1 = watek1;
    }
    public void run()
    {
        try
        {

            for (int i = 0; i <10 ; i++)
            {

                Main.sem2.acquire();
                potega = watek1.wylosowana * watek1.wylosowana;
                System.out.println("Do kwadratu: " + potega);
                Main.sem1.release();
            }


        }catch(InterruptedException e){}

    }

}
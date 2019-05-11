package Lista5;

import java.util.concurrent.Semaphore;

public class Delta extends Thread{
    double delta;
    Dane dane;
    Semaphore sem1;
    Semaphore sem2;
    public Delta(Dane watek1,Semaphore sem1,Semaphore sem2)
    {

        this.dane = watek1;
        this.sem1=sem1;
        this.sem2=sem2;
    }

    public void run()
    {
        try
        {
            sem1.acquire();
            //System.out.println("a,b,c:"+dane.a+" "+dane.b+" "+dane.c);

            delta = (dane.b*dane.b)-4*(dane.a*dane.c);

                System.out.println("Delta wynosi: " + delta);

            sem1.release();
            sem2.release();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }



    }
    public double getDelta()
    {
        return delta;
    }
    public double getA()
    {
              return dane.a;
    }
    public double getB()
    {
        return dane.b;
    }
    public double getC()
    {
        return dane.c;
    }
}

package Lista5;

import java.util.Scanner;
import java.util.concurrent.Semaphore;


public class Dane extends Thread {
    Semaphore sem1;
    double a,b,c;

    public Dane(Semaphore sem1){
        this.sem1=sem1;

    }
void setA(){

        System.out.print("Podaj wartość a: ");
    Scanner odczyt = new Scanner(System.in);
    a=odczyt.nextDouble();
}
void setB(){
    System.out.print("Podaj wartosc b: ");
    Scanner odczyt = new Scanner(System.in);
    b=odczyt.nextDouble();
}
void setC(){
    System.out.print("Podaj wartosc c: ");
    Scanner odczyt = new Scanner(System.in);
    c=odczyt.nextDouble();
}


    public void run()
    {
        try
        {
//            sleep(2000);

            System.out.println("Podaj parametry równania y=ax^2+bx+c");
            setA();
            setB();
            setC();
            System.out.println("Równianie ma postać : a=" + a + ",b=" + b + ",c=" + c);
            sem1.release();
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

    }
    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    public double getC()
    {
        return c;
    }
}
package Lista1;

import java.util.Scanner;

public class Zad6 {


        private double a, b;

        public Zad6(double a, double b) {
            this.a=a;
            this.b=b;
        }

        public double Sum() {
            return a+b;
        }

        public double Diff() {
            return a-b;
        }

        public double Prod() { return a*b; }

        public double Quot() {
            return a/b;
        }


public  static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Podaj dwie liczby (w dwóch linijkach): ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    input.close();


    Zad6 c = new Zad6(a,b);

    System.out.println("Suma: "+c.Sum());
    System.out.println("Różnica: "+c.Diff());
    System.out.println("Iloczyn: "+c.Prod());
    System.out.println("Iloraz: "+c.Quot());
}
}

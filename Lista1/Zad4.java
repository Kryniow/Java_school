package Lista1;

import java.util.Scanner;

public class Zad4 {


double obliczBMI(double masa,double wzrost){
    double wynik;
    wynik=masa/(wzrost*wzrost);
    return wynik;
}

public  static void main(String[] args) {
Zad4 obj = new Zad4();
    double masa,wzrost;
    Scanner wejscie = new Scanner(System.in);
    System.out.print("Podaj mase: ");
    masa=wejscie.nextInt();
    System.out.print("Podaj wzrost: ");
    wzrost=wejscie.nextInt();

System.out.print("Twój BMI wynosi: "+obj.obliczBMI(masa,wzrost));;


}
}

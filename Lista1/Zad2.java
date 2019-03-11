package Lista1;
import java.util.Scanner;
public class Zad2 {
    public void przelicz(){
        double f,c,k,wynik;
        c=30;

        System.out.print("Podaj temperature w skali Celcjusza: ");
        Scanner wejscie = new Scanner(System.in);
        c=wejscie.nextDouble();

        wynik=c*1.8000+32;
        System.out.println("Podana wartosc w skali Farenheita wynosi: "+wynik);

        wynik=c+274.15;
        System.out.print("Podana wartosc w skali Kelvina wynosi: "+wynik);
    }
    public static void main(String[] args) {
    Zad2 obj = new Zad2();
    obj.przelicz();

    }
}

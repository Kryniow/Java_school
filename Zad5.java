package Lista1;

import java.util.Scanner;

public class Zad5 {


    public void liczbaPierwsza() {
        int n;
        System.out.print("Poodaj liczbe do sprawdenia: ");
        Scanner wejscie = new Scanner(System.in);
        n=wejscie.nextInt();

        if ((n<2) && (n%2==1)) {
            System.out.println("Nie jest to liczba pierwsza");
        }
        else{
            System.out.println("Jest to liczba pierwsza");
        }

    }

    public  static void main(String[] args){
        Zad5 obj = new Zad5();
    obj.liczbaPierwsza();
    }
}
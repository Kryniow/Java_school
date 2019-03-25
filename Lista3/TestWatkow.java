package Lista3;

public class TestWatkow {


public static void main(String[] args) {
int tnum=Integer.parseInt(args[0]); //liczbaWatkow
int count= Integer.parseInt(args[1]); //liczbaPowtorzen

//tworzymy obiekt klasy balance
LicznikWatkow licznik = new LicznikWatkow();
//tworzymy i uruchamiamy watki
WatekLiczacy[] thread = new WatekLiczacy[tnum]; //tablica watkow
for (int i=0; i<tnum; i++)
thread[i]=new WatekLiczacy("Watek"+(i+1),licznik,count);
try {

    for (int i = 0; i < tnum; i++) {
        thread[i].join();
    }
}catch (InterruptedException exc) { System.exit(1);}
    System.out.println("Koniec programu");
}

}



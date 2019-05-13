package Lista6;
public class Czytelnik implements Runnable {
    private Bufor bufor;
    public Czytelnik(Bufor _bufor) {bufor = _bufor;}
    @Override public void run()
    { for (int i = 0; i < 10; ++i)
    { System.out.println("Czytelnik odczytuje informacje zgromadzona w czytelni o wartosci = " + bufor.takeFromBuffer());
    }
    }
}
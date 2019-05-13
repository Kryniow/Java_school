package Lista6;
public class Pisarz implements Runnable {
    private Bufor bufor;
    public Pisarz(Bufor _bufor){ bufor = _bufor; }
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Pisarz zapisuje informacje = "+ i);
            bufor.addToBuffer(i);
        }
    }
}

package Lista6;
        import Lista6.Bufor;

public class Main {
    public static void main(String[] args) {
        Bufor bufor = new Bufor(3);
        (new Thread(new Pisarz(bufor))).start();
        (new Thread(new Czytelnik(bufor))).start();
    }
}


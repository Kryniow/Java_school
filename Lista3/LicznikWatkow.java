package Lista3;

public class LicznikWatkow {
private  int wartoscKrytyczna;

public synchronized int policzMnie() {
    wartoscKrytyczna ++;
    try {
        Thread.sleep(300);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    //w tym miejscu nastepuje przylaczenie watkow,watek dodaje 1 ale nie zdazyl odjac
    wartoscKrytyczna--;
    return wartoscKrytyczna;

}

}

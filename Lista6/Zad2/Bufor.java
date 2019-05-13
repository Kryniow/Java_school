package Lista6;
public class Bufor {
    public enum STATE {
        EMPTY, OPEN, FULL
    }

    private int values[];
    private int firstItem = 0;
    private int lastItem = 0;
    private int numberOfItems = 0;
    private int bufferSize;
    private STATE currentState = STATE.EMPTY;

    public Bufor(int bufferSize) {
        this.bufferSize = bufferSize;
        values = new int[bufferSize];
    }

    public synchronized void addToBuffer(int value) {
// Warunek poczatkowy - (strażnik metody)
        while (!((currentState.equals(STATE.EMPTY)) ||
                (currentState.equals(STATE.OPEN)))) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
// Dodanie elementu do bufora
        System.out.println("item " + value + " added to buffer");
        values[lastItem] = value;
        lastItem = (lastItem + 1) % bufferSize;
        numberOfItems = numberOfItems + 1;
// Warunek końcowy - do zmiany statusu
        if ((currentState.equals(STATE.OPEN)) && (numberOfItems >= bufferSize)) {
            currentState = STATE.FULL;
            notifyAll();
        } else if (currentState.equals(STATE.EMPTY)) {
            currentState = STATE.OPEN;
            notifyAll();
        }
    }

    public synchronized int takeFromBuffer() {
        int value;
// Warunek poczatkowy - (strażnik metody)
        while (!((currentState.equals(STATE.FULL)) ||
                currentState.equals(STATE.OPEN))) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
// Pobranie wartosci z bufora
        value = values[firstItem];
        System.out.println("item " + value + " taken from buffer");
        firstItem = (firstItem + 1) % bufferSize;
        numberOfItems = numberOfItems - 1;
// Warunek końcowy - do zmiany statusu
        if ((currentState.equals(STATE.OPEN)) && (numberOfItems <= 0)) {
            currentState = STATE.EMPTY;
            notifyAll();
        } else if (currentState.equals(STATE.FULL)) {
            currentState = STATE.OPEN;
            notifyAll();
        }
// Return the value taken from the buffer.
        return value;
    }
}
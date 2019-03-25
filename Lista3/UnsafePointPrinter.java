package Lista3;
import Lista3.Przyklad2;

public class UnsafePointPrinter {
    public void print(Przyklad2 p) {
        System.out.println(
                "Wspolzedne punktu: x = "
                        + p.x() + ", y = " + p.y() + ".");
    }

    public static void main(String[] args){
        UnsafePointPrinter obj1 = new UnsafePointPrinter();


    }

}
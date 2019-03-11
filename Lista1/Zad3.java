package Lista1;
import java.util.Scanner;
public class Zad3 {

        private int N;

        public Zad3(int N) {
            this.N=N;
        }

        public int getN() {
            return N;
        }

        public int Suma() {
            int s = 0;
            for (int i=1; i<=N; i++) {
                if (i%7==0) s=s+i;
            }
            return s;
        }


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Podaj liczbe: ");
            Zad3 d = new Zad3(input.nextInt());

            input.close();

            System.out.print("Suma liczb w zakresie 1-"+d.getN()+" podzielnych przez 7 wynosi "+d.Suma());

        }
}

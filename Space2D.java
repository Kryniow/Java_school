
package Lista2;
public class Space2D {
    double x, y;

    Space2D() {
        x = 0.0;
        y = 0.0;


    }

    Space2D(double x, double y) {
        this.x = x;
        this.y = y;


    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {

        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {

        return y;
    }

    public void wyswietlPunkty() {

        System.out.println("Wartosc x: " + x + " Wartosc y " + y);

    }

    public double obliczDystans(Space2D b) {

        return Math.sqrt(Math.pow(b.getX() - x, 2) + Math.pow(b.getY() - y, 2));
    }

    public double obliczDystansZero() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


    public String toString() {

        return new String("[" + x + "," + y + "]");
    }

    public double obliczObwod(Space2D b, Space2D c) {
        return obliczDystans(b) + obliczDystans(c) + b.obliczDystans(c);
    }

    public double obliczPole(Space2D b, Space2D c) {
        final double p = obliczObwod(b, c)/2;
        return Math.sqrt(p*(p-obliczDystans(b))*(p-obliczDystans(c))*(p-b.obliczDystans(c)));
    }


}

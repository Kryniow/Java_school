package Lista2;

public class SpaceTest extends Space3D {


    public static void main(String[] args){

        SpaceTest t1 = new SpaceTest();
        t1.setX(1.0);
        t1.setY(2.0);

        System.out.println(""+t1.getX());
        System.out.println(""+t1.getY());
        t1.wyswietlPunkty();
        t1.obliczDystans(2);
        t1.obliczObwod();
        t1.obliczPole();

        System.out.println(""+t1.getZ());


        t1.obliczDystansZero();
        t1.toString();
        t1.obliczObwod();
        t1.obliczPole();
        t1.obliczDystans();
        t1.obliczObwod();
        t1.obliczPole();

    }

}

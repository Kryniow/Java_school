package Lista1;

import java.util.Random;

public class Zad8 {

    int [] tab = new int[10];
    int [] tab2 = new int[10];
    int [] tab3 = new int[10];
    int [] maxk = new int[3];
    int max1,max2,max3;

    public  Zad8() {
    }
    public void wypiszTab1() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            tab[i] = rand.nextInt(100);
         max1 = tab[0];
        for (int i = 0; i < 10; i++) {
            if (tab[i] > max1)
                max1 = tab[i];
        }
        System.out.println("Największy element 1 tablicy to :" + max1);
    }

    public void wypiszTab2() {
        Random rand = new Random();
        for(int i=0; i<10; i++)
            tab[i]=rand.nextInt(100);
            int max2=tab[0];
            for(int i=0;i<10;i++){
                if(tab[i]>max2)
                    max2=tab[i];
            }
            System.out.println("Największy element 2 tablicy to: "+max2);
        }

    public void wypiszTab3() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            tab[i] = rand.nextInt(100);
             max3 = tab[0];
            for (int i = 0; i < 10; i++) {
                if (tab[i] > max3)
                    max3 = tab[i];

            }
            System.out.println("Największy element 3 tablicy to: " + max3);

    }


    void maxTablic() {

        maxk[0] = max1;
        maxk[1] = max2;
        maxk[2] = max3;
        int maxim = maxk[0];
        for (int i = 0; i < 3; i++)
        {
            if (maxk[i]>maxim)
                maxim=maxk[i];

        }
        System.out.println("Największy element z 3 tablic to :"+maxim);

    }


    public static void main(String[] args) {
    Zad8 obj = new Zad8();
    obj.wypiszTab1();
    obj.wypiszTab2();
    obj.wypiszTab3();
    obj.maxTablic();
    }

}

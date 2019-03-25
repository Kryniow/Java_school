package Lista3;
import java.lang.Thread;
public class Watek extends Thread{

    public void run(){
        for(int i=0;i<10;i++){

            System.out.println("Wykonuje się: "+currentThread().getName());

        }


    }



}

package Lista3;

public class Test extends Watek {


    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.setName("1 watek");
        t2.setName("2 watek");
        t3.setName("3 watek");
        t1.start();
        t2.start();
        t3.start();


    }


}

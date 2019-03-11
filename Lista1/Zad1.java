package Lista1;

public class Zad1 {
    public  Zad1(){

    }
    public void wysHelloWorld(){
        System.out.println("Hello world");
    }
    public void rysStrzalke() {
        for (int i = 0; i < 6; i++) {
                for(int j=0;j<6-i;j++){

                    System.out.print(" ");
                }
                    for(int k=0;k<(2*i)+1;k++)
                    System.out.print("*");
                    System.out.println();
        }
                for(int t=0;t<3;t++){
                    System.out.println("\t  *");
                }

    }
public  static  void  main(String[] args){
        Zad1 obj = new Zad1();
        obj.wysHelloWorld();
        obj.rysStrzalke();
}

}

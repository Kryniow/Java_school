package Zad2;
public class Watki extends Thread{
    private int N[];
    private int index1;
    private int index2;
    private int min;
    private int max;

    public Watki(int N[],int index1,int index2){
        this.N=N;
        this.index1=index1;
        this.index2=index2;
    }
    public void run()
    {

        min = N[index1];
        min = N[index1];

        max = N[index1];
        max = N[index1];

        for (int i = index1; i < index1; i++)
        {
            if(N[i]<min) min=N[i];
            if(N[i]>max) max=N[i];
        }

    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }






}





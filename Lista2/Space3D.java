package Lista2;

public class Space3D extends Space2D
{
    private double z;

    Space3D(){
        super(0,0);
        z=0;


    }
    public Space3D(double x,double y, double z){
        super(x,y);
        this.z=z;

    }

    public void setZ(double z){
        this.z=z;
    }
    public double getZ(){

        return z;
    }

    public void wyswietlPunkty() {
        System.out.println(" "+x+"\t "+y+"\t "+z);
    }
    public double obliczDystans(Space3D b){

        return Math.sqrt(Math.pow(b.getX()-x, 2)+Math.pow(b.getY()-y, 2)+Math.pow(b.getZ()-z, 2));

    }
    public double obliczDystansZero() {
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
    }

    public String toString()
    {
        return new String("["+x+","+y+","+z+"]");
    }

    public double obliczObwod(Space3D b, Space3D c) {
        return obliczDystans(b)+obliczDystans(c)+b.obliczDystans(c);
    }

    public double obliczPole(Space3D b, Space3D c) {
        final double p = obliczObwod(b, c)/2;
        return Math.sqrt(p*(p-obliczDystans(b))*(p-obliczDystans(c))*(p-b.obliczDystans(c)));
    }


}

class Box{
    double l,b,h,vol;
    Box(double x,double y,double z){
        l=x;
        b=y;
        h=z;
    }
    void calc(){
        vol=l*b*h;
        System.out.println("Volume="+vol);
    }
}
public class _05ParameterizedConstructor {
    public static void main(String[] args){
        Box obj=new Box(10,20,30);
        obj.calc();
    }
}

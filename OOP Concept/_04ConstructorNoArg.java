class Box{
    double l,b,h,vol;
    Box(){
        l=10;
        b=20;
        h=30;
    }
    void calc(){
        vol=l*b*h;
        System.out.println("Volume="+vol);
    }
}
public class _04ConstructorNoArg {
    public static void main(String[] args){
        Box obj=new Box();
        obj.calc();
    }
}

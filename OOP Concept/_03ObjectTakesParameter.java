class Box{
    double width,height,depth,vol;
    void getdata(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double calc(){
        vol=width*height*depth;
        return vol;
    }
}
public class _03ObjectTakesParameter {
    public static void main(String[] args){
        Box obj=new Box();
        obj.getdata(10,20,30);
        double res=obj.calc();
        System.out.println("volume="+res);
    }
}

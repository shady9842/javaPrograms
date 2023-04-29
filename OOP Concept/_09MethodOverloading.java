public class _09MethodOverloading {
    int multiply(){
        int a=10,b=20;
        int c=a*b;
        return c;
    }
    void multiply(int d,int e){
        int f=e*d;
        System.out.println(f);
    }
    void multiply(double h,double g){
        double i=h*g;
        System.out.println(i);
    }
    public static void main(String[] args) {
        _09MethodOverloading obj=new _09MethodOverloading();
        int j=obj.multiply();
        System.out.println(j);
        obj.multiply(5,15);
        obj.multiply(12.2,13.3);
    }
}

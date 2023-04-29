class Ad{
    void callme(){
        System.out.println("Inside Ad's call me method");
    }
}
class Bd extends Ad{
    //override call me
    void callme(){
        System.out.println("Inside Bd's call me method");
    }
}
class Cd extends Ad{
    void callme(){
        System.out.println("Inside Cd's call me method");
    }
}
public class _18DynamicMethodDispatch {
    public static void main(String[] args) {
        Ad a=new Ad();
        Bd b=new Bd();
        Cd c=new Cd();
        Ad r;       //obtain a reference of type Ad
        r=a;        //r refers to an Ad object
        r.callme(); //calls Ad's version of call me
        r=b;
        r.callme();
        r=c;
        r.callme();
    }
}

class A{
    int a,b,sum;
    public int add(){
        a=10;
        b=15;
        sum=a+b;
        return sum;
    }
}
public class _02ObjectRetValue {
    public static void main(String[] args){
        A obj = new A();
        int res=obj.add();
        System.out.println("Result="+res);
    }
}

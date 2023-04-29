interface interface3{
    int a=20,b=10;
    void add();
}
class Ax{
    int diff;
    void subtract(int x,int y){
        diff=x-y;
        System.out.println("Subtraction= "+diff);
    }
}
class Bx extends Ax implements interface3{
    int sum;
    public void add(){
        sum=a+b;
        System.out.println("Addition= "+sum);
    }
}
public class _17MultipleInheritance2 {
    public static void main(String[] args) {
        Bx obj=new Bx();
        obj.add();
        obj.subtract(100, 33);
    }
}

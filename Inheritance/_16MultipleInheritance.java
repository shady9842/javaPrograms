interface interface1{
    void display1();
}
interface interface2{
    void display2();
}
class classa{
    void display3(){
    System.out.println("This is a class");
    }
}
class classb extends classa implements interface1,interface2{
    public void display1(){
        System.out.println("Inside interface1");
    }
    public void display2(){
        System.out.println("Inside interface2");
    }
}
public class _16MultipleInheritance{
    public static void main(String[] args) {
        classb obj=new classb();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
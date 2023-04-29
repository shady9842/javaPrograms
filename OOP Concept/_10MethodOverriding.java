class human{
    public void eat(){
        System.out.println("Human is eating.");
    }
}
public class _10MethodOverriding extends human{
    public void eat(){
        System.out.println("Boy is eating");
    }
    public static void main(String[] args) {
        _10MethodOverriding obj=new _10MethodOverriding();
        obj.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Food");
    }
}
class dog extends Animal{
    void consume(){
        System.out.println("Meat");
    }
}
class cow extends Animal{
    void intake(){
        System.out.println("Grass");
    }
}
public class _14HierarchicalInheritance {
    public static void main(String[] args) {
        dog d=new dog();
        d.consume();
        d.eat();
        cow c=new cow();
        c.intake();
    }
    
}

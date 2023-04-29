class person1{
    person1(){
        System.out.println("person class constructor");
    }
}
class student1 extends person1{
    student1(){
        super();
        System.out.println("student class constructor");
    }
}
public class _21SuperWithConstructor {
    public static void main(String[] args) {
        student1 s=new student1();
    }    
}

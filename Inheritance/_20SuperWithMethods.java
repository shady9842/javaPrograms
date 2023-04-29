class person{
    void message(){
        System.out.println("This is a person class");
    }
}
class student extends person{
    void message(){
        System.out.println("This is a student class");
    }
    void display(){
        message();
        super.message();
    }
}
public class _20SuperWithMethods {
    public static void main(String[] args) {
        student s=new student();
        s.display();
    }
}

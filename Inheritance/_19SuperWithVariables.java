class vehicle1{
    int maxspeed=120;
}
class car1 extends vehicle1{
    int maxspeed=180;
    void display(){
        System.out.println("Maximum speed= "+super.maxspeed);
    }
}
public class _19SuperWithVariables {
    public static void main(String[] args) {
        car1 obj=new car1();
        obj.display();
    }
}

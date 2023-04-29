class Vehicle{
    void operates(){
        System.out.println("Vehicle operates on fuel.");
    }
}
class Bus extends Vehicle{
    void runs(){
        System.out.println("Bus runs on diesel.");
    }
}
class Bike extends Bus{
    void work(){
        System.out.println("Bike works using petrol.");
    }
}
public class _13MultilevelInheritance {
    public static void main(String[] args) {
       Bike obj= new Bike();
        obj.operates();
        obj.runs();
        obj.work();
    }
}

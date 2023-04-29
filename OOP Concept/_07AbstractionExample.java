abstract class car{
    void start(){
        System.out.println("Car starts with key");
    }
}
public class _07AbstractionExample extends car{
    public static void main(String[] args){
        _07AbstractionExample obj=new _07AbstractionExample();
        obj.start();
    }
}

   

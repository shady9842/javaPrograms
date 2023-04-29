class threadA implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running thread "+i+" from class A");
        }
        System.out.println("Exit from class A");
    }
}
class threadB implements Runnable{
    public void run(){
        for (int j = 1; j <= 5; j++) {
            System.out.println("Running thread "+j+" from class B");
        }
        System.out.println("Exit from class B");
    }
}
public class _02CreationByRunnableInterface {
    public static void main(String[] args) {
        Thread t1=new Thread(new threadA());
        Thread t2=new Thread(new threadB());
        t1.start();
        t2.start();
    }
}

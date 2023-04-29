class threadA extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running thread "+i+" from class A");
        }
        System.out.println("Exit from class A");
    }
}
class threadB extends Thread{
    public void run(){
        for (int j = 1; j <= 5; j++) {
            System.out.println("Running thread "+j+" from class B");
        }
        System.out.println("Exit from class B");
    }
}
class threadC extends Thread{
    public void run(){
        for (int k = 1; k <= 5; k++) {
            System.out.println("Running thread "+k+" from class C");
        }
        System.out.println("Exit from class C");
    }
}
public class _05ThreadPriority {
    public static void main(String[] args) {
        threadA t1=new threadA();
        threadB t2=new threadB();
        threadC t3=new threadC();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority((t2.getPriority()+1));
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}

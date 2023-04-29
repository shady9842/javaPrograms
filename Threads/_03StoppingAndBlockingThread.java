class threadA extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running thread "+i+" from class A");
            if(i==4)
                stop();
        }
        System.out.println("Exit from class A");
    }
}
class threadB extends Thread{
    public void run(){
        for (int j = 1; j <= 5; j++) {
            System.out.println("Running thread "+j+" from class B");
            if(j==3){
                try{
                    sleep(1000);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        System.out.println("Exit from class B");
    }
}
public class _03StoppingAndBlockingThread {
    public static void main(String[] args) {
        new threadA().start();
        new threadB().start();
    }
}

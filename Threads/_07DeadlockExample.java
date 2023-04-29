class myThread{
    String resource1="BCA";
    String resource2="Third Semester";
    void MethodA(){
        synchronized(resource1){
            System.out.println("Thread 1: Locked resource 1");
            try{
                Thread.sleep(100);
            }catch(Exception e){

            }
        }
        synchronized (resource2){
            System.out.println("Thread 1:locked resource 2");
        }
    }
    void MethodB(){
        synchronized(resource2){
            System.out.println("Thread 2: Locked resource 2");
            try{
                Thread.sleep(100);
            }catch(Exception e){

            }
        }
        synchronized (resource1){
            System.out.println("Thread 2:locked resource 1");
        }
    }
}
public class _07DeadlockExample {
    public static void main(String[] args) {
        myThread obj=new myThread();
        new Thread(){
        public void run(){
            obj.MethodA();            }
        }.start();
        new Thread(){
            public void run(){
                obj.MethodB();            }
            }.start();
    }
}

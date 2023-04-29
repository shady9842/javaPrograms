class threadA extends Thread{
    synchronized void deposit(int amt){
        System.out.println("Deposited completed with rs "+amt);
    }
    synchronized void withdraw(int amt){
        System.out.println("Withdraw completed with rs "+amt);
    }
}

public class _04SynchronizationThread {
    public static void main(String[] args) {
        threadA obj=new threadA();
        new Thread(){
            public void run(){
                obj.deposit(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                obj.withdraw(10000);
            }
        }.start();
    }
}

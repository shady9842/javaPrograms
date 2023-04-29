class threadD{
    int amount=10000;
    synchronized void withdraw(int amt){
        System.out.println("Going to withdraw");
        if(amount<amt){
            System.out.println("Less Balance: waiting for deposit");
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);    
            }
        }
        amount-=amt;
        System.out.println("withdraw completed with rs: "+amt);
        System.out.println("balance is rs: "+amount);
    }
    synchronized void deposit(int amt){
        System.out.println("Going to deposit...");
        amount+=amt;
        System.out.println("deposit completed with rs. "+amt);
        System.out.println("balance is rs: "+amount);
        notify();
    }
}
public class _06InterThreadCommunication {
    public static void main(String[] args) {
       threadD obj=new threadD();
       new Thread(){
        public void run(){
            obj.withdraw(15000);
        }
       }.start();
       new Thread(){
        public void run(){
            obj.deposit(10000);
        }
       }.start();
    }
}

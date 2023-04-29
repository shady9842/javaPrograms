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

class _01ExtendingThreadClass{
    public static void main(String[] args) {
        new threadA().start();
        new threadB().start();
    }
}
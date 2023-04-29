public class _06ThrowsException {
    int division(int a,int b) throws ArithmeticException{
        int t=a/b;
        return t;
    }
    public static void main(String[] args) {
        _06ThrowsException obj=new _06ThrowsException();
        try{
            System.out.println(obj.division(15,0));
        }
        catch(Exception e){
            System.out.println("Division by zero is indefinite");
        }
    }    
}

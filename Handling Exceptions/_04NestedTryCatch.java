public class _04NestedTryCatch {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Dividing by zero");
                int a=5/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[]=new int[5];
                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println("Handeled");
        }
        System.out.println("Normal Flow");
    }
    
}

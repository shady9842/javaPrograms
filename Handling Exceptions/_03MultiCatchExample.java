public class _03MultiCatchExample {
    public static void main(String[] args) {
        try{
            int arr[]=new int[7];
            arr[8]=30/6;
            System.out.println("Last statement of try block");
        }
        catch(ArithmeticException e1){
            System.out.println("Division by zero is undefined."+e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Accessing array elements outside of limit"+e2);
        }
        catch(Exception e3){
            System.out.println("Parent exception occurs");
        }
    }
}

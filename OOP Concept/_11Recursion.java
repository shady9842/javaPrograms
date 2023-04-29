import java.util.*;
class factorial{
    int fact(int n){
        
        if (n==1)
            return 1;
        else
        return (n*fact(n-1));
    }
}
public class _11Recursion {
    public static void main(String[] args) {
        factorial obj=new factorial();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        System.out.println("Factorial of "+ x +" is: " +obj.fact(x));
        sc.close();    
    }    
}

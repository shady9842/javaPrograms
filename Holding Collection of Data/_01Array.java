import java.util.Scanner;

class _01Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
           
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        int i,max=a[0],min=a[0];
        for (i = 1; i < 5; i++) {
            if(a[i]>max)
                max=a[i];
        }
        for (i = 1; i < 5; i++) {
            if(a[i]<min);
                min=a[i];
        }
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
    }
}
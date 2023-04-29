import java.util.Scanner;
public class _02Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input name,age,phone no. and CGPA");
        String name=sc.nextLine();
        int age=sc.nextInt();
        long phoneNo = sc.nextLong();
        double cgpa=sc.nextDouble();
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Phone NO.: "+phoneNo);
        System.out.println("CGPA: "+cgpa);
        sc.close();
    }
}

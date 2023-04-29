public class _04StringConversion {
    public static void main(String[] args) {
        int a=4;
        double b=2.5;
        //converting to string
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println(s1);
        System.out.println(s2);

        
        String s3="10";
        String s4="11.5";
        //converting to integer and double
        int c=Integer.parseInt(s3);
        double d=Double.parseDouble(s4);
        System.out.println(c);
        System.out.println(d);
    }
}

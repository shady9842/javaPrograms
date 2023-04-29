public class _03NumberClass {
    public static void main(String[] args) {
        //creating a double class object
        Double d=new Double(22.22);

        //converting this Double object to different primitive data types

        byte b=d.byteValue();
        short s=d.shortValue();
        int i=d.intValue();
        long l=d.longValue();
        float f=d.floatValue();
        double d1=d.doubleValue();

        System.out.println("Value of d after converting it to byte:"+b);
        System.out.println("Value of d after converting it to short:"+s);
        System.out.println("Value of d after converting it to int:"+i);
        System.out.println("Value of d after converting it to long:"+l);
        System.out.println("Value of d after converting it to float:"+f);
        System.out.println("Value of d after converting it to double:"+d1);
    }
    
}

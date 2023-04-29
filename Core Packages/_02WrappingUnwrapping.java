//Autoboxing and Unboxing

public class _02WrappingUnwrapping {
    public static void main(String[] args) {
        
        //wrapping int to Integer
        int a=10;
        Integer obji=new Integer(a);

        //wrapping double to Double
        double b=5.5;
        Double objd=new Double(b);

        char c='x';
        Character objc=new Character(c);

        System.out.println("After wrapping:");
        System.out.println("Integer="+obji);
        System.out.println("Double="+objd);
        System.out.println("Character="+objc);

        //unwrapping Integer into int
        int a1=obji;

        //unwrapping Double to double
        double b1=objd;

        //unwrapping Character to char
        char c1=objc;

        System.out.println("After Unwrapping:");
        System.out.println("int="+a1);
        System.out.println("double="+b1);
        System.out.println("char="+c1);
    }
}

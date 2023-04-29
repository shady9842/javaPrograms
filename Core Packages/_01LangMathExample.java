import java.lang.Math;
class _01LangMathExample{
    public static void main(String[] args) {

        //abs method
        int v1=-101;
        System.out.println("Absolute value="+Math.abs(v1));

        //acos,asin,atan
        double v2=0.5;
        System.out.println("Asin value= "+Math.asin(v2));
        System.out.println("Acos value= "+Math.acos(v2));
        System.out.println("tan value= "+Math.atan(v2));

        //square root,cube root
        System.out.println("Square root of 25= "+Math.sqrt(25));
        System.out.println("Cube root of 27= "+Math.cbrt(27));

        //floor value,ceil value
        double v3=11.11;
        System.out.println("floor value= "+Math.floor(v3));
        System.out.println("Ceil value= "+Math.ceil(v3) );


    }
}
public class _11StringBuffer {
    public static void main(String[] args) {

        //append
        StringBuffer sb1=new StringBuffer("Hello ");
        sb1.append("Saugat");
        System.out.println("append: "+sb1);

        //insert
        StringBuffer sb2=new StringBuffer("Always  fuck");
        sb2.insert(7,"don't");
        System.out.println("insert: :"+sb2);

        //replace
        StringBuffer sb3=new StringBuffer("Always fuck");
        sb3.replace(7, 11, "Luck");
        System.out.println("Replace: " +sb3);

        //delete and deleteCharAt
        StringBuffer sb4=new StringBuffer("Badluck");
        sb4.delete(1, 4);
        System.out.println("delete: "+sb4);
        StringBuffer sb5=new StringBuffer("Holes");
        sb5.deleteCharAt(2);
        System.out.println("deleteCharAt: "+sb5);
        
        //reverse
        StringBuffer sb6=new StringBuffer("Love");
        System.out.println("reverse: "+sb6.reverse());
        
        //charAt and setCharAt
        StringBuffer sb7=new StringBuffer("NoLove");
        System.out.println("original: "+sb7);
        System.out.println("charAt(1):"+sb7.charAt(1));
        StringBuffer sb8=new StringBuffer("NoLove");
        sb8.setCharAt(3, 'i');
        System.out.println("After setChar: "+sb8);
        
        //setLength
        StringBuffer sb9=new StringBuffer("NoLove");
        sb9.setLength(2);
        System.out.println("setLength: "+sb9);

        //length and capacity
        StringBuffer sb10= new StringBuffer("NoFuck");
        System.out.println("Length: "+sb10.length());
        System.out.println("Capacity: "+sb10.capacity());

    }
}

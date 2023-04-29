public class _09SearchingStrings {
    public static void main(String[] args) {
        String s="Look, if you had one shot or one opportunity to seize everything you ever wanted,in one moment, would you capture it or just let it slip";
        System.out.println(s);
        System.out.println("indexOf(t)= "+s.indexOf('t'));
        System.out.println("lastIndexOf(t)= "+s.lastIndexOf('t'));
        System.out.println("indexOf(one)= "+s.indexOf("one"));
        System.out.println("lastIndexOf(one)= "+s.lastIndexOf("one"));
        System.out.println("indexOf(t)= "+s.indexOf('t',40));
        System.out.println("lastIndexOf(t)= "+s.lastIndexOf('t',60));
        System.out.println("indexOf(one)= "+s.indexOf("one",30));
        System.out.println("lastIndexOf(one)= "+s.lastIndexOf("one",30));
    }
    
}

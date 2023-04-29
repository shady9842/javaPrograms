public class _08EqualsStringCompare {
    public static void main(String[] args) {
        String s1="Saugat";
        String s2="Sijala";
        String s3=new String("sijala");
        String s4="Saugat";
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
    }
}

public class _10StringModification {
    public static void main(String[] args) {
        //substring
        String s1="Javapoint";
        System.out.println(s1.substring(2,4));
        System.out.println(s1.substring(2));

        //replace
        String s2="get the fuck out";
        System.out.println(s2.replace('f', 'b'));
        System.out.println(s2.replace("fuck", "freak"));

        //trim->eliminates leading and trailing spaces
        String s3="      Saugat Gautam";
        System.out.println(s3);
        System.out.println(s3.trim());
    }
    
}

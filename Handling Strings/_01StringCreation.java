class _01StringCreation{
    
    public static void main(String[] args) {
        //Using String Literal
        String s1="String Created using String Literal";
        System.out.println(s1);
        //By new Keyword
        char ch[]={'n','e','w'};
        String s2=new String(ch);//converting char array into string
        System.out.println(s2);
        String s3=new String("Saugat");
        System.out.println(s3);

    }
}
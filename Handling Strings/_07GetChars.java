class _07GetChars{
    public static void main(String[] args) {
        String s="Example of getChars method";
        int start=11,end=14;
        char buff[]=new char[end-start];
        s.getChars(start, end, buff, 0);
        System.out.println(buff);
    }
}
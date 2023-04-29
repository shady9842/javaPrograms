class _02FinallyBlockExample{
    public static void main(String[] args) {
        try{
            int a[]=new int[10];
            System.out.println(+a[11]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown:"+e);
        }
        finally{
            System.out.println("Inside finally block");
        }
        System.out.println("outside finally block");
    }
}
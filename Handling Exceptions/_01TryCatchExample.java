class _01TryCatchExample{
    public static void main(String[] args) 
    /* {
        try{
            int a[]=new int[10];
            System.out.println("Access element 3:"+a[11]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown:"+e);
        }
        System.out.println("Out of block");
    } */
    {
        try{
            int a=100/0;
        }catch(ArithmeticException e){
            System.out.println("Exception thrown:" +e);
        }
        System.out.println("You shound not divide a number by zero.");
    }
}

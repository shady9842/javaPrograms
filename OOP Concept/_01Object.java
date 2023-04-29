class Demo{
    int a=10;   //data member
    String b="Saugat";  //data member
    void show(){  //method
        System.out.println(a+" "+b);
    }
}
class _01Object{
    public static void main(String[] args) {
        Demo obj1=new Demo(); //creating instance of class Demo
        obj1.show();    //calling member function using object
    }
}
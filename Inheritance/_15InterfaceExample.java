interface in1{
    final int a=10;
    void display();
}
class _15InterfaceExample implements in1{
    public void display(){
        System.out.println("Geek");
    }
    public static void main(String[] args) {
        _15InterfaceExample obj=new _15InterfaceExample();
        obj.display();
        System.out.println(a);
    }
}
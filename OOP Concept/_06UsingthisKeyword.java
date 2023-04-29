class Test{
    int a,b;
    Test(int x,int y){
        this.a=x;
        this.b=y;
    }
    void display(){
        System.out.println("a="+a+"b="+b);
    }
}
public class _06UsingthisKeyword {
    public static void main(String[] args){
        Test obj=new Test(10,20);
        obj.display();
    }
}

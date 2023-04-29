class Student{
    private String sname;
    private int sid;
    public void setSname(String xy){
        sname=xy;
    }
    public void setSid(int id){
        sid=id;
    }
    public String getSname(){
        return sname;
    }
    public int getSid(){
        return sid;
    }
}
public class _08EncapsulationExample {
    public static void main(String[] args){
        Student obj=new Student();
        obj.setSname("saugat");
        obj.setSid(60);
        System.out.println("Student name: "+obj.getSname());
        System.out.println("Student id: "+obj.getSid());
    }
}

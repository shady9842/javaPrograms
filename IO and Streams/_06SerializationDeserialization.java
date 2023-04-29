import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
    int id;
    String name;
    public student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class _06SerializationDeserialization {
    public static void main(String[] args) {
        try{
            student s1=new student(1, "saugat");
            FileOutputStream fout=new FileOutputStream("saugat.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("object is written to file");
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("saugat.txt"));
            student s=(student)in.readObject();
            System.out.println("Students object: "+s.id+" "+s.name);
            in.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

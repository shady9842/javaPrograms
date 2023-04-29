import java.util.ArrayList;

public class _05ArrayList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Initial size of al: "+al.size());

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(1,"A2");

        System.out.println("Size of array after addition "+al.size());
        System.out.println("Contents of al: "+al);
        
        
        al.remove("B");
        al.remove(3);
 
        System.out.println("Size of array after deletion "+al.size());
        System.out.println("Contents of al: "+al);
        
    }
    
}

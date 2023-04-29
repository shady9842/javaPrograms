import java.util.LinkedList;

public class _06LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        System.out.println("Initial size of ll: "+ll.size());

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add(1,"A2");

        System.out.println("Size of array after addition "+ll.size());
        System.out.println("Contents of ll: "+ll);
        
        
        ll.remove("B");
        ll.remove(3);
 
        System.out.println("Size of array after deletion "+ll.size());
        System.out.println("Contents of ll: "+ll);
    }
    
}

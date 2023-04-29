import java.util.Dictionary;
import java.util.Hashtable;

public class _07DictionaryExample {
    public static void main(String[] args) {
        
        //initializing a dictionary
        Dictionary geek=new Hashtable();

        //put() method
        geek.put(1, "saugat");
        geek.put(2, "shraddha");

        //get() method
        System.out.println("Value at key 6= "+geek.get(6));
        System.out.println("value at key 1= "+geek.get(1));

        //isEmpty() method
        System.out.println(" "+geek.isEmpty());

        //remove() method
        System.out.println("Remove: "+geek.remove(1));
        System.out.println(geek);

        System.out.println("Size of  dictionary:"+geek.size());
    }
}

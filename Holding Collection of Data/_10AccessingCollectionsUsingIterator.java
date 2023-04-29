import java.util.HashSet;
import java.util.Iterator;

public class _10AccessingCollectionsUsingIterator {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("Saugat");
        hs.add("Dipak");
        hs.add("Jason");

        System.out.println("Iterating over list");
        Iterator<String> i=hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _04SetInterface {
    public static void main(String[] args) {
        Set<String> obj=new HashSet<String>();

        obj.add("saugat");
        obj.add("Shraddha");
        obj.add("saugat");
        obj.add("random");
        obj.add("word");
        
        System.out.println("set without duplicates");
        System.out.println(obj);

        //set demonstration using Treeset
        System.out.println("Sorted set after passing into Treeset");
        Set<String> treeset=new TreeSet<String>(obj);
        System.out.println(treeset);


    }
}

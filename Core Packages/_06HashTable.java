import java.util.Hashtable;

public class _06HashTable {
    public static void main(String[] args) {
        //create a new hashtable
        Hashtable hash=new Hashtable<>();

        //put some elements
        hash.put(1,"vodka");
        hash.put(2,"Rum");
        hash.put(3,"beer");
        System.out.println(hash);
        System.out.println("getting value of key 2: "+hash.get(2));

        //remove
        hash.remove(1);
        System.out.println(hash);
    }
}

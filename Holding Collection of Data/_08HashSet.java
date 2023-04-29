import java.util.HashSet;

public class _08HashSet {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("Saugat");
        hs.add("Dipak");
        hs.add("Jason");

        System.out.println(hs);
        System.out.println("List contains Saugat or not?-> "+hs.contains("Saugat"));
        
        hs.remove("Jason");
        System.out.println("List after removing Jason:"+hs);
        
    }
    
}

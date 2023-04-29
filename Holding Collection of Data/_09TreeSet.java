import java.util.TreeSet;

public class _09TreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("Saugat");
        ts.add("Dipak");
        ts.add("Jason");
        ts.add("Saugat");

        System.out.println(ts);
        System.out.println("List contains Saugat or not?-> "+ts.contains("Saugat"));
        
        ts.remove("Jason");
        System.out.println("List after removing Jason:"+ts);
        
    }
}

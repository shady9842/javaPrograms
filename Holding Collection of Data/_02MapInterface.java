import java.util.HashMap;
import java.util.Map;

public class _02MapInterface {
    public static void main(String[] args) {
        Map<String,String> geek=new HashMap<String,String>();

        geek.put("11","Saugat");
        geek.put("12","Khom");

        System.out.println("Value at key 12: "+geek.get("12"));

        System.out.println(geek.isEmpty());

        System.out.println("remove:"+geek.remove("12"));
        System.out.println(geek);

        System.out.println("Size of Map:"+geek.size());
    }
    
}
